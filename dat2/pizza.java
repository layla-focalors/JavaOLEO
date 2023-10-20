package dat2;
import java.util.Scanner;

public class pizza {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input error code");
        String err = sc.nextLine();
        String err_out;
        char box = err.charAt(0);
        if(box >= 'a' & box <= 'z'){
            err.replace(box, (char)(box - 32));
        }
        System.out.println("your error code : " + err);
        switch(err){
            case "e001":
            case "E001":
                err_out = "who are you!! i don't know your error code";
                System.out.println("oreo return " + err_out);
                break;
            default:
                err_out = "Knoledge that has not been proven by logic and experiments are prejudice";
                System.out.println("oreo return " + err_out);
                break;
        }
    }
}
