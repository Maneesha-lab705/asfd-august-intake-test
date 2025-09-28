import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter Kudu Money:");
        double cuduMoney =input.nextDouble();

        System.out.print("Enter Land profit:");
        double landProfit =input.nextDouble();

        System.out.print("Enter Salary :");
        double salary =input.nextDouble();

//        double total = (salary-(salary*14/100))+(cuduMoney-(cuduMoney/2))+landProfit;

        if (salary >= 115000 || cuduMoney>0 || landProfit>0){
            System.out.println("Total Salary Income After Tax:"+(salary-(salary*14/100)));
            System.out.println("Total Cudu Money After Tax:"+(cuduMoney-(cuduMoney/2)));
            System.out.println("Land Profit:"+landProfit);
            System.out.println("Total Salary:"+(salary-(salary*14/100)+cuduMoney-(cuduMoney/2)+landProfit));
        }else {
            System.out.println("Nothing Profit.....");
        }

        if (salary >= 115000){
            salary =salary-(salary*14/100);
        }
        if (cuduMoney>0){
            cuduMoney = cuduMoney/2;
        }
        System.out.println(salary+cuduMoney+landProfit);
    }
}
