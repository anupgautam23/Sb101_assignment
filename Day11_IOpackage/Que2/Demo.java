package Day11_IOpackage.Que2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =  new BufferedReader(new FileReader("d://abc.txt"));
		String lineString= br.readLine();
		
		while(lineString!=null){
			System.out.println(lineString);
			lineString  = br.readLine();
		}
		

	}

	
}
