package 아이스크림;

public class 바닐라 {
    public static void main(String[] args){
        Crayon cr = new Crayon("pink", "layla", 999999);
        cr.get_crayon();
        Crayon cr2 = new Crayon("혜인", "object", 30);
        cr2.get_crayon();
    }
}
class Crayon{
    int height;
    String color;
    String Ownername;

    // 생성자의 메서드 오버로딩 시에도 같은 이름을 가지고, 다른 매개변수를 가져야 함!
    // 매개변수의 수 혹은 타입이 달라야 하기 때문에
    Crayon(String color){
        this.color = color;
    }
    Crayon(String color, String name){
        this(color);
        this.Ownername = name;
    }
    Crayon(String color, String name, int height){
        this(color, name); 
        // 다른 생성자를 가져올 때는 첫째 줄에 명시! ( 재활용 )
        this.height = height;
    }
    void get_crayon(){
        System.out.printf("크레용의 정보! : 소유자 - %s, 색상 - %s, 길이 %d\n", Ownername, color, height);
    }
}