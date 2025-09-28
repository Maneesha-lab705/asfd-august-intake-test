import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input name");
        String nama= input.next();

        System.out.print("input ange");
        int age = input.nextInt();

        System.out.println("input address");
        String address =input.next();

        if(age > 19 ){
            System.out.println(address);
        }

    }
}
