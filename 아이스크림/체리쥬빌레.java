package 아이스크림;


public class 체리쥬빌레{
    class Crayon{
        int height;
        String name;
        String color;

        void set_crayon_name(String name){
            this.name = name;
        }
        void set_crayon_height(int height){
            this.height = height;
        }
        void set_crayon_color(String color){
            this.color = color;
        }

        String get_crayon_name(){
            return this.name;
        }
        String get_crayon_color(){
            return this.color;
        }
        int get_crayon_height(){
            return this.height;
        }
    }
    class Maker{
        Crayon height;
        Crayon color;
        Crayon name;
        Crayon cr = new Crayon();

        Maker(String color){
            Crayon cr = new Crayon();
            cr.set_crayon_color(color);
        }
        Maker(int height, String name, String color){
            this(color);
            Crayon cr = new Crayon();
            cr.set_crayon_height(height);
            cr.set_crayon_name(name);
        }
        void display_crayon(){
            System.out.printf("크레용의 길이는 %d 이고, 이름은 %s, 색은 %s 입니다.", cr.get_crayon_height(), cr.get_crayon_name(), cr.get_crayon_color());
        }
    }
    public static void main(String[] args){
        // 크레용 클래스 만들기
        체리쥬빌레 cj = new 체리쥬빌레();
        체리쥬빌레.Maker mk = cj.new Maker(2, "이쁜거", "핑크");
        mk.display_crayon();
    }
}