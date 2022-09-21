
// wap program to perform ternary operation
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ternaryOperation {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to check even or odd: ");
        int num = obj.nextInt();
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + result);
    }
}


