package labassignment4;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class DemoByte {
	

		public static void main(String[] args) {
			  FileInputStream file =null;
			try {
				file=new FileInputStream("data.txt");
		
				int words=0;
				while((words=file.read())!=-1) {
					System.out.print((char)words);
				}
				
			}
			catch(FileNotFoundException ex) {
				System.out.println("Filenot found");
			} catch (IOException e) {
				e.printStackTrace();
				
			}
				try {
			
				file.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
}

