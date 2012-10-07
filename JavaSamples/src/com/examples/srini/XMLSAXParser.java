package com.examples.srini;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
 
public class XMLSAXParser {
 
   public static void main(String argv[]) {
 
    try {
 
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
 
	
 
       saxParser.parse("c:\\file.xml", new EmployeeXMLHandler());
 
     } catch (Exception e) {
       e.printStackTrace();
     }
 
   }
 
}
