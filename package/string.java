public class string{
    public static void main(String[] args){
        String sentecne = "A Polite conversaion about something much less important like traffic or weather";
        // 문자열 리터럴 사용 > 공백 o, 여러 개의 문자를 저장할 수 있고, 내부적으로는 캐릭터 자료형으로 설계됨
        // charAt, 인덱스에 존재하는 문자 출력
        System.out.println(sentecne.charAt(0));
        System.out.println(sentecne.charAt(1));
        System.out.println(sentecne.charAt(2));
        System.out.println(sentecne.charAt(3));
        System.out.println(sentecne.charAt(4));
        System.out.println(sentecne.charAt(5));
        System.out.println(sentecne.charAt(6));
        System.out.println(sentecne.charAt(7));

        for(int i = 0; i < sentecne.length(); i++){
            // 한 줄로 출력하기
            System.out.print(sentecne.charAt(i));
            // System.out.println(sentecne.charAt(i));
        }

        // 특정 범위의 인덱스 추출하기
        System.out.println(sentecne.substring(3, 8) + "\n");
        System.out.println("이것이 내가 원한 문자열인가? : " + sentecne.substring(3, 8).equals("Polite"));
        System.out.println("length for strings : " + sentecne.length());
        char[] charrar = sentecne.toCharArray();
        System.out.println(charrar.length);
        // String stringarr = charrar.toString();
    }
}