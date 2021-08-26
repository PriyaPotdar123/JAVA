package com.project.Adapterpattern;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]){  
		  CreditCard targetInterface=new BankCustomer();  
		  targetInterface.giveBankDetails();  
		  System.out.print(targetInterface.getCreditCard());  
}
}
