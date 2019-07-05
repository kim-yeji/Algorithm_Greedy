package com.company.standInLine1138;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class StandInLine implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] line = new int[num];

        for(int i=0;i<num;i++){
            line[i]=scan.nextInt();
        }

        perm(line, 0);

        for(int i=0;i<num;i++){
            int cnt = 0;
            for(int j=0;j<i;i++){

            }
        }


    }
    public void perm(int[] arr, int pivot) {
        if (pivot == arr.length) {
            print(arr);
            return;
        }
        for (int i = pivot; i < arr.length; i++) {
            swap(arr, i, pivot);
            perm(arr, pivot + 1);
            swap(arr, i, pivot); }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.println(arr[i]);
            else System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args){
        StandInLine s = new StandInLine();
        s.run();
    }
}
