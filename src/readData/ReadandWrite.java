package readData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadandWrite {

	public String read() throws IOException{
		File f = new File("C:\\lib\\Test.txt");
		FileReader r = new FileReader(f);
		BufferedReader b = new BufferedReader(r);
		String out = "";
		String k="";
		while( (out=b.readLine()) != null) {
			k+=out;
		}
		b.close();
		return k;
	}

	public void write(String data) throws IOException {
		File file = new File("C:\\lib\\Test1.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);  
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		ReadandWrite rw=new ReadandWrite();
		String data=rw.read();
		rw.write(data);
		
	}

}
