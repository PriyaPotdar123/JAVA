package Datastructure;

import java.util.*;

public class Heapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int a;
		for(int i=0;i<=5;i++)
		{
			a=sc.nextInt();
			pq.add(a);
		}
		for(int i=0;i<5;i++)
		{
			pq.poll();
			System.out.println(pq.peek());
		}
		sc.close();
	}
	
}
