package coffee.tree;

public class Palm {
    public static void main(String[] args){
        // continue 문 테스트
        int i = 0;
        while(true){
            if(i%2==0){
                System.out.println("continue를 실행했어요");
                continue;
            }
            i += 1;
            System.out.println(i);

        }
    }
}
