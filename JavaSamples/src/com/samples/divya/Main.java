package com.samples.divya;

public class Main {
 public static void main(String[] args){
	
	 EmployeeDAO employee = new EmployeeDAO();
     Employee emp = new Employee();
     emp.setId(03);
     emp.setFirstName("George");
     emp.setLastName("Washington");
     emp.setAddress("Suite-12");
     emp.setStreet("ParkAve");
     emp.setCity("NewYork");
     emp.setState("NY");
     Employee em = new Employee();
     em.setId(04);
     em.setFirstName("Andreana");
     
     // Deleting Data
     employee.delete(02);
     // Updating Data
     employee.update(em);
     // Displaying Data
     employee.findEmployee();
	 
 }
}
