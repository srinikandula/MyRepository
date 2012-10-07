package com.examples.srini;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class XMLParseDOMExplained {
 
	public static void main(String argv[]) {
 
	  try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse("myNote.xml");
	
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("employee");  // Node/Element/Tag
		System.out.println("-----------------------");
 
		for (int temp = 0; temp < nList.getLength(); temp++) {
 
		   Node nNode = nList.item(temp); // employee node 
		   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 		      Element eElement = (Element) nNode;//employee element
 		    
 		     NodeList deptTags = eElement.getElementsByTagName("Dept");
 		     //System.out.println("Depatment found "+deptTags.getLength());
 			for(int i = 0;i< deptTags.getLength();i++){
 				Node deptTag = (Node) deptTags.item(i);//all department tags
 				NodeList values = deptTag.getChildNodes();
 				System.out.println(values.item(0).getNodeValue());
 			}
 			System.out.println("Names_____________");
 			 NodeList nameTags = eElement.getElementsByTagName("name");
 		     //System.out.println("Depatment found "+deptTags.getLength());
 			for(int i = 0;i< nameTags.getLength();i++){
 				Node nameTag = (Node) nameTags.item(i);//all department tags
 				NodeList values = nameTag.getChildNodes();
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