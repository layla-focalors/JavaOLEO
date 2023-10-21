package wine;

public class 민들레주 {
    /*
     * 자바에서의 초기화 방법!( 순서대로 )
     * 클래스 변수 및 클래스 초기화블럭 static{} 초기화
     * 명시적 초기화 ( a = 100등 )
     * 인스턴스 변수 및 인스턴스 초기화블럭 { } 초기화
     * 생성자 초기화
     */
    public static void main(String[] args){
        Sample sa = new Sample();
        sa.print_values();   
    }
}
class Sample{
    int sample_value = 9999;
    int sample_value1;
    int sample_value2;
    int sample_value3;
    static int sample_static;
    // 메서드 초기화블럭
    static {
        System.out.println("클래스 변수 초기화 실행");
        sample_static = 1_000;
    }
    {
        System.out.println("명시적 초기화 실행 sample_value0 : " + sample_value);
        System.out.println("인스턴스 초기화 블럭 실행");
        sample_value1 = 300;
        if(sample_value == 1000) {
            sample_value2 = 200;
        }else {
            sample_value2 = 900;
        }
        // 분기 초기화가 가능하다! - 인스턴스 초기화블럭
    }
    Sample(){
        System.out.println("생성자 호출");
        sample_value3 = 300;
    }
    void print_values(){
        System.out.println("sample_value : " + sample_value);
        System.out.println("Sample_value1 : " + sample_value1);
        System.out.println("sample_value2 : " + sample_value2);
        System.out.println("sample_value3 : " + sample_value3);
        System.out.println("staic value : " + sample_static);
    }
}
