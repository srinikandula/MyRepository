package com.samples.divya;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import com.examples.srini.Student;

import java.io.File;

public class XMLParseDOM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		try{
			
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse("src/com/samples/divya/Details.xml");
	
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("student");
		System.out.println("-----------------------");
 
		for (int temp = 0; temp < nList.getLength(); temp++) {
 
		   Node nNode = nList.item(temp);
		   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 		      Element eElement = (Element) nNode;
 		      
 		      //Student e = new Student();
 		      System.out.println(getTagValue("name", eElement));		      
 		      System.out.println(getTagValue("id", eElement));
		      System.out.println(getTagValue("Dept", eElement));
		      System.out.println(getTagValue("year", eElement));
		      
		     
		   }
		}
	  } catch (Exception e) {
		e.printStackTrace();
	  }
 }

 private static String getTagValue(String sTag, Element eElement) {
	NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
   Node nValue = (Node) nlList.item(0);
	return nValue.getNodeValue();
 }


}

