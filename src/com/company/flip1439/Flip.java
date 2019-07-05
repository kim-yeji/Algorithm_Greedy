package com.company.flip1439;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class Flip implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int one = 0;
        int zero=0;

        if(str.charAt(0)=='0') zero++;
        else one++;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                if(str.charAt(i)=='0') zero++;
                else one++;
            }
        }
        int cnt = (one<zero ? one:zero);
        System.out.println(cnt);

    }
    public static void main(String[] args){
        Flip f = new Flip();
        f.run();
    }
}
