package Corejava;

import java.io.*;
public class Tryresources {

	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String s = "";
			s=br.readLine();
			System.out.println(s);
		}

	}

}
