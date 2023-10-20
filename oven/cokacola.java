package oven;
// 1부터 100까지의 누적합 구하기

public class cokacola {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i<101; i++){
            sum += i;
        }
        System.out.println(sum);
        // 정석
        sum = 0;
        for(int i=0; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
