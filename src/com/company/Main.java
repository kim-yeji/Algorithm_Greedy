package com.company;

import com.company.minimum_payment.Minimum_payment;
import com.company.temperature.Temperature;



public class Main {

    public static void main (String[] args){

        if (args.length > 0) {
            if ("3120".equals(args[0])) {
                (new Temperature()).run();
            } else if ("2001".equals(args[0])) {
                (new Minimum_payment()).run();
            }
        } else {
            System.out.println("Input the Argument!");
        }
    }
}
