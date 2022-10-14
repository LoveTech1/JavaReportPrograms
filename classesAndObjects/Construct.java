package classesAndObjects;

//WAP that shows object initialization through constructor.
// Your class should have three variable of type int, double and string.

class Animal{
    int average_Life_expectancy;
    double average_weight;
    String scientificName;
}

class Human extends Animal{
    public void detail(){
        System.out.println("Average_Life_expectancy: " + this.average_Life_expectancy );
        System.out.println("Average_weight: " + this.average_weight);
        System.out.println("Scientific name: " + this.scientificName);
    }
}

public class Construct {
    public static void main(String[] args) {
        Human h1 = new Human();

        h1.average_weight = 52.2;
        h1.scientificName = "Homo Sapiens";
        h1.average_Life_expectancy = 60;
        h1.detail();
    }
}
