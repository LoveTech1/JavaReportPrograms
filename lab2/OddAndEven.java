package lab2;

// WAP  to input 5 values from the user. Display sum of odd and even values separately.
// Your program should use loop, store even and odd values in two separate arrays.

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        int num,i;
        int[] numbers = new int[5];
        int[] even = new int[5];
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int[] odd = new int[5];

        Scanner obj = new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.print("Enter number for index: " + i);
            numbers[i] = obj.nextInt();
            if(numbers[i] % 2 == 0){
                even[i] = numbers[i];
                sumOfEven += even[i];

            }
            else{
                odd[i] = numbers[i];
                sumOfOdd += odd[i];
            }
        }

        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of Odd numbers: " + sumOfOdd);
    }

}

