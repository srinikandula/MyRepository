package com.samples.divya;
import java.util.Scanner;

public class IsPrime{
	
	public boolean Test(int a){
	
	boolean temp=true;
	if(a==1)
	{
	return false;
	}
	for(int i=2;i<=a;i++)
	{
	if(i!=1&&i!=a)
	{
	int tempResult=a%i;
	if(tempResult==0)
	{
	temp=false;
	}
	}
	}
	return temp;
	}

	public static void main(String[]args)
	{
	IsPrime myIsPrime=new IsPrime();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter an int value");
	int response = s.nextInt();
	boolean result=myIsPrime.Test(response);

	if(result==true)
	{
	System.out.println("This is a prime number");
	}
	else
	{
	System.out.println("This is not a prime number");
	}
	}
	}