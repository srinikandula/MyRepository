package roseindia;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.StringUtils;

public class SimpleLogin{
	String loginname = "";
	String password ;
	String loginVal;
	String grade;
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getLoginVal() {
		return loginVal;
	}

	public void setLoginVal(String loginVal) {
		this.loginVal = loginVal;
	}

	public SimpleLogin(){}

	public String getLoginname(){
		return loginname;
	}

	public void setLoginname(String loginname){
		this.loginname = loginname;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String CheckValidUser() throws HttpException, IOException{
		GetMethod getMethod = new GetMethod("http://localhost:8080/JersySample/login?userName="+getLoginname()+"&password="+getPassword());
	    HttpClient client = new HttpClient();
	    try {
	        int result = client.executeMethod(getMethod);
	        System.out.println("Response status code: " + result);
	        System.out.println(" Response body: "+getMethod.getResponseBody().toString()); 
	        System.out.println("Response headers:");	        
	        Header[] headers = getMethod.getResponseHeaders();	        
	        for (int i = 0; i < headers.length; i++) {
	        	System.out.println(headers[i].toString());
	        }
	        return "success";
	    } finally {
	    	getMethod.releaseConnection();
	    }
	}
	public void validateLoginName(FacesContext context,UIComponent component, Object object) throws Exception{
		System.out.println("Here you go validator");
		if(object == null ||  object.toString().equalsIgnoreCase("error")){
			throw new Exception("Error is sent");
		}
	}
}