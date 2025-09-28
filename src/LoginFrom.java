import java.util.Scanner;

public class LoginFrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail ="admin@gmail.com";
        int password = 12345;

        System.out.print("Enter Email:");
        String getEmail = scan.next();

        System.out.print("Enter Password:");
        int getPassword = scan.nextInt();

        if (getEmail.equals(dbEmail) && getPassword == password){
            System.out.println("Login Success full");
        }else {
            System.out.println("Email or Password Incorrect");
        }

        System.out.println("hello");

        if (0<0){
            System.out.println("buyee");
        }
    }
}
