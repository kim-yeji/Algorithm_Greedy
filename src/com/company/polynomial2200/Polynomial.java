package com.company.polynomial2200;

import com.company.inter.AlgolRun;

import java.util.Scanner;
//문제는 누적인데 나는 잘못 이해하고 한 번씩 누른 개수 구함ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ으악아강가악아란악
public class Polynomial implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int cnt=0;
        int num = scan.nextInt();
        int[] input = new int[num+1];
        for(int i=0; i<=num; i++){
            input[i]=scan.nextInt();
        }

        for(int i=num;i>=0;i--){
            if(input[i]==0) {
                continue;
            }else if(input[i]>1){
                int tmp = (int)(Math.log10(input[i])+1);
                cnt += tmp;
                if(i!=num) cnt+=(num-i);

            }
            else{
                cnt+=(num-i);
            }
        }
        cnt+= (cnt-1);
        System.out.println(cnt);
    }

    public static void main (String[] args){
        Polynomial p = new Polynomial();
        p.run();
    }
}
