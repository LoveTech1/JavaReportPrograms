
// 6. WAP to show type conversion and typecasting.

import java.math.BigInteger;

public class Casting {
    public static void main(String[] args){
        int a = 5;

        // type conversion
        // it is explicitly done by the compiler during runtime
        long y;
        y = a;
        System.out.println("AFter conversion: " + y);

        // type casting
        // it is done by the programmer
        double convert;
        convert = (double)a;
        System.out.println("After int conversion to float: " + convert);

    }
}
