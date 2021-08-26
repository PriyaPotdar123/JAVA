package com.project.factorymethod;

public class ObjectmakerFactory {
	public Os makeobject(String obj)
	{
		if(obj=="secure")
			return (new Macios());
		if(obj=="power")
			return new Androidos();
		else
			return new Linux();
	}

}

