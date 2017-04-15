package xmlreader;

/**
 *
 * @author Gustavo
 */
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLReader {

    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File file = new File("C:\\Users\\Gustavo\\Documents\\NetBeansProjects\\XMLReader\\src\\xmlreader\\Marvel.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        String name = document.getElementsByTagName("name").item(0).getTextContent();
        String power = document.getElementsByTagName("power").item(0).getTextContent();
        String disguise=document.getElementsByTagName("disguise").item(0).getTextContent();
        
        System.out.println(name+", "+power+", "+disguise);
    }

}
