package coffee.tree;
// menu  output
import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class cherry {
    public static void main(String[] args){
        boolean isexit = false;
        Scanner sc = new Scanner(System.in);
        int value;
        do{
            System.out.println("다음의 메뉴에 대한 사용할 번호를 입력하세요.");
            System.out.println("1. 매수");
            System.out.println("2. 매도");
            System.out.println("3. 종료");
            value = sc.nextInt();
            switch(value){
                case 1:
                    System.out.println("매수");
                    break;
                case 2:
                    System.out.println("매도");
                    break;
                case 3:
                    isexit = true;
                    break;
                default:
                    System.out.println("NaGa");
                    isexit = true;
                    break;
            }
        }while(!isexit);
    }
}
