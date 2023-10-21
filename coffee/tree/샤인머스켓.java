package coffee.tree;

public class 샤인머스켓 {
    public static void main(String[] args){
        // 클래스 변수는 인스턴스의 생성 전에도 접근이 가능하며, 인스턴스가 삭제되더라도, 접근 가능
        System.out.println(TV_A134.width);
        System.out.println(TV_A134.height);

        // 컬러를 지정하여 인스턴스 생성
        TV_A134 red = new TV_A134();
        red.set_color("pink");
        System.out.println(red.color);
        
        TV_A134 blue = new TV_A134();
        blue.set_color("white");
        System.out.println(blue.color);
        // 각 인스턴스는 독립된 저장공간을 가짐!

        // 단 클래스 변수는 동일한 저장공간을 공유하며, 각 인스턴스에서 호출할 수 있음
        System.out.println(blue.width);
        System.out.println(red.width);

        // 한번에 width값을 수정하면 나머지 인스턴스의 값도 변경됨
        blue.width = 2048;
        // 한 결과만 수정해도 나머지 전부가 바뀜
        System.out.println(blue.width);
        System.out.println(red.width);
    }
}
class TV_A134{
    static int width = 1280;
    static int height = 720;
    static String model_name = "a134";

    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelup() { channel++; }
    void channeldn() { channel--; }
    void set_color(String c) {color = c;}
    String get_color(){ return color; }
    int get_channel(){ return channel; }
}