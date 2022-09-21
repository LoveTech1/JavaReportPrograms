
// WAP to perform all logical operations AND, OR, Equals to
// importing scanner class
import java.util.Scanner;

public class LogicalOperations {
    public static void main(String[] args){
        /*
            and = &&
            or = ||
            equals to - ==
        */
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        boolean result1 = num1 > num2;
        boolean result2 = num1> 5 && num2<10;
        boolean result3 = num1 == num2;
        boolean result4 = num1 < 0 || num2 < 0;
        System.out.println(num1 + " > " + num2 + " is " + result1);
        System.out.println(num1 + " is greater than 5 " + num2 + " is less than 10 is "  + result2);
        System.out.println("num1 = num2 is " + result3);
        System.out.println(num1 + " and " + num2 + " both are negative = " + result4);
    }
}
