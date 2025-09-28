import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number :");
        int number = input.nextInt();

        while(number>0){
            int tem = number%10;
            number = number/10;
            System.out.print(tem + "/ ");
}

    }
}
