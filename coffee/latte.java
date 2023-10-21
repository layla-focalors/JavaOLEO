package coffee;
import java.util.*;
public class latte{
    public static void main(String[] args){
        // -1 입력 시까지 입력받아 합계를 구하는 프로그램
        int meta_value = 0;
        Scanner sc = new Scanner(System.in);
        boolean isexit = false;
        do{
            System.out.print("input your number : ");
            int value = sc.nextInt();
            if(value == -1){
                break;
            }else {
                meta_value += value;
            }
        }while(!isexit);
        System.out.println("your input total : " + meta_value);
    }
}