package home.amit.java.basic.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample{  
	 public static void main(String args[])throws Exception{  
	    
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Amit\\Personal\\TestProjects\\f.txt"));
	  Student s=(Student)in.readObject();  
	  System.out.println(s.id+" "+s.name +" "+s.placeOfWork +" "+s.city);  
	  
	  in.close();  
	 }  
	}  