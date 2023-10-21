package cheese;

public class 페퍼_잭 {
    public static void main(String[] args){
        Rectangle rc = new Rectangle(10, 10, 30, 30, "pink");
        rc.showRectangleinfo();
    }
}
class Point{
    int x;
    int y;
    
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    void setX(int _x){
        this.x = _x;
    }
    void setY(int _y){
        this.y = _y;
    }
}
class Rectangle{
    Point p1;
    Point p2;
    String color;
    Rectangle(int x1, int y1, int x2, int y2, String color){
        this.p1 = new Point();
        this.p2 = new Point();

        p1.setX(x1);
        p1.setY(y1);

        p2.setX(x2);
        p2.setY(y2);
        this.color = color;
    }
    void showRectangleinfo(){
        int width = p2.getX() - p1.getX();
        int height = p2.getY() - p1.getY();
        System.out.printf("해당 도형의 색은 %s 이며, 도형의 넓이는 %dcm^2이고, 시작 위치는(%d, %d) 끝 위치는 (%s, %s) 입니다.", this.color, width * height, p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}