import java.util.Scanner;
public class calsub{
        public static void main(String args[]){
                float a,b,res;
                int choice=args[0];
                do{
                System.out.println("1. SUBTRACT TWO NUMBERS");
                System.out.println("2. EXIT");
                System.out.println("Enter choice: ");
                choice=scan.next().charAt(0);
                switch(choice){
                        case '1': System.out.println("Input two numbers: ");
                                  a=args[1];
                                  b=args[2];
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
