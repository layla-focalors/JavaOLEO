package 케이크;

public class 슈크림케이크 {
    public static void main(String[] args){
        Rectangle rc = new Rectangle(10, 14, 20, 555, "pink");
        rc.ShowRectangleInfo();

        Rectangle tc2 = new Rectangle(10, 100, 90, 200, "Baby Pink");
        tc2.ShowRectangleInfo();
    }
}
class Point{
    int x;
    int y;

    int GetX(){
        return this.x;
    }
    int GetY(){
        return this.y;
    }
    void Setx(int _x){
        this.x = _x;
    }
    void SetY(int _y){
        this.y = _y;
    }
}
class Rectangle{
    Point p1;
    Point p2;
    String color;

    // 생성자 : 인스턴스 생성 시 호출하는 인스턴스 초기화 메서드
    Rectangle(int x1, int y1, int x2, int y2, String color){
        p1 = new Point();
        p2 = new Point();
        p1.Setx(x1); p1.SetY(y1);
        p2.Setx(x2); p2.SetY(y2);
        this.color = color;
    }
    void ShowRectangleInfo(){
        int width = p1.GetX() - p2.GetX();
        int height = p1.GetY() - p2.GetY();
        System.out.printf("해당 도형의 색은 %s 이며, 도형의 넓이는 %d이고, 시작 위치는 (%d, %d) 끝 위치는 (%d,%d) 입니다. \n",
        this.color, width * height, p1.GetX(), p1.GetY(), p2.GetX(), p2.GetY());
    }
}
