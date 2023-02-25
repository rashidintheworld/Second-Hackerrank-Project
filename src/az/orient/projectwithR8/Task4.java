package az.orient.projectwithR8;

import java.util.Scanner;

public class Task4 {
    // https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String AReverse = "";
        char c;
        for(int i=0 ; i<A.length();i++){
            c = A.charAt(i);
            AReverse = c+AReverse;
        }if(A.equals(AReverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
