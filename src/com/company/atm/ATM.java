package com.company.atm;

import com.company.inter.AlgolRun;

import java.util.*;

public class ATM implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);

        int sum = 0; // 걸리는 시간 합계
        int num = scan.nextInt(); //사람 수 입력 받기
        int[] time = new int[num]; //각 사람이 인출하는데 걸리는 시간을 저장할 배열선언

        for(int i=0;i<num;i++){
            time[i] = scan.nextInt();
        }

        Arrays.sort(time);

        for(int i=0;i<num;i++){
            for(int j=0; j<=i;j++){
                sum+=time[j];
            }
        }

        System.out.println(sum);

    }


    public static void main (String[] args){
        ATM a = new ATM();
        a.run();
    }
}
