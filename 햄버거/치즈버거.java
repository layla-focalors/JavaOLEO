package 햄버거;

public class 치즈버거 {
    public static void main(String[] args){
        float fl = 1.12345678910f;
        double d1 = 1.1234567890111234152611d;

        System.out.println(fl);
        System.out.println(d1);
        /*
         *  1.1234568
            1.1234567890111233
            // 출력 : 소수점 아래 6~7 / 15~16 까지 출력하고 나머지는 잘려서 안 나온다!
         */
    }
}
