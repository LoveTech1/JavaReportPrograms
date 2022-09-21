
// wap to perform arithemetic operations
// importing scanner class
import java.util.Scanner;
class Arithemetic{
    public static void main(String[] args){
        int num1,num2;
        int add,difference,division,multiplication;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter value of num1 and num2: ");
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        add = num1 + num2;
        difference = num1 - num2;
        division = num1 / num2;
        multiplication = num1 * num2;

        System.out.println("The addition between " + num1 + " and " + num2 + " is " + add);
        System.out.println("The subtraction between " + num1 + " and " + num2 + " is " + difference);
        System.out.println("The multiplication between " + num1 + " and " + num2 + " is " + multiplication);
        System.out.println("The division between " + num1 + " and " + num2 + " is " + division);

    }
}
