package cheese;

public class 체다치즈 {
    public static void main(String[] args){
        // 메소드 오버로딩
        체다치즈 ch = new 체다치즈();
        int a = 10; int b = 20;
        ch.add(a, b);
        System.out.println(ch.sum(a));
        ch.sum(a, b);
        // ch.sum(b);
    }

    void add(int num1, int num2){
        System.out.println(num1 + num2);
    }
    void add(float num1, float num2){
        System.out.println(num1 + num2);
    }
    void add(char num1, char num2){
        System.out.println(num1 + num2);
    }
    int sum(int a){
        return a;
    }
    void sum(int a, int b){
        System.out.println(a + b);
    }
}
