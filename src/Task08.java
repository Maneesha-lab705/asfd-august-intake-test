import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name :");
        String name =input.next();

        System.out.print("Enter Age :");
        int age = input.nextInt();

        while (age > 100){
            System.out.print(" if not your age your died.. Enter rial age..:");
            age = input.nextInt();

        }
        System.out.print("Enter address :");
        String add =input.next();
        System.out.print("Enter tel number :");
        int telNumber = input.nextInt();

        System.out.print(" your anme is  :"+ name+ " " +"your age is :"+age);
    }
}
