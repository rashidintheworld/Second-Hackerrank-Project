package az.orient.projectwithR8;

import java.util.*;

public class Task1 {
    //https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first letter..");
        String A = sc.next();
        System.out.println("Enter a second letter..");
        String B = sc.next();

        // *--------------------1-ci outputa hazirliq--------------------*

        int abLengthSum = A.length() + B.length();
        System.out.println(abLengthSum);

        // *--------------------2-ci outputa hazirliq--------------------*
        //compareToMetodu ve ya ASCII kod ile yaza bilerik
        int CompareEachOthers = A.compareTo(B);

        if(CompareEachOthers>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // *--------------------3-cu outputa hazirliq--------------------*

        System.out.println(A.toLowerCase().substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+ " " + B.toLowerCase().substring(0,1).toUpperCase()+B.substring(1).toLowerCase());

    }
}
