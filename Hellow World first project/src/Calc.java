import java.util.Scanner;

public class Calc {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter your first number: ");
int numtosolve1 = Integer.parseInt(input.nextLine());

System.out.print("Enter your second number: ");
int numtosolve2 = Integer.parseInt(input.nextLine());


// your code goes here

System.out.println( "Simple Calculator");

System.out.println( numtosolve1 + "+" + numtosolve2 + "=" + (numtosolve1 + numtosolve2) );

System.out.println( numtosolve1 + "-" + numtosolve2 + "=" + (numtosolve1 - numtosolve2) );

System.out.println( numtosolve1 + "*" + numtosolve2 + "=" + (numtosolve1 * numtosolve2) );

System.out.println( numtosolve1 + "/" + numtosolve2 + "=" + (numtosolve1 / numtosolve2) );



//the end of your code
input.close();

}

}