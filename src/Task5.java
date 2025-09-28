import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Boy Age:");
        int boyAge = input.nextInt();

        System.out.print("Enter Girl Age:");
        int girlAge = input.nextInt();

        if (boyAge > girlAge){
            System.out.print("Enter Boy Name:");
            String boyName = input.next();

            System.out.print("Enter Girl Name:");
            String girlName = input.next();

            char firsLetter = boyName.charAt(0);
            char lastLetter = girlName.charAt(0);

            int boyFistLet = firsLetter;
            int girlFirstLet = lastLetter;

            if (boyFistLet>girlFirstLet){
                System.out.println("mareed");
            }else {
                System.out.println("maybe");
            }
        } else if (boyAge == girlAge) {
            System.out.println("think");
        } else if (boyAge < girlAge ) {
            System.out.println("bad luck youu..");
        }
    }
}
