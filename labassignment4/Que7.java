package labassignment4;
import java.io.IOException;

import labassignment4.InputException;
class throwException{
	
	public void throwException() throws IOException,InputException{
		return;
	}
}

public class Que7 {
	
	       public static void main(String[] args)   {
			throwException te=new throwException();
			try {
				te.throwException();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//two catch blocks are added
		}
	}


