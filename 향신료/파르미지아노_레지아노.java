package 향신료;

public class 파르미지아노_레지아노 {
    public static void main(String[] args){
        // 삼항 연산자와 복합 대입 연산자에 대해서 다룬다!
        boolean volc = (100%2==0) ? true : false;
        System.out.println("100은 짝수인가요! " + volc);
        // 100에서 짝수 처리에 대한 방법!

        // 복합 대입 연산자
        int value = 100;
        value += 200;
        System.out.println(value);
        // =op 형태로 이루어짐!
    }
}
