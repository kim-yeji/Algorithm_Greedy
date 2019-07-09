package com.company.stringEquality1120;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class StringEquality implements AlgolRun {
    @Override
    public void run(){
        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String B = scan.next();
        int max = 0;
        for(int i=0; i<B.length()-A.length()+1;i++){
            int dup=0;
            for(int j=i; j<i+A.length();j++){
                if(A.charAt(j-i)==B.charAt(j)) dup++;
            }
            if(dup>max) max=dup;
        }
        max+=(B.length()-A.length());
        System.out.println(B.length()-max);
    }

    public static void main (String[] args) {
        StringEquality se = new StringEquality();
        se.run();
    }
}
