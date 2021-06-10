package advjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Apple implements Serializable
{
	public int i=10;

	@Override
	public String toString() {
		return "Apple [i=" + i + "]";
	}	
}


public class IO_objects {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Apple ap = new Apple();
		FileOutputStream fs = new FileOutputStream("Priya.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ap);
		os.close();
		
		FileInputStream fis = new FileInputStream("Priya.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Apple stringop =(Apple) ois.readObject();
		System.out.println(stringop);
		ois.close();
	}

}
