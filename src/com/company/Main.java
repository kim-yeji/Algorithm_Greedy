package com.company;

import com.company.atm.ATM;
import com.company.coin.Coin;
import com.company.minimum_payment.Minimum_payment;
import com.company.moneyChange.Change;
import com.company.temperature.Temperature;



public class Main {

    public static void main (String[] args){

        if (args.length > 0) {
            if ("3120".equals(args[0])) { //코드업
                (new Temperature()).run();
            } else if ("2001".equals(args[0])) {//코드업
                (new Minimum_payment()).run();
            } else if ("1398".equals(args[0])) {//코드업
                (new Change()).run();
            } else if ("11047".equals(args[0])) { //여기부터 백준
                (new Coin()).run();
            } else if ("11399".equals(args[0])) {
                (new ATM()).run();
            }
        } else {
            System.out.println("Input the Argument!");
        }
    }
}
