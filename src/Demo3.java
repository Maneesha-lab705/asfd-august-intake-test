public class Demo3 {
    public static void main(String[] args) {
        int age =18;

        if(age>10){
            System.out.println("Helloo.........");
        }

        if (age>18 || age>=18){
            System.out.println("Open Door....");
        }else {
            System.out.println("close the door....");
        }

        if (age>=18){
            System.out.println("Open Door...");
        } else if (age<18) {
            System.out.println("Call mummyy..");
        } else if (age<15) {
            System.out.println("Call the Police......");
        }
    }
}
