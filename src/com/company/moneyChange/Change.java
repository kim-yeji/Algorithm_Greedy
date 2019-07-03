package com.company.moneyChange;
import com.company.inter.AlgolRun;

import java.util.Scanner;

public class Change implements AlgolRun{
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int[] coin = {10,50,100,500,1000,5000,10000,50000}; //화폐단위
        int cnt = 0; //거스름돈의 개수를 세는 변수

        int n = scan.nextInt(); //금액을 입력 받는다.
        while(n!=0){
            if(n>=coin[7]){
                n-=coin[7];
                cnt++;
            }
            else if(n>=coin[6]){
                n-=coin[6];
                cnt++;
            }
            else if(n>=coin[5]){
                n-=coin[5];
                cnt++;
            }
            else if(n>=coin[4]){
                n-=coin[4];
                cnt++;
            }
            else if(n>=coin[3]){
                n-=coin[3];
                cnt++;
            }
            else if(n>=coin[2]){
                n-=coin[2];
                cnt++;
            }
            else if(n>=coin[1]){
                n-=coin[1];
                cnt++;
            }
            else if(n>=coin[0]){
                n-=coin[0];
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    public static void main (String[] args){
        Change t = new Change();
        t.run();
    }
}
