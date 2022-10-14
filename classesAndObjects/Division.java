package classesAndObjects;

// Using class and object concept perform division operation for an object A of class div.

class Div{
    public double divide(double a,double b){
        return a / b;
    }
}


public class Division {
    public static void main(String[] args){
//        System.out.println("hello world");
       Div A = new Div();
       System.out.println(A.divide(10,2));
    }
}



