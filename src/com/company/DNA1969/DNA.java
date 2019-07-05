package com.company.DNA1969;

import com.company.inter.AlgolRun;

import java.util.Scanner;

public class DNA implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int hd = 0; //hamming distance
        int max = 0;
        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] dna = new String[n];

        for(int i=0;i<n;i++){
            dna[i]=scan.next();
        }
        for(int i=0;i<m;i++){
            int a=0, g=0, c=0, t=0;
            for(int j=0;j<n;j++) {
                switch (dna[j].charAt(i)) {
                    case 'A': a++; break;
                    case 'G': g++; break;
                    case 'C': c++; break;
                    case 'T': t++; break;
                }
            }
            max = Math.max(a>c? a:c, g>t?g:t); //제일 카운트 많이 된 알파벳 가려내기
            hd += (n-max);

            if(max==a) System.out.print("A");
            else if(max==c) System.out.print("C");
            else if(max==g) System.out.print("G");
            else if(max==t) System.out.print("T");

        }
        System.out.println("\n"+hd);

    }
    public static void main(String[] args){
        DNA dna = new DNA();
        dna.run();
    }
}
