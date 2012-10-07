package com.samples.ashwini;

/*import java.io.File;*/
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {

 public static void main(String argv[]) {

  try {
 /* File file = new File("accounts.xml");*/
  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
  Document doc = dBuilder.parse("accounts.xml");
  doc.getDocumentElement().normalize();
  System.out.println("Root element " + doc.getDocumentElement().getNodeName());
  NodeList nodeLst = doc.getElementsByTagName("account");
  System.out.println("Information of all accounts");

  for (int s = 0; s < nodeLst.getLength(); s++) {

    Node idNode = nodeLst.item(s);
    
    if (idNode.getNodeType() == Node.ELEMENT_NODE) {
  
           Element idElmnt = (Element) idNode;
      NodeList idElmntLst = idElmnt.getElementsByTagName("id");
      Element idElmnt1 = (Element) idElmntLst.item(0);
      NodeList fstNm = idElmnt.getChildNodes();
      System.out.println("id : "  + ((Node) fstNm.item(0)).getNodeValue());
      NodeList nameElmntLst = idElmnt1.getElementsByTagName("name");
      Element nameElmnt = (Element) nameElmntLst.item(0);
      NodeList name = nameElmnt.getChildNodes();
      System.out.println("name : " + ((Node) name.item(0)).getNodeValue());
      NodeList balanceElmntLst = idElmnt1.getElementsByTagName("balance");
      Element balanceElmnt = (Element) nameElmntLst.item(0);
      NodeList balance = balanceElmnt.getChildNodes();
      System.out.println("balance : " + ((Node) balance.item(0)).getNodeValue());
    }

  }
  } catch (Exception e) {
    e.printStackTrace();
  }
 }

/*private static String getTagValue(String sTag, Element eElement) {
	NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
    Node nValue = (Node) nlList.item(0);
 	return nValue.getNodeValue();
  }
 */
}