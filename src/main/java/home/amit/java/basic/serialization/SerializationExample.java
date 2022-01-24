package home.amit.java.basic.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*

The String class and all the wrapper classes implements java.io.Serializable interface by default.
Parent Child relationship
1-	It is not mandatory that super class must be serializable, for e.g. all classes extend object class but object class is not serializable while if child class implements serializability that it is serializable.
2-	If Parent class has no args constructor and is referred in child class then also it is fine.
3- If a class implements serializable then all its sub classes will also be serializable. Let's see the example given below:
4- If a class has a reference of another class, all the references must be Serializable otherwise serialization process will not be performed
5- If there is any static data member in a class, it will not be serialized because static is the part of class not object.
6- Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.
7- The Externalizable interface provides the facility of writing the state of an object into a byte stream in compress format. It is not a marker interface.
8- The Externalizable interface provides two methods:
o	public void writeExternal(ObjectOutput out) throws IOException
o	public void readExternal(ObjectInput in) throws IOException


 */
public class SerializationExample{  
	 public static void main(String args[])throws Exception{  
	  Student s1 =new Student(211,"ravi","Bharat");  
	  
	  FileOutputStream fout=new FileOutputStream("C:\\Amit\\Personal\\TestProjects\\f.txt");
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  
	  out.writeObject(s1);  
	  out.flush();  
	  System.out.println("success");  
	 }  
	} 