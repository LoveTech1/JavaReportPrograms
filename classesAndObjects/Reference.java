package classesAndObjects;

class Person{
    int age;
    String address;
    String name;

    public void print_details(){
        System.out.println("Person Age is " + this.age + ". Address is " + this.address + ". Name is " + this.name);
    }
}


public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.address = "Lainchaur";
        p1.name = "Bibek";
        p1.age = 21;
        p1.print_details();
    }
}
