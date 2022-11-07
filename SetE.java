
import java.util.Scanner;

public class SetE{

    int[][] age = new int[3][2];
    double[][] salary = new double[3][2];
    String[][] name = new String[3][2];

    String[] grade = {"A","B","C","D"};

    int numberOfEmployees;
    public static int askNumberOfEmployees(int n){
        return n;
    }

    public void askDetailOfEmployees(){
        for(int i=0;i<askNumberOfEmployees(numberOfEmployees);i++){
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter ageOfEmployee: ");
            int ageOfEmployee = obj.nextInt();
            System.out.print("Enter salaryOfEmployee: ");
            double salaryOfEmployee = obj.nextDouble();
            obj.nextLine();
            System.out.print("Enter NameOfEmployee: ");
            String nameOfEmployee = obj.nextLine();

            for(int j = 0;j<1;j++){
                // It stores details of the employee in the array
                age[i][j] = ageOfEmployee;
                salary[i][j] = salaryOfEmployee;
                name[i][j] = nameOfEmployee;

            }

        }
    }
    public String displayRandomGrade(){

        double value = Math.round((Math.random() * 4));
        String stringValue = String.valueOf((int) value);

        int indexPosition = Integer.parseInt(stringValue);
        return grade[indexPosition];

    }
    public void displayInformation(){
        for(int i=0;i<askNumberOfEmployees(numberOfEmployees);i++){
            for(int j=0;j<1;j++){
                System.out.print( "Name : " + name[i][j] + ", Age : " + age[i][j] + ", Salary " + salary[i][j] + ", Grade: " + displayRandomGrade());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        SetE company = new SetE();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many employees? ");
        company.numberOfEmployees = obj.nextInt();
        company.askDetailOfEmployees();
        company.displayInformation();
    }
}


