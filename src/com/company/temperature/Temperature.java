package com.company.temperature;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class Temperature implements AlgolRun {
    public void run(){
        int[] arr = {1,-1,5,-5,10,-10}; //온도 가짓수
        int[] temp = new int[6]; // b(목표온도)-arr[i] >>>목표온도와의 근삿값을 찾기 위해
        int[] dis = new int[6]; //b - temp[i] 정렬해서 가장 작은 값 찾기

        int cnt=0;

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //값을 입력 받는다. (현재 온도)
        int b = scan.nextInt(); //목표 온도값을 입력 받는다.
        int min=100;

       while(min!=0){
           if(a==b) break;  //만약 현재온도=목표온도라면 stop
           for (int i = 0; i < 6; i++) {
               temp[i] = a + arr[i]; //온도 가짓수+현재 온도
               dis[i] = Math.abs(b-temp[i]); //근사값을 구하기 위해 절대값을 취함
           }

           for (int i = 0; i < 6; i++) {

               for(int j=0;j<5;j++){
                   if(dis[j]>dis[j+1]) { //근사값이 가장 작은 것을 찾기위한 정렬
                       int tmp = dis[j];
                       dis[j] = dis[j + 1];
                       dis[j + 1] = tmp;
                   }

                   if(min==0) break; //min이 0이면 목표온도에 도달
                   min=dis[0];

               }
                for(int j=0;j<6;j++){
                    if(Math.abs(b-temp[j])==min){  //근사값이 가장 작은 배열의 위치를 알기 위한 if문
                        a=temp[j];
                    }
                }
           }
           cnt++;
       }

        System.out.println(cnt);

    }
    public static void main (String[] args){
        Temperature t = new Temperature();
        t.run();

    }
}
