package classesAndObjects;

// WAP to calculate the volume of cube for three objects A,B and C  of Class “VLM”.

interface VLM{
    double volumeofcube();
}
class CubeOfObject implements VLM{
    double length;

    public double volumeofcube(){
        return this.length*this.length*this.length;
    }
}



public class Cube {
    public static void main(String[] args){
        CubeOfObject A = new CubeOfObject();
        A.length = 3;
        System.out.println("Volume of object A: " + A.volumeofcube());
        CubeOfObject B = new CubeOfObject();
        B.length = 4;
        System.out.println("Volume of object B: " + B.volumeofcube());
        CubeOfObject C = new CubeOfObject();
        C.length = 5;
        System.out.println("Volume of object C: " + C.volumeofcube());
    }
}
