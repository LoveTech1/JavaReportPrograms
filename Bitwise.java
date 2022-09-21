// wap to program to perform bitwise operator

public class Bitwise {
    public static void main(String[] args){
        int a = 5;
        int b = 6;

        // bitwise or operation
        int bitwiseOr = a | b;

        // bitwise and operation
        int bitwiseAnd = a & b;

        // bitwise xor
        int bitwiseXor = a ^ b;

        // bitwise xnor
        int bitwiseXnorOfA = ~a;
        int bitwiseXnorOfB = ~b;
        System.out.println("bitwise or = " + bitwiseOr);
        System.out.println("bitwise and = " + bitwiseAnd);
        System.out.println("bitwise xor = " + bitwiseXor);
        System.out.println("bitwiseXnorOfA = " + bitwiseXnorOfA + " bitwiseXnorOfB " + bitwiseXnorOfB);

    }
}
