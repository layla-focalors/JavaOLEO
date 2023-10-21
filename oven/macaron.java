package oven;

public class macaron {
    public static void main(String[] args){
        // 오버플로우 연산 테스트하기!
        // byte 자료형의 범위는 -128~+127! 즉, 누적합 테스트하기!
        byte test_sample = 0;
        for(int i=0; i<300; i++){
            test_sample += 1;
            System.out.print(test_sample + " ");
            // -128을 넘은 순간부터 +1씩 더해짐!
        }

        // 다른 자료형의 오버플로우!
        // 2byte
        short short_min = -32768;
        short short_max = 32767;
        // 1byte
        byte min = -128;
        byte max = 127;
        System.out.println("short min " + short_min);
        System.out.println("overflow : " + (short)(short_min + 1));

        System.out.println("short_max : " + short_max);
        System.out.println("overflow : " + (short)(short_max + 1));

        System.out.println("byte min : " + min);
        System.out.println("overflow : " + (byte)(min + 1));
        System.out.println("byte max : " + max);
        System.out.println("overflow : " +(byte)(max + 1));
        // ? . <
        // 즉! 오버플로우시 역순으로 +1이 된다! ( 진행 방향 > , 오버플로우 < )
    }
}
