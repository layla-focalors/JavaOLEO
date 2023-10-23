package 케이크;

public class 생크림케이크 {
    public static void main(String[] args){
        // 가변 배열 생성하고, 값 입력하기
        int score[][] = {
            {10, 9, 10, 5, 8, 4, 7},
            {5, 9, 5, 5, 10, 6, 1},
            {7, 5, 2, 1},
            {1, 2, 4, 2},
            {10, 10, 10, 10, 10, 10, 10, 10}
        };
        System.out.println(score.length);
        int sum = 0;
        for(int i=0; i<score.length; i++){
            for(int j=0; j<score[i].length; j++){
                sum += score[i][j];
            }
            System.out.printf("%d 팀의 합계는 %d 이며, 평균 값은 %.2f 입니다.\n", i + 1, sum, (double) sum / score[i].length);
            sum = 0;
        }
    }
}
