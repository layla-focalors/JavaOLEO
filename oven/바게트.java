package oven;

public class 바게트 {
    public static void main(String[] args){
        // 정밀도 비교 연산
        // float (4) = 6~7자리
        // double (8) = 15~16자리
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.println("[10.0 == 10.0f] >> " + (10.0 == 10.0f));
        System.out.println("['0.1 == 0.1f'] >> " + (0.1 == 0.1f));
        // 정밀도 차이와 근사값 차이로 인해서, false반환

        System.out.println("[f = %19.17f] >> " + f);
        // 정밀도 이상에서는 정확한 값이 저장되지 않음

        System.out.println("[d = %19.17f] >> " + d);
        System.out.println("[d2 = %19.17f] >> " + d2);

        System.out.println("[d2 == d] >> " + (d==f));
        // double 형으로 형 변환(d)자동이 진행되면서, float정밀도 이상의 값이 표현되며 false 반환
        // double 형 범위에서 정확히 0.1인 d와 0.00000000000.. 149 어쩌구은 f와는 다름
        System.out.println("[d == d2] >> " + (d==d2));
        System.out.println("[d2 == f] >> " + (d2==f));

        float temp = (float)d;
        System.out.printf("[(float)d == f] >> %b", temp==f);

    }
}
