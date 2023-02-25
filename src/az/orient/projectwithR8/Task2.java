package az.orient.projectwithR8;

import java.util.Scanner;

public class Task2 {
    // https://www.hackerrank.com/challenges/java-substring?isFullScreen=true
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if(start>=0 && end>0){
            if(start<end){
                System.out.println(S.substring(start,end));
            }
        }return;


    }
}
