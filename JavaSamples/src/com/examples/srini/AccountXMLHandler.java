package com.examples.srini;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AccountXMLHandler extends DefaultHandler {
	boolean isId = false;
	boolean isName = false;
	boolean isBalance = false;
	
	@Override
	public void startElement(String uri, String localName, String qName,Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + qName);

		if (qName.equalsIgnoreCase("id")) {
			isId = true;
		}

		if (qName.equalsIgnoreCase("name")) {
			isName = true;
		}

		if (qName.equalsIgnoreCase("balance")) {
			isBalance = true;
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		System.out.println("End Element :" + qName);

	}
	@Override
	public void characters(char ch[], int start, int length)
			throws SAXException {

		if (isId == true) {
			System.out.println("id : " + new String(ch, start, length));
			isId = false;
		}

		if (isName) {
			System.out.println("Name : " + new String(ch, start, length));
			isName = false;
		}

		if (isBalance) {
			System.out.println("Balance : " + new String(ch, start, length));
			isBalance = false;
		}
	}
}
