package 향신료;
import java.util.Scanner;

public class 소금 {
    // 논리 연산자 파악하기!
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("정수를 입력하세요!");
        int value = sc.nextInt();
        
        System.out.println("이 값은..! 100보다 " + ((value >= 100) ? "크거나 같다" : "작거나 같다") + "인 것 같아요.");
        System.out.println("이 값은..! " + ((value%2 == 0) ? "짝수" : "홀수") + "같아요!");

        System.out.println("그럼에 따라! 이 값은 두 조건에 따라 " + ((value >= 100 & value % 2 == 0) ? true : false) + "이네요!");
    }
}
