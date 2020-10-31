package labassignment4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class DemoBuffer {
		public static void main(String[] args) throws IOException {
			BufferedReader br=null;
			try {
				 br=new BufferedReader(new FileReader(new File("data.txt")));
				String line=null;
				while((line=br.readLine())!=null) {
					String tokens[]=line.split(" ");
					for(String token:tokens) {
					System.out.print(token);	
					}
				}
			}
			catch(FileNotFoundException ex) {
				System.out.println("File Not found");
			}
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}


