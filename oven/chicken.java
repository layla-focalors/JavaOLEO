package oven;

public class chicken {
    public static void main(String[] args){
        // 문자열과 여러 타입 간 + 연산을 진행했을 때, 어떤 결과를 나타내는지 확인하고 실습한다.
        // 피연산자가 모두 숫자일 경우, 덧셈 연산
        // 피연산자 중 문자 + 숫자도 덧셈 연산!
        // 피연산자 중 문자열이 있으면 문자열 결합 연산!
        String username = "layla-focalors";
        System.out.println("안녕하세요! 저는 " + username + "이에요!");
        System.out.println(
            "제가 좋아하는 캐릭터는! " + "Lumine!"
        );
        System.out.println(
            "제가 좋아하는 알파벳은 " + 'L'
        );
        System.out.println("제가 좋아하는 float 형 소수점은! " + 3.14f);
        System.out.println("제가 좋아하는 double 형 소수점은! " + 10.05);

        // 피연산자가 모두 정수일 때!
        System.out.println(7 + 7);

        // 피연산자가 정수의 덧셈 + 문자열일 때
        System.out.println(7 + 7 + ": 14");
    
        // 피연산자가 정수의 덧셈 및 문자일 때, ' '가 숫자로 변환됨! ( char -> 내부적으로 int 처리 )
        System.out.println(7 + 7 + 'L');
    }
}
