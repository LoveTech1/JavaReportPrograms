package classesAndObjects;
import java.util.Scanner;
// WAP to input  two numbers given by the user then perform addition
// if the variable x has value 1 else perform subtraction by initializing the object through a function.

class Addition{
    int num1;
    int num2;

    public void addition(){
        System.out.println(this.num1 + this.num2);
    }
    public void subtraction(){
        System.out.println(this.num1 - this.num2);
    }
    public void isEqualToOne(){
        if (this.num1 == 1){
            addition();
        }
        else{
            subtraction();
        }
    }

}

public class Cond {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = obj.nextInt();
        System.out.println("Enter second number: ");
        int num2 = obj.nextInt();
        a1.num1 = num1;
        a1.num2 = num2;
        a1.isEqualToOne();
    }
}
