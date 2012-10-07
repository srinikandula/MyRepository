package com.samples.ashwini;

	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;

	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import org.w3c.dom.Node;
	import org.w3c.dom.NodeList;
	 
	public class XMLReader1 {
	 
		public static void main(String argv[]) {
	 
		  try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse("accounts.xml");
		
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("employee");
			System.out.println("-----------------------");
	 
			for (int temp = 0; temp < nList.getLength(); temp++) {
	 
			   Node nNode = nList.item(temp);
			   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 		      Element eElement = (Element) nNode;
	 		    /*
	 		     for(int i =0; i< toTags.getLength();i++){
	 		    	Node toNode = toTags.item(i);
	 		    	NodeList toValues = toNode.getChildNodes();
	 		    	for(int j =0;j<toValues.getLength();j++){
	 		    		System.out.println(" value    "+toValues.item(j).getNodeValue());
	 		    	}
	 		     }*/
	 		     /* System.out.println("Name  : " + getTagValue("name", eElement));
			      System.out.println("Id : " + getTagValue("id", eElement));
		          System.out.println("Dept : " + getTagValue("Dept", eElement));
			      System.out.println("Designation : " + getTagValue("Designation", eElement));*/
			      Account1 e = new Account1();
			      e.setId(getTagValue("id", eElement));
			      e.setName(getTagValue("name", eElement));
			      e.setBalance(getTagValue("balance", eElement));
			     
			      
			      System.out.println(e);
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
