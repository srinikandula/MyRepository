package com.examples.srini;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class AccountXMLSAXParser {

	public static void main(String argv[]) {

		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse("accounts.xml", new AccountXMLHandler());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
