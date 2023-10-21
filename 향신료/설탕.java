package 향신료;

public class 설탕 {
    public static void main(String[] args){
        // 서로 다른 문자열 참조 변수를 비교해보기!
        String str2 = "Layla";
        // 단일 할당은! CallStack 영역
        String str1 = new String("Layla"); 
        // new 로 할당한건 인스턴스 영역 : HEAP

        // 문자열의 == 는 참조 값이 같은지 비교! ( 참조 자료형이기 때문에 )
        System.out.println(str2 == str1);
        System.out.println(str1 == str1);

        // 문자열 내부의 값으로만 비교하기!
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str2));

        // 문자열을 안에 놓고 비교하기!
        System.out.println("Layla".equals(str1));
        System.out.println(str1.equals("Layla"));

        // equalsignorecase
        System.out.println(str1.equalsIgnoreCase("layla"));
    }
}
