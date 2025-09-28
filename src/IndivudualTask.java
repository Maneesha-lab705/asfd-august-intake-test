import java.util.Scanner;

public class IndivudualTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count= 0;

        int[] cricket = new int[2];

        int higherScore =cricket[0];

        for (int i = 0 ; i < cricket.length; i++ ){
            System.out.print("Input Score:");
            cricket[i] =input.nextInt();

        }
        System.out.println("score:"+cricket[1]);

        for ( int i = 0; i< cricket.length; i++){
            count += cricket[i];
        }
        System.out.println("avg:"+(count/11));

        for (int i = 0 ;i < cricket.length; i++){
            if (cricket[i] > higherScore){
                higherScore =cricket[i];
            }
            System.out.println("higher Score:"+higherScore);
        }
    }
}
