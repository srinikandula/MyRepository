/*
 * Created on Aug 5, 2005
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package roseindia.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import java.util.*;


import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.criterion.*;

import roseindia.web.common.UsersList;

import roseindia.dao.hibernate.*;



//Java Imports
import java.sql.*;


public class SpringHibernateDAOImpl extends HibernateDaoSupport implements
		SpringHibernateDAO {

	
//check admin login 

	public boolean checkUserLogin(String strUserName, String strPassword) throws DataAccessException,java.sql.SQLException{
		boolean valid = false;
		Object obj[] = {strUserName,strPassword};
		List data = getHibernateTemplate().find(" from Login l where l.loginid = ? and l.password = ?", obj);
		if(data != null && data.size() > 0)
			return true;
		else return false;
		
		
	}

	
	public void addUser(Login obj) throws DataAccessException{
		getHibernateTemplate().save(obj);
}

public void updateUser(Login obj) throws DataAccessException{
		getHibernateTemplate().update(obj);
}


public Login loadUser(String id) throws DataAccessException{
	//return getHibernateTemplate().find("from roseindialocal.dao.hibernate.Article obj where obj.id = '" + id + "'");
			return (Login) getHibernateTemplate().get(Login.class,new Integer(id));
}
	
public boolean checkValidUserName(String strUserid) throws DataAccessException,java.sql.SQLException{
	boolean valid = false;
	Object obj[] = {strUserid};
	List data = getHibernateTemplate().find(" from Login l where l.loginid= ?", obj);
	if(data != null && data.size() > 0)
		return true;
	else return false;	
	
}


//get latest jobs
public Collection getUsersList()throws DataAccessException,java.sql.SQLException{
	List data = getHibernateTemplate().find(" from Login l");
	return data;
}

public int getUserId(String strUserid) throws DataAccessException,java.sql.SQLException{
	
	Object obj[] = {strUserid};
	List data = getHibernateTemplate().find(" from Login l where l.loginid= ?", obj);
	if(data != null && data.size() > 0){
		return ((Login)data.get(0)).getId();
	}
	else return 0;	
}

// retrive user forget password
public String[] retriveUserForgetPassword(String strUserName, String strEmail) throws DataAccessException,java.sql.SQLException{
	//boolean valid = false;
	
	
	
	
	Connection conn = this.getSession().connection();
	//Write jdbc code to validate the user against database
	Statement smt = conn.createStatement();
	
	ResultSet rs;
	String query;
	
	
	//write select query for checking password 
	 
    if(strUserName != ""){
	          
              query="select password,email,loginid from login where loginid='"+strUserName+"'";

	     }else{
	          query="select password,email,loginid from login where email='"+strEmail+"'";
         }
	
	rs=smt.executeQuery(query);
	

     
    String[] returnValues = new String[3];  
	 
        
    
 	while(rs.next()){
	
 		
 			
	 		returnValues[0]=rs.getString("password");
			
	 		returnValues[1]=rs.getString("email"); 
 		
	 		returnValues[2]=rs.getString("loginid"); 
 			 
		
 	}
 	
 	smt.close();
 	rs.close();
 	conn.close();
 	
 	if(returnValues[0] != null){
 		 
 		return returnValues;
 	
 	}	else{
 		String[] errorValues = new String[2];  
 		errorValues[0]="error";
 		return errorValues;
 	}
}

@Override
public void deleteProduct(Product product) {
	getHibernateTemplate().delete(product);
}


@Override
public void saveProduct(Product product) {
	getHibernateTemplate().save(product);	
	
}
@Override
public void updateProduct(Product product) {
	getHibernateTemplate().save(product);	
	
}


@Override
public List<Product> getAllProducts() {
	return getHibernateTemplate().find("from Product");
}

// 


}
