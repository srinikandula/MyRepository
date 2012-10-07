package com.examples.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Order {
	private String id;
	private String name;
	private String category;
	private String crap;

	public String getCrap() {
		return crap;
	}
	public void setCrap(String crap) {
		this.crap = crap;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		Method methods[] = Order.class.getDeclaredMethods();
		StringBuffer buff = new StringBuffer();
		for(Method method:methods){
			Object obj = null;
			if(method.getName().startsWith("get")){
				Object[] objs = new Object[2];
				
				try {
					obj = method.invoke(this, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//if(obj != null)
					buff.append(method.getName().substring(3)+" "+(obj == null?"'NOVALUE'":obj.toString()));
			}
		}
		return buff.toString();
	}
	
}
