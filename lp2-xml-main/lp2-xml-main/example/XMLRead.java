import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o arquivo XML: ");
        String arquivoXML = scanner.nextLine();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(arquivoXML);
            document.getDocumentElement().normalize();
            Element root = document.getDocumentElement();
            System.out.println("Elemento raiz: " + root.getNodeName());

            NodeList nomeList = document.getElementsByTagName("Nome");
            System.out.println("Nome: " + nomeList.item(0).getTextContent());
            NodeList sobrenomeList = document.getElementsByTagName("Sobrenome");
            System.out.println("Sobrenome: " + sobrenomeList.item(0).getTextContent());
            NodeList emailList = document.getElementsByTagName("Email");
            System.out.println("Email: " + emailList.item(0).getTextContent());
            NodeList logradouroList = document.getElementsByTagName("Logradouro");
            System.out.println("Logradouro: " + logradouroList.item(0).getTextContent());
            NodeList numeroList = document.getElementsByTagName("Numero");
            System.out.println("Numero: " + numeroList.item(0).getTextContent());
            NodeList bairroList = document.getElementsByTagName("Bairro");
            System.out.println("Bairro: " + bairroList.item(0).getTextContent());
            NodeList cidadeList = document.getElementsByTagName("Cidade");
            System.out.println("Cidade: " + cidadeList.item(0).getTextContent());
            NodeList paisList = document.getElementsByTagName("Pais");
            System.out.println("Pais: " + paisList.item(0).getTextContent());
            NodeList nacionalidadeList = document.getElementsByTagName("Nacionalidade");
            System.out.println("Nacionalidade: " + nacionalidadeList.item(0).getTextContent());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}