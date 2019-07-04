package com.company.rope;

import com.company.inter.AlgolRun;

import java.util.Arrays;
import java.util.Scanner;

public class Rope implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);

        int ans=0;
        int n = scan.nextInt(); //로프의 개수 입력 받기
        int[] weight = new int[n]; //각 로프가 견딜 수 있는 최대 중량 입력배열

        for(int i=0;i<n;i++){
            weight[i] = scan.nextInt();
        }

        Arrays.sort(weight);
        for(int i=n-1; i>=0; i--){
            if(ans < weight[i]*(n-i) ){
                ans = weight[i]*(n-i);
            }
        }
        System.out.println(ans);

    }
    public static void main (String[] args){
        Rope r = new Rope();
        r.run();
    }
}
