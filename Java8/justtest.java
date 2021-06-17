package Java8;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class justtest {

	public static void main(String[] args) throws IOException {
		//to fine distinct words in file 
		
		File text = new File("text.txt");
		text.createNewFile();
		BufferedWriter br1 = new BufferedWriter(new FileWriter("text.txt"));
		
		br1.write("Helloooo Everyone............");
		br1.newLine();
		br1.append("hello cuelogic ");
		br1.newLine();
		br1.append("very excited to work with cuelogic");
		br1.close();
		
		
		Path path = Paths.get("text.txt");
				//----------------------------------------------------------
								Set setofwords = new HashSet();
								try 
								{
									List<String> lines = Files.readAllLines(path);
									for(String line: lines)
									{
										System.out.println(line);
										String words[] = line.split("\s");
										for(String word:words)
										{
											setofwords.add(word);
										}
									}
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								System.out.println(setofwords);
				//----------------------------------------------------------
		/*Helloooo Everyone............
		hello cuelogic 
		very excited to work with cuelogic
		[very, with, excited, Helloooo, work, cuelogic, Everyone............, hello, to]*/
	}

}
