package com.project.factorymethod;

public class App 
{
    public static void main( String[] args )
    {
    	ObjectmakerFactory mf = new ObjectmakerFactory();
    	Os obj= mf.makeobject("power");
    	System.out.println(obj.spec());
    }
}
