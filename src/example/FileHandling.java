package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		// Create new file
		try{File file = new File("hello.txt");
		file.createNewFile();
		System.out.println("Print file is created");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();}

		// Write in file 
		
		try {FileWriter file1 = new FileWriter ("hello.txt");
		// \n is used to print text in new line
		file1.write("Hello this is new world program1\nThis is the begining of the programming");
        file1.close();
        System.out.println("content is added");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// Delete file
		
		/*File file2 = new File ("hello.txt");
		file2.delete();
		System.out.println("File is deleted");
		*/
		
		// Empty the file
		
		/*try {
		FileWriter file3 = new FileWriter ("hello.txt");
		file3.write("");
		System.out.println("File is empty");
		file3.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
		// Read the file using scanner class
		FileReader file4 = new FileReader("hello.txt");
		Scanner scan = new Scanner (file4);
		while (scan.hasNextLine()) 
		{
		String line = scan.nextLine();
		System.out.println(line);
		}
		scan.close();
		
		// Read the file using BuffferedReader Class
		FileReader file5 = new FileReader("hello.txt");
		BufferedReader read5 = new BufferedReader (file5); 
		String str ;
		while((str = read5.readLine()) != null) 
		{
	
		System.out.println(str);
		}
		read5.close();
		
		
	}


}
