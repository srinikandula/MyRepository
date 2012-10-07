package com.examples.srini;
import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTTransformer {



	    /**
	     * Simple transformation method.
	     * @param sourcePath - Absolute path to source xml file.
	     * @param xsltPath - Absolute path to xslt file.
	     * @param resultDir - Directory where you want to put resulting files.
	     */
	    public static void transform(String xmlFile,String xslFile,String outputFile) {
	        TransformerFactory tFactory = TransformerFactory.newInstance();
	        try {
	        	StreamSource xslt = new StreamSource(new File(xslFile));
	        	StreamSource xml = new StreamSource(new File(xslFile));
	        	StreamResult output = new StreamResult(new File(outputFile));
	        	
	            Transformer transformer = tFactory.newTransformer(xslt);

	            transformer.transform(xml, output);
	            System.out.println();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static void westinTransform() {
	        TransformerFactory tFactory = TransformerFactory.newInstance();
	        try {
	        	StreamSource xslt = new StreamSource(new File("westin.xsl"));
	        	StreamSource xml = new StreamSource(new File("email.xml"));
	        	StreamResult output = new StreamResult(new File("westinoutput.html"));
	        	
	            Transformer transformer = tFactory.newTransformer(xslt);

	            transformer.transform(xml, output);
	            System.out.println();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static void main(String[] args) {
	       /* //Set saxon as transformer.
	        System.setProperty("javax.xml.transform.TransformerFactory",
	                           "net.sf.saxon.TransformerFactoryImpl");
*/
	    	File f = new File("output.html");
	    	
	    	transform("email.xml","sheraton.xsl","outputsherton.html");
	    	transform("email.xml","westin.xsl","outputsherton.html");
	    	

	    }
	}


