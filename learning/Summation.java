package learning;

interface Add
{
	int add(int num1,int num2);
}

interface Sub
{
	int sub(int num1,int num2);
}

interface Div
{
	long div(long num1,long num2);
}


class Summation implements Add,Sub,Div{

	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	@Override
	public long div(long num1, long num2) {
		return num1/num2;
	}

	
	public static void main(String[] args) {
		long a,s,d;
		
		Summation su = new Summation();
		a=su.add(50,2);
		s=su.sub(50,2);
		d=su.div(50,2);
		
		System.out.println("Addition is "+a);
		System.out.println("Substraction is "+s);
		System.out.println("Division is "+d);
	}

}
