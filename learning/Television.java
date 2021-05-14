package learning;

public class Television extends Product
{
	
	
	private int screensize;
	private String company;
	

	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getScreensize() {
		return screensize;
	}


	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	
	public void print()
	{
		super.print();
		System.out.println("screensize  = "+screensize);
		System.out.println("company     = "+company);
	}
	public static void main(String[] args)
	{
		Television o=new Television();
		o.setid(1);
		o.setPrice(1000);
		o.setProductname("TV");
		o.setScreensize(2020);
		o.setCompany("sony");
		o.print();
	}

}
