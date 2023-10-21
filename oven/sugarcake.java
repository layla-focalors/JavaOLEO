package oven;

public class sugarcake {
    public static void main(String[] args){
        // 리터럴과 문자열 리터럴 알아보기!
        char ch = 'A';
        char bin = 0b10000001;
        char ch_16 = 0x0041;
        // 다양한 문자 변수 선언!
        // 단! ' ' 에는 공백이나 띄어쓰기가 속하지 않음!
        
        // 다양한 문자열 변수 언언
        String str = "ABCDE";
        // 참조자료형 String은 new연산자로 초기화가 가능해요
        String str_origin = new String("ABCDE");
        String str_ch = "A";
        String str_null = "";
        String str_space = " ";

        // char자료형에는 " " 문자열 리터럴을 저장할 수 없음!
        // String 자료형에는 ' '문자 리터럴을 사용할 수 없음!

        // 출력!
        System.out.println(ch);
        System.out.println(bin);
        System.out.println(ch_16);
        System.out.println(str);
        System.out.println(str_origin);
        System.out.println(str_ch);
        System.out.println(str_null);
        System.out.println(str_space);

        // 문자 리터럴과 문자열 리터럴의 연산
        char ch_offerland = '1';
        String str_offeland = "HI";

        System.out.println(ch_offerland + ch_offerland);
        System.out.println((char) ch_offerland + ch_offerland);
        System.out.println(str_offeland + str_offeland);
        System.out.println(ch + str_offeland);

        // 연산
        // 피연산자가 모두 숫자라면 " 덧셈 연산 "을
        // 피연산자 중 하나라도 "문자열"일 경우 문자열 결합 연산 수행!
    }
}
