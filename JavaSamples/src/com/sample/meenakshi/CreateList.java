package com.sample.meenakshi;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
 
public class CreateList {
  public static void main(String[] args) {
    
    String[] strArray = new String[]{"1","2","3","4","5"};
    List ls = Arrays.asList(strArray);
    
    Iterator it = ls.iterator();
    System.out.println("List created from an Array Object,");
    
    while(it.hasNext())
      System.out.println(it.next());
   
  }
}


