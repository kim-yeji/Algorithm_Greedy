package com.company.coin;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class Coin implements AlgolRun {
    @Override
    public void run(){
        Scanner scan = new Scanner(System.in);
        int cnt = 0; //거스름돈의 개수를 세는 변수

        int n = scan.nextInt(); //사용할 화폐 개수를 입력 받는다.
        int k = scan.nextInt(); //금액을 입력 받는다.
        int[] coinPrint = new int[n]; //화폐단위를 입력받을 배열

        for(int i=0;i<n;i++){
            coinPrint[i] = scan.nextInt();
        }


        for(int i=n-1 ;i>=0;i--){
            //System.out.println("몫: "+k/coinPrint[i]);
            cnt = cnt+ (k/coinPrint[i]);  //뺄셈을 반복할 필요 없이 입력받은 금액에서 나눗셈을 하여 몫을 count한다
            k = k % coinPrint[i];
        }
        System.out.println(cnt);
    }
    public static void main (String[] args){
        Coin c = new Coin();
        c.run();
    }
}
