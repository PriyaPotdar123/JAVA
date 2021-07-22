package Helloworldspring;

public class HelloSpring {
	  private String message;
	  private String name;
	  private int id;
	  private String addres;
	  

	   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) 
	{
		this.addres = addres;
	}
	public void setMessage(String message)
	{
	      this.message  = message;
	}
	   public void getMessage()
	   {
		  System.out.println("id : " + id); 
	      System.out.println("name : " + name);
	      System.out.println("address : " + addres);
	      System.out.println("Message : " + message);
	   }

}
