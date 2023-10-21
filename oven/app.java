package oven;

import javax.swing.plaf.synth.SynthStyle;

public class app {
    public static void main(String[] args){
        int[][] team = new int[][] {
            {100,100,100,100,100},
            {1004,1004,1004},
            {999, 999},
            {100,100,100,100,100}
        };
        System.out.println(team[3].length);
        int sum = 0;
        for(int i=0; i < team.length; i++){
            System.out.println("i : " + i);
            for(int j=0; j < team[i].length; j++){
                sum += team[i][j];
                // System.out.println(team[i][j]);
            }
            System.out.printf("%d팀의 합계는 %d 이며, 평균은 %.02f 입니다. \n", i, sum, sum / (double)team[i].length);
            sum = 0;
        }
        System.out.println(sum);

    }
}
