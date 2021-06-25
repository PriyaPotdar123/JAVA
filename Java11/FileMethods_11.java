package Java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethods_11 {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		file.createNewFile();
		
		Files.writeString(Path.of("test.txt"),"'INDIAN' wild animals ");
		System.out.println(Files.readString(Path.of("test.txt")));

		boolean result = Files.isSameFile(Path.of("test.txt"),Path.of("priya.txt"));
		System.out.println(result);
		
		boolean result1 = Files.isSameFile(Path.of("test.txt"),Path.of("test.txt"));
		System.out.println(result1);
		
	}

}
