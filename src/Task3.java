import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Boy Name:");
        String boyName = input.next();

        System.out.print("Enter Girl Name:");
        String girlName = input.next();

        char firsLetter = boyName.charAt(0);
        char lastLetter = girlName.charAt(girlName.length() - 1);

        System.out.println("First Letter :"+firsLetter);
        System.out.println("Last Letter:"+lastLetter);

        int firstLetVal = firsLetter;
        int secLetVal = lastLetter;

        System.out.println("lucky number is :"+(firstLetVal+secLetVal/2));
    }
}
