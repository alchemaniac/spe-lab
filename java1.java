import java.util.Scanner;
public class java1{
	public static void main(String args[]){
		float a,b,res;
		char choice, ch;
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("1. SUB TWO NUMBERS");
		System.out.println("2. EXIT");
		System.out.println("Enter choice: ");
		choice=scan.next().charAt(0);
		switch(choice){
			case '1': System.out.println("Input two numbers: ");
				  a=scan.nextFloat();
				  b=scan.nextFloat();
				  res=a-b;
				  System.out.println("Result is "+res);
				  break;
			case '2': System.exit(0);
				  break;
			default : System.out.println("Invalid choice!");
				  break;
		}
		System.out.println("\n------------------------------\n");
		}while(choice!='2');
	}
}
