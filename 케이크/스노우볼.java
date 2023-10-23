package 케이크;
import java.util.Scanner;

public class 스노우볼 {
    public static void main(String[] args){
        // 시험 성적 입력받고 출력하기
        int score[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < 4; i++){
            System.out.printf("시험" + (i + 1) + "에 대한 성적 입력 >> : ");
            score[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j=0; j < score.length; j++){
            sum += score[j];
        }
        // 시험 성적 출력 
        System.out.println("당신의 최종 평균 점수 : " + sum / score.length);

        // 학점 평가
        char value;
        if(sum > 90){
            value = 'A';
        }else if(sum > 80){
            value = 'B';
        }else if(sum > 70){
            value = 'C';
        }else if(sum > 60){
            value = 'D';
        }else {
            value = 'F';
        }
        System.out.printf("당신의 최종 성적은 %c 입니다.", value);
    }
}
