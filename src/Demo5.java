import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        double tax =0.0;
//
//        for (int i = 0; i < 5 ; i++){
//            System.out.print("Enter Salary 0"+(i+1)+":");
//            double salary  =input.nextDouble();
//
//            if (salary > 130000){
//                tax += (salary*14)/100;
//
//            }
//        }
//        System.out.println("Amount of tex pay for government: "+ tax);

        System.out.print("Enter Your Name :");
        String myName = input.next();
        System.out.print("Enter Your Age :");
        int age =input.nextInt();

        boolean isMarred = false;

        for (int i = 0 ; i < 4 ; i++){
            System.out.print("Enter Girls Name 0"+(i+1)+":");
            String girlName =input.next();
            System.out.print("Enter Girls Age 0"+(i+1)+":");
            int girlAge =input.nextInt();

            int girlAsciVal = girlName.charAt(0);
            int myNameAsciVal = myName.charAt(0);

            if (girlAsciVal <= myNameAsciVal && girlAge < age){
                System.out.println("you marry...");
                isMarred =true;
                break;
            }else {
                System.out.println("Oppss....Your Not Match For Me .Enter Next Girl's Name:");
                System.out.println(" ");
            }

        }
        if (!isMarred){
            System.out.println("Oppsss.......Try Another Girl...");
        }



    }
}
