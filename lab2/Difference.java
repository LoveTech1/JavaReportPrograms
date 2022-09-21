package lab2;

public class Difference {
    public static void main(String[] args){
        double b = 3.20;
        double c = 5.6;
        double result = subtraction(b,c);
        System.out.println("The difference between two numbers is " + result);

    }
    static double subtraction(double a, double b){
        return a - b;
    }
}
