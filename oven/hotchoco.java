package oven;
// 사용자로부터 입력값 2개를 받아서 입출력 단 짜기
import java.util.*;

public class hotchoco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input first key : ");
        int tensa = sc.nextInt();
        System.out.print("input second key : ");
        int tensa2 = sc.nextInt();
        for(int i = 1; i<tensa2+1; i++){
            System.out.printf("%d * %d = %d \n", tensa, i, tensa * i);
        }
    }
}