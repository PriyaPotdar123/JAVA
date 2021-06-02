package advjava;

public class Employee {
	
	private int id;
	private String name;
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
	
	
	public boolean equals(Object o)
	{
		if(o==null||(this.getClass()!=o.getClass()))
		{
			return false;
		}
		if(o==this)
		{
			return true;
		}
		return (this.getId()==((Employee) o).getId());
	}
	
	public int hashCode()
	{		
		return this.id;
	}

}
