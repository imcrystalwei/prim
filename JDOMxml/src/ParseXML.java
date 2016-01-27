import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

public class ParseXML {
	public static void main(String[] args) {

	  SAXBuilder builder = new SAXBuilder();
	  File xmlFile = new File("2784500.xml");

	  try {

		Document document = (Document) builder.build(xmlFile);
		Element rootNode = document.getRootElement();
		Element child1 = (Element)rootNode.getChildren("fr-bibliographic-data").get(0);

		//for (int i = 0; i < list.size(); i++) {

		   //Element node1 = (Element) child1.get(0);

		System.out.println("invention-title : " + child1.getChildText("invention-title"));
		Element child1_1 = (Element)child1.getChildren("parties").get(0);
		Element child1_1_1 = (Element)child1_1.getChildren("applicants").get(0);
		Element child1_1_1_1 = (Element)child1_1_1.getChildren("applicant").get(0);
		Element child1_1_1_1_1 = (Element)child1_1_1_1.getChildren("addressbook").get(0);
		System.out.println("last-name : " + child1_1_1_1_1.getChildText("last-name"));
		//Element child1_1 = (Element)child1.getChildren("parties");
		//System.out.println("parties : " + node.getChildren("parties").get(0));
		   //System.out.println("Nick Name : " + node.getChildText("nickname"));
		   //System.out.println("Salary : " + node.getChildText("salary"));

		//}

	  } catch (IOException io) {
		System.out.println(io.getMessage());
	  } catch (JDOMException jdomex) {
		System.out.println(jdomex.getMessage());
	  }
	}
}