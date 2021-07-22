package com.NewSpring.ListInSpring;
import java.util.List;


public class Librarie 
{
	private List<Book> bookList;

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void showbook()
	{   
		System.out.println("-------------------------------------------------");
		for (int i =0;i<bookList.size();i++)
		{
			bookList.get(i).show();
			System.out.println("-------------------------------------------------");
		}
	}
}
