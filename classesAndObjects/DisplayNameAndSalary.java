package classesAndObjects;

class Person1 extends Person{
    double salary;

    @Override
    public void print_details() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary: " + this.salary);
    }
    Person1(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
}
class Person2 extends Person{
    double salary;

    @Override
    public void print_details() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary: " + this.salary);
    }
    Person2(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
}


public class DisplayNameAndSalary {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Bibek Basnet",4848201);
        p1.print_details();
        Person2 p2 = new Person2("Hari Shrestha",1314144);
        p2.print_details();
    }
}
