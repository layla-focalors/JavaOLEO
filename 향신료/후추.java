package 향신료;

import javax.swing.text.Style;

public class 후추 {
    public static void main(String[] args){
        // Short circuit Evaluation
        int left = 10; int right = 20;
        if(++left == 11 || ++right == 21){
            System.out.println(left);
            System.out.println(right);
            // SCE로 인해서 RIGHT는 데이터가 증감되지 않아요! 
            // IF문에서 OR 문이 적용됨에 따라 LEFT - TRUE가 되면서 패스됨!!
        }
        boolean bypass = true;
        if(!bypass && ++right == 21){
            System.out.println(right);
        }else{
            System.out.println(right);
        }
        // and도 똑같이 한 쪽이 false임에 따라서 무시함! 뒤에 값이 증감되지 않음
    }
}
