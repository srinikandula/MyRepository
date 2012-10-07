package com.adobe.remoteobjects;
import java.util.Date;

public class RemoteServiceHandler {
	public RemoteServiceHandler(){
		//This is required for the Blaze DS to instantiate the class
	}
	
	public String getResults(String name){
		String result = "Hi " + name + ", this is a service and the time now is : " + new Date();
		return result;
	}
}