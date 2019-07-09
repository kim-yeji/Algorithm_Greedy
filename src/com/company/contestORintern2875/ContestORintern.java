package com.company.contestORintern2875;

import com.company.inter.AlgolRun;

import java.util.Scanner;


public class ContestORintern implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //여학생
        int m = scan.nextInt(); //남학생
        int k = scan.nextInt(); //인턴 수

        int team = 0;
        while(n>=2 && m>=1 && n+m>= 3+k){
            n-=2;
            m--;
            team++;
        }
        System.out.println(team);

    }
    public static void main (String[] args){
        ContestORintern ci = new ContestORintern();
        ci.run();
    }
}
