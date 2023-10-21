package oven;

public class cookie {
    public static void main(String[] args){
        // 심볼릭 상수의 선언
        /* final 키워드로 선언한다
         * 1회 초기화 시 초기화 불가! 선언 시 초기화 권장!
         * 그래도! 메모리에 기록됨! ( cpu의 연산 대상이 되기 위해서는 메모리에 기록되어야 한다! )
         */
        /*
         * 리터럴 상수는 이런 거! =300 , 메모리를 자료형에 근거하여 할당받지만! 
         * 주소를 기록하지 않아서! 1회 사용 후 CallStack영역으로 호출되고 사용 후 사라짐!(재사용 불가)
         */
        final int SYMBOLE = 100;
        final double PI_LEVEL = 3.14;

        // SYMBOLE = 120;
        // 초기화 시도 시 오류 발생! : 1회 초기화 특성 ( ROM 같이 동작 )
        System.out.println(SYMBOLE);
        System.out.println(PI_LEVEL);
    }
}
