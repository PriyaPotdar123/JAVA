package com.NewSpring.ListInSpring;
import java.util.List;

public class Librariess 
{
	private List<Librarie> List_oflibraries;


	public List<Librarie> getList_oflibraries() 
	{
		return List_oflibraries;
	}
	
	public void setList_oflibraries(List<Librarie> list_oflibraries) {
		this.List_oflibraries = list_oflibraries;
	}
	
	public void showLibraries()
	{
		System.out.println("********************");
			for (int i =0;i<List_oflibraries.size();i++)
			{
				List_oflibraries.get(i).showbook();
				System.out.println("********************");
			}
	}

}
