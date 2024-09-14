import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLWrite {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite o logradouro: ");
        String logradouro = scanner.nextLine();

        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o país: ");
        String pais = scanner.nextLine();

        System.out.print("Digite a nacionalidade: ");
        String nacionalidade = scanner.nextLine();

        try {

            // Cria uma instância de DocumentBuilderFactory

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Cria um DocumentBuilder

            DocumentBuilder builder = factory.newDocumentBuilder();

            // Cria um novo documento XML
            Document document = builder.newDocument();

            // Cria o elemento raiz
            Element rootElement = document.createElement("Pessoa");
            document.appendChild(rootElement);

            // Cria e adiciona elementos filho
            Element nomeElement = document.createElement("Nome");
            nomeElement.appendChild(document.createTextNode(nome));
            rootElement.appendChild(nomeElement);

            Element sobrenomeElement = document.createElement("Sobrenome");
            sobrenomeElement.appendChild(document.createTextNode(sobrenome));
            rootElement.appendChild(sobrenomeElement);

            Element emailElement = document.createElement("Email");
            emailElement.appendChild(document.createTextNode(email));
            rootElement.appendChild(emailElement);

            Element logradouroElement = document.createElement("Logradouro");
            logradouroElement.appendChild(document.createTextNode(logradouro));
            rootElement.appendChild(logradouroElement);

            Element numeroElement = document.createElement("Numero");
            numeroElement.appendChild(document.createTextNode(numero));
            rootElement.appendChild(numeroElement);

            Element bairroElement = document.createElement("Bairro");
            bairroElement.appendChild(document.createTextNode(bairro));
            rootElement.appendChild(bairroElement);

            Element cidadeElement = document.createElement("Cidade");
            cidadeElement.appendChild(document.createTextNode(cidade));
            rootElement.appendChild(cidadeElement);

            Element paisElement = document.createElement("Pais");
            paisElement.appendChild(document.createTextNode(pais));
            rootElement.appendChild(paisElement);

            Element nacionalidadeElement = document.createElement("Nacionalidade");
            nacionalidadeElement.appendChild(document.createTextNode(nacionalidade));
            rootElement.appendChild(nacionalidadeElement);

            // Cria um Transformer para converter o documento para XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("pessoa.xml");

            // Escreve o documento XML para o arquivo

            transformer.transform(source, result);

            System.out.println("Arquivo XML criado com sucesso!");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}