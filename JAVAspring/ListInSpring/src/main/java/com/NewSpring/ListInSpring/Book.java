package com.NewSpring.ListInSpring;


public class Book
{
	private int id;
	private String title;
	private String author;
	private String publicationdate;
	private long price;
	
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public String getPublicationdate()
	{
		return publicationdate;
	}
	
	public void setPublicationdate(String publicationdate) 
	{
		this.publicationdate = publicationdate;
	}
	
	public long getPrice() 
	{
		return price;
	}
	
	public void setPrice(long price)
	{
		this.price = price;
	}
	
	
	public Book(int id) 
	{
		super();
		this.id = id;
	}

	public void show()
	{
		System.out.println(id);
		System.out.println("Author name      "+author);
		System.out.println("Title name  	 "+title);
		System.out.println("Publication date "+publicationdate);
		System.out.println("Price 		 "+price);
	}

}
