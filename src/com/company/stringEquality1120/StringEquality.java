package com.company.stringEquality1120;

import com.company.inter.AlgolRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEquality implements AlgolRun {
    @Override
    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] =br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        int max_same = 0;
        for(int i=0; i<B.length()-A.length()+1;i++){
            String tempB = B.substring(i,i+A.length());
            int same=0;
            for(int j=0;j<tempB.length();j++){
                if(A.charAt(j)==tempB.charAt(j)) ++same;
            }
            if(same>max_same) max_same=same;
        }
        System.out.println(A.length()-max_same);
    }

    public static void main (String[] args) throws IOException {
        StringEquality se = new StringEquality();
        se.run();
    }
}
