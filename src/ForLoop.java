import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//
//        System.out.println("enter salory1:");
//        double sal1 =input.nextDouble();
//
//        System.out.println("enter salory2:");
//        double sal2 =input.nextDouble();
//
//        System.out.println("enter salory3:");
//        double sal3 =input.nextDouble();
//
//        System.out.println("enter salory4:");
//        double sal4 =input.nextDouble();
//
//        System.out.println("enter salory5:");
//        double sal5 =input.nextDouble();
//
//        System.out.println("avg salary"+(sal1+sal2+sal3+sal4+sal5)/5);
//
//        double totalSalary =0.0;
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("Enter Employee Salary:");
//            totalSalary += input.nextDouble();
//
//            //when come total salary 100000 loop is stop..
//            if (totalSalary >=100000){
//                break;
//            }
//        }
//        System.out.println("Average salary"+totalSalary/5);

        String dbEmail ="admin@gmail.com";
        int password = 12345;

        boolean logedId =false;

        System.out.print("Enter Email:");
        String getEmail = input.next();


        for (int i = 0; i <= 5 ; i++){

            System.out.print("Enter Password:");
            int getPassword= input.nextInt();

           if (getEmail.equals(dbEmail) && getPassword == password){
               System.out.println("login");
               logedId =true;
               break;
           }else {
               int reEnterCount = 3 - i;
               if (reEnterCount > 0) {
                   System.out.println("Incorrect. Password: " + reEnterCount);
               } else {
                   System.out.println("Incorrect. No more chance.");
               }
           }
        }

        if (logedId) {

                System.out.print("නම අතුලත් කරන්න :");
                String name =input.next();


                System.out.print("වයස සදහන් කරන්න :");
                int age =input.nextInt();


                System.out.print("ලග්නය අතුලත් කරන්න :");
                String lagna =input.next();


                if (age > 18){
                    int code = name.charAt(0);
                    System.out.println(code);

                    String result;

                    if (code % 2==0  ){
                        result="ඔබ වසනාවන්තය.";
                    }else {
                        result="ඔබ අවාසනවන්තය.";
                    }
                    switch (lagna ) {
                        case "මේෂ":
                            System.out.println(name+" "+"මේෂ ලග්නය හිමි ඔබට යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්."+" "+result);
                            break;

                        case "වෘෂභ":
                            System.out.println(name+" "+"වෘෂභ  ලග්නය හිමි ඔබට අන් අයගේ සිත් දිනා ගනී"+" "+result);
                            break;

                        case "මිථුන":
                            System.out.println(name+" "+"මිථුන  ලග්නය හිමි ඔබට සිත නිතර චංචල වී, දුක් සහිත අත්දැකීම්"+" "+result);
                            break;

                        case "කටක":
                            System.out.println(name+" "+"කටක  ලග්නය හිමි ඔබට අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි."+" "+result);
                            break;

                        case "සිංහ":
                            System.out.println(name+" "+"සිංහ  ලග්නය හිමි ඔබට වස්තුව සහ සැප සම්පත් ලඟා වේ"+" "+result);
                            break;

                        case "කන්‍යා":
                            System.out.println(name+" "+"කන්‍යා ලග්නය හිමි ඔබට දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම"+" "+result);
                            break;

                        case "තුලා":
                            System.out.println(name+" "+"තුලා ලග්නය හිමි ඔබට හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය."+" "+result);
                            break;

                        case "වෘශ්චික":
                            System.out.println(name+" "+"වෘශ්චික ලග්නය හිමි ඔබට විවාහය අපේක්ෂකයින් ශුභයි"+" "+result);
                            break;

                        case "ධනු":
                            System.out.println(name+" "+"ධනු ලග්නය හිමි ඔබට රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්ය"+" "+result);
                            break;

                        case "මකර":
                            System.out.println(name+" "+"මකර ලග්නය හිමි ඔබට අධ්යාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට"+" "+result);
                            break;

                        case "කුම්භ":
                            System.out.println(name+" "+"කුම්භ ලග්නය හිමි ඔබට පවුලේ සමගිය සහ සතුට"+" "+result);
                            break;

                        case "මීන":
                            System.out.println(name+" "+"මීන ලග්නය හිමි ඔබට ඔබේ දක්ෂතා ක්රියාවෙන්ම ඔප්පු කර පෙන්වීමට"+" "+result);
                            break;

                        default:
                            System.out.println("මෙවැනි ලග්නයක් සොයාගත නොහැක."+" "+result);
                    }
                }else {
                    System.out.println("ඔබගේ වයස ප්රමානවත් නෙත.");
                }
        }else {
            System.out.println("Account is Locked..!");
        }

    }
}
