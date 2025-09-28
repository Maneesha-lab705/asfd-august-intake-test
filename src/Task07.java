import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName ="use@123";
        int userPassword =123;

        System.out.print("Enter User Name :");
        String user = input.next();
        System.out.print("Enter Password :");
        int password =input.nextInt();

        int dialogCount=0;
        int hutchCount=0;
        int mobiCount =0;
        int simNameCount=1;

        if (userName.equals(user) && password ==userPassword){
            System.out.print("How Many Peoples do you meet today.. :");
            int meetCount =input.nextInt();


            for (int i = 0; i<meetCount ;i++){

                System.out.print("how many sim card:");
                int simCount =input.nextInt();

                for (int j = 0 ; j<simCount ; j++){
                    System.out.print("enter sim name "+simNameCount+++" :");
                    String simName = input.next();
                    switch (simName){
                        case "dialog":dialogCount+=1;
                        break;
                        case "hutch" :hutchCount+=1;
                        break;
                        case "mobitel":mobiCount+=1;
                        break;
                        default:
                            System.out.println("not sim card");

                    }
                }
            }

        }
        if (mobiCount > dialogCount && mobiCount > hutchCount) {
            System.out.println("Most used SIM: Mobitel (" + mobiCount + ")");
        } else if (dialogCount > mobiCount && dialogCount > hutchCount) {
            System.out.println("Most used SIM: Dialog (" + dialogCount + ")");
        } else if (hutchCount > mobiCount && hutchCount > dialogCount) {
            System.out.println("Most used SIM: Hutch (" + hutchCount + ")");
        } else {
            System.out.println("There is a tie between SIMs!");
        }

    }
}
