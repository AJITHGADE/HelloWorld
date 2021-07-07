import java.io.*;
import java.util.*;
import java.util.Map.Entry;
 

class GenericTest2
{
    public static void main(String[] args) throws IOException
    {
    	File file=new File("HRK");
    	file.mkdir();
    	file=new File("HRK\\Ajk.txt");
    	file.createNewFile();
    	if(file.delete()) {
    		System.out.println("Deletion Successfull");
    	}
    	else {
    		System.out.println("Failed to delete");
    	}
   
    	
    }
} 
