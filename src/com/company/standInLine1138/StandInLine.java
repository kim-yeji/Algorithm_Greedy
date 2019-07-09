package com.company.standInLine1138;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class StandInLine implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); //인원 수 입력 받기

        int[] line = new int[num];


        for(int i=0;i<num;i++){
            int left = scan.nextInt();
            for(int j=0;j<num;j++){
                if(line[j]==0 && left==0){
                    line[j]=i+1;
                    break;
                }else if(line[j]==0){
                    left--;
                }
            }
        }
        for(int i=0;i<num;i++){
            System.out.print(line[i]+" ");
        }

    }

    public static void main(String[] args){
        StandInLine s = new StandInLine();
        s.run();
    }
}
