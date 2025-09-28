import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter First Businessman August Salary:");
        double firstBsSal =input.nextDouble();

        System.out.print("Enter Second Businessman August Salary:");
        double secBsSal =input.nextDouble();

        System.out.print("Enter Third Businessman August Salary:");
        double thirdBsSal =input.nextDouble();

        System.out.print("Enter Forth Businessman August Salary:");
        double forthBsSal =input.nextDouble();

        double monthlyIncomeAvg = (firstBsSal+secBsSal+thirdBsSal+forthBsSal)/4;
        System.out.println("Avg Monthly Income:"+monthlyIncomeAvg);

        double texAvg = (monthlyIncomeAvg*13)/100;

        System.out.println("Average Tax Value:"+texAvg);
        System.out.println("Total Tax payment for government :"+(texAvg*4));


        //////////////////////
//        conversion
        byte num1 =34;

        int num2 =num1;


        /// ////////////////
//        casting
        int num3 =22;

        short num4= (short) num3;
    }
}
