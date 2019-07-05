package com.company.inequality;
import com.company.inter.AlgolRun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inequality implements AlgolRun {
    @Override
    public void run() {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(); //부등호 개수 입력
        String[] ineq = new String[num]; //부등호 들어갈 배열
        boolean[] visited = new boolean[10]; //0~9까지 사용 됐는지 확인 할 배열
        List<String> result = new ArrayList<>(); //결과를 담을 리스트

        ineq = scan.nextLine().split(" ");

    }
    public static void main(String[] args){
        Inequality i = new Inequality();
        i.run();
    }
}
