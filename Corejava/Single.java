package Corejava;

public class Single {
	private static Single sig = null;
	public String s;
	private Single()
	{
		s="it is used to restrict other class to create object";
	}	
	
	public static Single getinstance()
	{
		if(sig==null)
		{
			sig=new Single();
		}
		return sig;
	}

}
