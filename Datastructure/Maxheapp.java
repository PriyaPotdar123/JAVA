package Datastructure;

import java.util.*;

public class Maxheapp {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
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
