import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);

        System.out.print("Enter first user salary:");
        double firstEmp = userInput.nextDouble();

        System.out.print("Enter second user salary:");
        double secondEmp = userInput.nextDouble();

        System.out.print("Enter third user salary:");
        double thirdEmp = userInput.nextDouble();

        System.out.print("Enter forth user salary:");
        double forthEmp = userInput.nextDouble();

        System.out.println("average salary:"+(firstEmp+secondEmp+thirdEmp+forthEmp)/4);


    }
}
