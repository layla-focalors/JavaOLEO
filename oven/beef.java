package oven;

public class beef {
    public static void main(String[] args){
        // 자동 형 변환 테스트!
        int a = 9999999;
        double b = 1828811;
        double total = a + b;
        System.out.println(total);
        // 더 큰 자료형을 기반으로 자동으로 따라감!
        // int = 4byte, double = 8byte

        long numberA = 1000000;
        int numberB = 100;
        long totals = numberA + numberB;
        System.out.println(totals);
        // 위와 똑같음! int4 , long = 8, 
        /*
         * 정수형
         * 1    2     4   8
         * byte short int long
         */

        //  강제 형 변환이 필요한 경우!
        char as = 'L';
        char as2 = 'I';
        char astotal = (char)(as + as2);
        // 이 경우! int로 바꾸어 연산되어 강제 형 변환이 필수가 됨!
        System.out.println(astotal);
    }
}
