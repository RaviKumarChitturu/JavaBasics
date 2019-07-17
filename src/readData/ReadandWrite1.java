package readData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class ReadandWrite1 {

public static void main(String[] args) throws IOException {
	

		File InputFile = new File("C:\\lib\\Test.txt");
		System.out.println("Input file name is: "+InputFile.getName());
		FileReader read = new FileReader(InputFile);
		BufferedReader b = new BufferedReader(read);
		String linedata = "";
		String data= "";
		while( (linedata=b.readLine()) != null) {
			data+=linedata;
		}
		b.close();
		System.out.println(data);
		System.out.println("Data length is: "+data.length());
		
		
		
		File OutputFile = new File("C:\\lib\\Test1.txt");
		System.out.println("output file name is: "+OutputFile.getName());
		FileWriter write = new FileWriter(OutputFile, true);
		BufferedWriter bw = new BufferedWriter(write);
		bw.write(data);  
		bw.close();
}
}
