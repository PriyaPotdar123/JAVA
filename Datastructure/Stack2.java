package Datastructure;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		Stack<String> sk = new Stack<String>();
		
		sk.push("We");
		sk.push("Are");
		sk.push("Strong");
		sk.push("Enough");
		
		System.out.println(sk.isEmpty());
		
		System.out.println("Stack peek is "+"'"+sk.peek()+"'");
		
		System.out.println(sk.search("Are"));
		
		sk.pop();
		System.out.println(sk);
	}

}
