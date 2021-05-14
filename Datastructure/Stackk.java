package Datastructure;
import java.util.*;

public class Stackk {
	public void peekofstack(int[] arr,int top)
	{
		System.out.println("Top of stack is "+arr[top]);
	}
	
	public void popstack(int[] arr,int top)
	{
		if(arr.length==(top-1))
		{
			System.out.println(" stack is full now ");
		}
		if(top==-1)
		{
			System.out.println("Stack is under flow");
		}
		else
		{
			arr[top]=0;
			top=top-1;
		}
		for(int i=0;i<=top;i++)
		System.out.println(arr[i]);
	}
	
	public static void main(String[] args)
	{
		int n,top=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			top=top+1;
			arr[i]=sc.nextInt();
		}
		
		Stackk sk = new Stackk();
		String ans;
		int i;
		do
		{
		System.out.println("Choose your choice from 1 to 2");
		i=sc.nextInt();
		switch(i) 
		{
		case 1:{sk.peekofstack(arr,top);break;}
		
		case 2:{sk.popstack(arr,top);break;}
		}
		System.out.println("do you want to continue");
		ans=sc.next();
		}
		while(ans=="yes");
		sc.close();
	}
	
}