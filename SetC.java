import java.sql.SQLOutput;
import java.util.Scanner;

public class SetC {
    // sum of odd numbers from 1 to n using do while int total = 0;
    public static void sum(int r1,int r2){
        int total = 0;
        int n;
        do{
            total += r1;
            r1 += 2;
        }while(r1 <= r2);
        System.out.println("Total : " + total);
    }

    // WAP to display the following pattern : 5,9, 13,17,21,25 (use while loop)
    public static void printPattern1(){
        int seq = 4;
        int n = 5;
        while(n < 26){
            System.out.print(n + ",");
            n += seq;
        }
    }

    public static void printPattern2(){
        int diff = 10;
        for(int i=100;i>=50;i-=diff){
            System.out.print(i + " - ");
//            i -= diff;
        }

    }

    public static void remarks(float percentage){
        if (percentage > 90){
            System.out.println("excellent");
        }else if(percentage > 75){
            System.out.println("good");
        }else{
            System.out.println("ok");
        }
    }

    public static void printDayNum(int n){
        switch (n) {
            case 1 -> System.out.println("It is Sunday!");
            case 2 -> System.out.println("It is Monday!");
            case 3 -> System.out.println("It is tuesday!");
            case 4 -> System.out.println("It is Wednesday!");
            case 5 -> System.out.println("It is Thursday!");
            case 6 -> System.out.println("It is Friday!");
            case 7 -> System.out.println("It is Saturday!");
            default -> System.out.println("Please enter valid number!");
        }
    }
//    WAP to access array elements  = [1,2,3,4,5,6] from the given array and
//    find the multiplication of  all the elements.

    public static void multArray(){
        int[] arr = {1,2,3,4,5,6};
        int i;
        int mult = 1;
        for(i = 0;i<arr.length;i++){
            mult *= arr[i];

        }
        System.out.println(mult);
    }

    public static void simpleInterest(double p, double t,double r){
        double si = (p * t * r) / 100;
        System.out.println("Simple Interest : " + si);
    }

    public static void matrixSubtraction(){
        int[][] arr1 = {{2,3},{4,5}};
        int[][] arr2 = {{5,6},{3,4}};

        int[][] sub = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sub[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print(sub[i][j]);
            }
            System.out.println();
        }
    }
    public static void matrixMultiplication(){
        int[][] array1 = {{1,2},{2,3}};
        int[][] array2 = {{4,5},{6,7}};

//        int[][] mult =
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int[][] array3 = {{1,1},{1,1}};
                for(int k=0;j<2;j++){
                    array3[i][j] += array1[i][k] * array2[k][j];
                    System.out.print(array3[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void printPattern4(){
        int i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern5(){
        int i,j;
        for(i = 1;i<=5;i++){
            for(j = 5;j>=i;j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static String armstrong(int num){

        int temp = num;
        int rem = 0;
        int sum = 0;
        int cube = 0;
        while(num > 0){
            int quot = num % 10;
            cube = quot * quot * quot;
            sum += cube;
            num /= 10;
        }
        if (temp == sum) return "Armstrong Number";
        else return "Not Armstrong Number";
    }



    public static void main(String[] args) {
        // 9 no.
        sum(1,10);
        // 10 no.
        printPattern1();
        System.out.println();
        // 11 no
        printPattern2();
        System.out.println();
        // 13 no
        remarks(91);
        // 14 no
        printDayNum(3);
        // 15 no
        multArray();
        // 16 no
        simpleInterest(50000,2,12);
        // 17 no
        matrixSubtraction();
        // 18  no
        matrixMultiplication();

        System.out.println();
        printPattern4();

        System.out.println();
        printPattern5();

        // armstrong number
        System.out.println(armstrong(152));
    }
}
