import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter a number");
      String num = myObj.nextLine();  // Read user input
      System.out.println("Hello World" + num);
     }
}