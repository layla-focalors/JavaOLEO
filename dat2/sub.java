package dat2;
import java.util.Scanner;

public class sub {
    public static void main(String[] args){
        int[] scores = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i ++){
            System.out.print("exam " + i + "'s score' : ");
            scores[i] = sc.nextInt();
        }
        int sum_in_score = 0;
        for(int j = 0; j < scores.length; j ++ ){
            sum_in_score = sum_in_score + scores[j];
        }
        System.out.println(sum_in_score);
        System.out.println("mean at score : " + sum_in_score / scores.length);
        char rank;
        if(sum_in_score > 90){
            if(sum_in_score > 95){
                rank = 'S';
            }else{
                rank = 'A';
            }
        }else if(sum_in_score > 80){
            rank = 'B';
        }else if(sum_in_score > 70){
            rank = 'C';
        }else if(sum_in_score > 60){
            rank = 'D';
        }else {
            rank = 'F';
        }
        System.out.println("your rank is :" + rank);
    }
}
