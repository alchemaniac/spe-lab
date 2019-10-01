import java.util.Scanner;
public class calsub{
        public static void main(String args[]){
                float a,b,res;
                System.out.println(args[0]+args[1]+args[2]);
                int choice=Integer.parseInt(args[0]);
                System.out.println("1. SUBTRACT TWO NUMBERS");
                System.out.println("2. EXIT");
                System.out.println("Enter choice: ");
                switch(choice){
                        case '1': System.out.println("Input two numbers: ");
                                  a=Float.parseFloat(args[1]);
                                  b=Float.parseFloat(args[2]);
                                  res=a-b;
                                  System.out.println("Result is "+res);
                                  break;
                        case '2': System.exit(0);
                                  break;
                        default : System.out.println("Invalid choice!");
                                  break;
                }
                System.out.println("\n------------------------------\n");
        }
}
