package com.samples.ashwini;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDomparse2 {
	 
	public static void main(String argv[]) {
 
	  try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse("accounts.xml");
	
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("account");  
		System.out.println("-----------------------");
 
		for (int temp = 0; temp < nList.getLength(); temp++) {
 
		   Node nNode = nList.item(temp); 
		   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 		      Element eElement = (Element) nNode;//employee element
 		     System.out.println("id_____________");
 		     NodeList idTags = eElement.getElementsByTagName("id");
 			for(int i = 0;i< idTags.getLength();i++){
 				Node idTag = (Node) idTags.item(i);//all department tags
 				NodeList values = idTag.getChildNodes();
 				System.out.println(values.item(0).getNodeValue());
 			}
 			System.out.println("Names_____________");
 			 NodeList nameTags = eElement.getElementsByTagName("name");
 		 
 			for(int i = 0;i< nameTags.getLength();i++){
 				Node nameTag = (Node) nameTags.item(i);
 				NodeList values = nameTag.getChildNodes();
 				System.out.println(values.item(0).getNodeValue());
 			}
 			System.out.println("balance_____________");
			 NodeList balanceTags = eElement.getElementsByTagName("balance");
		     
			for(int i = 0;i< balanceTags.getLength();i++){
				Node balanceTag = (Node) balanceTags.item(i);
				NodeList values = balanceTag.getChildNodes();
				System.out.println(values.item(0).getNodeValue());
			}
		   }
		}
	  } catch (Exception e) {
		e.printStackTrace();
	  }
  }
 
  /*private static String getTagValue(String sTag, Element eElement) {
	NodeList empChildren = eElement.getElementsByTagName(sTag);
	for(int i = 0;i< empChildren.getLength();i++){
		Node nValue = (Node) empChildren.item(i);
		System.out.println(nValue.getNodeValue());
	}
	
 	
  }*/
 
}
