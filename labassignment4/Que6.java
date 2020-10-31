package labassignment4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Que6 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			try {
				do {
					System.out.println("Please enter the nummber or enter'-1' if you want to quit");
					n=sc.nextInt();
					if(n<100) {
					if(n%2==1)
						System.out.println("You have entered an odd number");
					else if(n%2==0)
						System.out.println("You have entered an even number");
					else if(n==-1)
						System.out.println("[your program ended here]");
					}
					else
						throw new InputException("Number cannot be greater than 100");
					}while(n!=-1);
			}catch(InputMismatchException e) {
				System.out.println("You must enter Integer");
			
			} catch (InputException e) {
				
			System.out.println(e.getMessage());	}

		}
	}


