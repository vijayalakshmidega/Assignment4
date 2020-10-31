package labassignment4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ques4 {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			try {
				do {
					System.out.println("Please enter the nummber or enter'-1' if you want to quit");
					n=sc.nextInt();
					if(n%2==1)
						System.out.println("You have entered an odd number");
					else if(n%2==0)
						System.out.println("You have entered an even number");
					else if(n==-1)
						System.out.println("[your program ended here]");
				}while(n!=-1);
			}catch(InputMismatchException e) {
				System.out.println("You must enter Integer");
			}

		}

	}

