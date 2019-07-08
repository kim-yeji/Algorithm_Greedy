package com.company.japanChange5585;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class JapanChange implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int[] coin = {500,100,50,10,5,1};
        int money = scan.nextInt();
        money=1000-money;
        int cnt = 0;

        for(int i=0; i<6;i++){
            cnt= cnt+(money/coin[i]);
            money %= coin[i];
            if(money==0) break;
        }
        System.out.println(cnt);

    }
    public static void main(String[] args){
        JapanChange jc = new JapanChange();
        jc.run();
    }
}
