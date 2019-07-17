package Kesi;

import java.io.File;

public class FileChecker {
	public static void main(String[] args) {
		
		File f = new  File("D:\\Javaprograms\\Simple.java");
		
		if(f.exists()){
			System.out.println("File is exist");
		}
		else{
			System.out.println("File dose not exist");
		}
		
	}

}
