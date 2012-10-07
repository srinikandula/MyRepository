package com.examples.srini;

import java.lang.reflect.Method;

public class TestReflection {
	static{
		try {
			Class cl = Class.forName("com.examples.srini.TestReflection");
			Method[] methods = cl.getDeclaredMethods();
			for(Method m : methods){
				if(m.getName().startsWith("set")){
					Class[] paramTypes = m.getParameterTypes();
					if(paramTypes.length == 1){
						System.out.println(paramTypes[0]);
					}else{
						System.out.println("too many params for "+m.getName());
					}
					
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("this is main");
	}
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
