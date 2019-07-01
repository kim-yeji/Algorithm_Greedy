package com.company.minimum_payment;
import com.company.inter.AlgolRun;

import java.util.Scanner;
public class Minimum_payment implements AlgolRun {
    private int[] arr = new int[5];
    private Scanner scan = new Scanner(System.in);

    @Override
    public void run(){
        double sum;
        int min1;
        int min2;
        int temp;
        for ( int i=0 ;  i <arr.length ; i++){
            arr[i] = scan.nextInt(); //100~2000원 사이의 가격 입력
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        min1=arr[0];

        if(arr[3]<arr[4]){
            min2 = arr[3];
        }else {
            min2 = arr[4];
        }
        sum = min1+min2+(min1+min2)*0.1;
        System.out.format("%.1f%n", sum);

    }

    public static void main (String[] args){
        Minimum_payment mp = new Minimum_payment();
        mp.run();

    }
}
