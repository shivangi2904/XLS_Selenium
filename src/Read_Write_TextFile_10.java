import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_TextFile_10 {

	public static void main(String[] args) throws IOException {

		// File creation
		
		File f = new File("C:\\Testing\\temp.txt");
		f.createNewFile();
		
		//Writing in to file
		
		FileWriter w = new FileWriter("C:\\Testing\\temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("Hello - Writing in a file");
		out.newLine();
		out.write("This is a new line 1");
		out.newLine();
		out.write("This is a new line 2");
		out.newLine();
		out.write("This is a new line 3");
		out.newLine();
		out.write("This is a new line 4");
		out.newLine();
		out.flush(); // upto this line all the text will be saved in to TEMP file . this command will transfer text from TEMP to file.
		
		
		//Read Text File
		
		FileReader r = new FileReader("C:\\Testing\\temp.txt");
		BufferedReader rd = new BufferedReader(r);
		
		
		String x;
		
		int i=0;
		while ((x=rd.readLine()) != null) 
		{			
			System.out.println(x);
			i++;			
		}
		System.out.println(i);
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		
		
	}

}
