package example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



	 class CheckedExceptions {

	    public static void main(String[] args)   {
	        System.out.println("Program started.");

	        String filePath = "D://Resume/HelloWorld.txt";

	        
	        try {     System.out.println("Opening file: " + filePath);
	            FileReader fr = new FileReader(filePath);
	            BufferedReader reader = new BufferedReader(fr);

	            String line = reader.readLine();

	            if (line == null) {
	                System.out.println("File is empty.");
	            } else {
	                System.out.println("First line: " + line);
	            }

	            reader.close();
	        }
	        catch (Exception e) {
	        	 System.out.println(e.getMessage());
	        	 e.printStackTrace();
	        }
	       
	        }
	    }
	
