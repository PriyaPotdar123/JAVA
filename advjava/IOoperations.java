package advjava;

import java.io.*;

public class IOoperations{

	public static void main(String[] args) throws IOException {
		try {
			File f = new File("Priya.txt");
			if(f.createNewFile())
			{
				System.out.println("File has been created");
			}
			else
			{
				System.out.println("File already exists");
			}
			
		
		
		BufferedWriter br1 = new BufferedWriter(new FileWriter("Priya.txt"));
		
		br1.write("Helloooo Everyone............");
		br1.newLine();
		br1.append("My Name is priya 1");
		br1.newLine();
		br1.append("My Name is priya 2");
		br1.newLine();
		br1.append("My Name is priya 3");
		br1.newLine();
		br1.append("My Name is priya 4");
		
		br1.close();
		
		BufferedReader br = new BufferedReader(new FileReader("Priya.txt"));
		
		/*String s = br.readLine();
		
		System.out.println("All Content of file Priya");
		while(s!=null)
		{
				System.out.println(s);
				 s = br.readLine();
		}*/
		
		System.out.println("If i what to read line 4");
		String s = br.readLine();
		for(int i=0;i<4;i++)
		{
			 s = br.readLine();
		}
		System.out.println(s);
		}
		
		catch(Exception e)
		{
				System.out.println("ERROR "+e);
		}
	}

}
