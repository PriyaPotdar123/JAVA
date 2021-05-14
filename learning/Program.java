package learning;

public class Program extends Television {

	public static void main(String[] args) {
		Television tv=new Television();
		Program  pg= new Program();
		
		pg.setid(1);
		pg.setPrice(1000);
		pg.setProductname("TV");
		pg.setScreensize(2020);
		pg.setCompany("sony");
		pg.print();
		
		System.out.println("\n");
		
		tv.setid(2);
		tv.setPrice(20000);
		tv.setProductname("Laptop");
		tv.setScreensize(6014);
		tv.setCompany("Lenovo");
		tv.print();

	}

}
