package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptions {
	//checked Exceptions or CompileTime Exceptions
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fi = new FileInputStream(new File("./othersss/abc.txt"));
		System.out.println("jss");
	}
}
