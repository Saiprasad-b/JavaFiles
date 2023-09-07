package fileredersExmp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Introduction {
public static void main(String[] args) {
	try {
	//FileReader fr =  new FileReader("C:\\Users\\kranthi\\Desktop\\sample.txt");
	
	//File f = new File("C:\\Users\\kranthi\\Desktop\\sample.txt");
	
	FileWriter fw =  new FileWriter("C:\\Users\\kranthi\\Desktop\\studentpojo",true);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("saiprasad");
	System.out.println("data entered");
	
	//int h= 	fr.read();
	//char v = (char)h;
	//System.out.println(v);
	
	
	
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
