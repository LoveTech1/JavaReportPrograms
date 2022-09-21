// WAP to perform all shift operations for all signed and unsigned numbers.

public class ShiftOperation {
    public static void main(String[] args){
        int positiveNumber = 4;
        int negativeNumber = -5;

        // left shift operation
        int leftShiftFirst = positiveNumber<<2;
        int leftShiftSecond = negativeNumber<<2;
        System.out.println("left shift positive number: " + leftShiftFirst);
        System.out.println("left shift negative number: " + leftShiftSecond);

        // right shift operation
        int rightShiftFirst = positiveNumber>>2;
        int rightShiftSecond = negativeNumber>>2;
        System.out.println("Right shift positive number: " + rightShiftFirst);
        System.out.println("Right shift second number: " + rightShiftSecond);
    }
}