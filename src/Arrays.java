import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks =new int[2];
        String[] subject =new String[2];

        for (int i = 0 ; i< marks.length ; i++){

            System.out.print("Input Subject:");
            subject[i] =input.next();

            System.out.print("Input Marks:");
            marks[i] =input.nextInt();

        }

        int maxMarks = marks[0];
        String maxSubject = subject[0];
        double avg = 0.0;

        for (int i =0 ; i < subject.length; i++){
           avg +=marks[i];
           if (marks[i] > maxMarks){
               maxMarks =marks[i];
               maxSubject =subject[i];
           }
        }
        System.out.println(avg);
        System.out.println("Max Marked Subject is :"+maxSubject);

        System.out.println("Avg Marks of student :"+(avg/9));

    }
}
