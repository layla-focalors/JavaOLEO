package oven;
// 1~5 삼각별 찍기

import java.util.Scanner;

public class cupcake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input star triangle max value : ");
        int max = sc.nextInt();
        for(int i = 0; i < max; i ++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
