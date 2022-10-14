package classesAndObjects;

// WAP to sum two numbers where both variables of a class is declared private.

class Sum{
    private int num1;
    private int num2;

    public int get_numbers(){
        return this.num1 + this.num2;
    }
    public void set_numbers(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}


public class SumOfNumbes {
    public static void main(String[] args) {
        Sum n1 = new Sum();
        n1.set_numbers(8,6);
        System.out.println(n1.get_numbers());
    }
}
