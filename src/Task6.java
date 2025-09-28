import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your age:");
        int age =input.nextInt();

        if (age <= 18 ){
            System.out.print(" Is Child..");
        }
        if (age > 18 & age<=35){
            System.out.print("is yang");
        }
        if (age >35){
            System.out.print("is adult");
        }
    }
}
