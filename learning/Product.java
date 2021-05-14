package learning;
// Inheritance program

public class Product {
	
	public int id;
	private String productname;
	private long price;
	
	public Product()
	{
		
	}
	public Product(int id)
	{
		this.id = id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
		
	}
	public void print() 
	{
		System.out.println("id          = "+id);
		System.out.println("productname = "+productname);
		System.out.println("price       = "+price);
	}
	
	public static void main(String[] args)
	{
		Product c= new Product(1);
		c.setid(2);
		c.setProductname("TV");
		c.setPrice(50000);
		c.print();
	}
	
}



