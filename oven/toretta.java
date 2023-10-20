package oven;

public class toretta {
    public static void main(String[] args){
        int random_number = (int)(Math.random() * 1_000_000_000);
        int random_country = (int)(Math.random() * 100);
        System.out.println("가상 번호를 생성합니다. 당신의 휴대전화 번호입니다.");
        System.out.println(random_country + " :" + random_number);
        boolean number;
        if(random_number % 2 == 0){
            number = true;
        }else{
            number = false;
        }
        System.out.println("당신의 번호는 짝수? 홀수? : " + (number == true ? ("짝수") : ("홀수")));
    }
}
