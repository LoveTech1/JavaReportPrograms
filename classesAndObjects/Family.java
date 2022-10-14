package classesAndObjects;

class Detail{
    String name;
    double weight;
    double height;

    public void print_details(){
        System.out.println("Name : " + this.name);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
    }
}

public class Family {
    public static void main(String[] args) {
        Detail member1 = new Detail();
        Detail member2 = new Detail();
        Detail member3 = new Detail();
        member1.name = "Bibek Basnet";
        member1.height = 5.9;
        member1.weight = 70;
        member1.print_details();
        member2.name = "Hari Shrestha";
        member2.height = 4.5;
        member2.weight = 56;
        member2.print_details();
        member3.name = "Shyam ram";
        member3.height = 4.2;
        member3.weight = 84;
        member3.print_details();
    }
}
