package coffee.tree;
import java.util.Scanner;

public class apple {
    public static void main(String[] args){
        // 0 /  짝수 입력 시 강제 종료 프로그램
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean isexit = false;
        do{
            System.out.println("번호를 입력하세요. ");
            value += sc.nextInt();
            if(value % 2 == 0 || value == 0){
                isexit = true;
            }
        }while(!isexit);
        System.out.print("last : " + value);
    }
}
