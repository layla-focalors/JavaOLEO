package coffee.tree;
public class Olive{
    public static void main(String[] args){
        // break 문 테스트
        int i = 0;
        while(true){
            if(i == 1000){
                System.out.println("i가 1000이네요! 나갈게요! 바이바이");
                break;
            }
            i += 1;
        }
    }
}