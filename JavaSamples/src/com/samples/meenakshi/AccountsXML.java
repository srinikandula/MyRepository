package com.samples.meenakshi;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class AccountsXML {
 
public static void main(String argv[]) {
	try {
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse("myAccounts.xml");
	
	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("accounts");
	System.out.println("-----------------------");
	
	for (int temp = 0; temp < nList.getLength(); temp++) {
 
	  Node nNode = nList.item(temp);//all department tags
	  	if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 		 Element eElement = (Element) nNode;
 		
 	System.out.println("Id's-----------------");
 		NodeList idTags = eElement.getElementsByTagName("id");
 	 		
	for(int i = 0;i< idTags.getLength();i++){
 	 	
		Node idTag = (Node) idTags.item(i);//all department tags
 	 	NodeList values = idTag.getChildNodes();
 	System.out.println(values.item(0).getNodeValue());
 			}
 			
 	System.out.println("Names-----------------");
 		NodeList NameTags = eElement.getElementsByTagName("Name");

 	for(int i = 0;i< NameTags.getLength();i++){
 		Node NameTag = (Node) NameTags.item(i);//all department tags
 		NodeList values = NameTag.getChildNodes();
 	System.out.println(values.item(0).getNodeValue());
 		}
 	System.out.println("Balance---------------");
 		NodeList BalanceTags = eElement.getElementsByTagName("Balance");

 	for(int i = 0;i< BalanceTags.getLength();i++){
 		Node BalanceTag = (Node) BalanceTags.item(i);//all department tags
 		NodeList values = BalanceTag.getChildNodes();
 	System.out.println(values.item(0).getNodeValue());
 		}
 		   }
 		}
 	  } catch (Exception e) {
 		e.printStackTrace();
 	  }
}
	}
 		   
 			
/*private static String getTagValue(String sTag, Element eElement) {
	NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
    Node nValue = (Node) nlList.item(0);
 	return nValue.getNodeValue();
  }
}*/

