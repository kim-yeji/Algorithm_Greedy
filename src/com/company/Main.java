package com.company;

import com.company.DNA1969.DNA;
import com.company.atm.ATM;
import com.company.bracket.Bracket;
import com.company.coin.Coin;
import com.company.contestORintern2875.ContestORintern;
import com.company.flip1439.Flip;
import com.company.japanChange5585.JapanChange;
import com.company.meetingRoom.MeetingRoom;
import com.company.minimum_payment.Minimum_payment;
import com.company.moneyChange.Change;
import com.company.polynomial2200.Polynomial;
import com.company.rope.Rope;
import com.company.standInLine1138.StandInLine;
import com.company.stringEquality1120.StringEquality;
import com.company.temperature.Temperature;

import java.io.IOException;


public class Main {

    public static void main (String[] args) throws IOException {

        if (args.length > 0) {
            if ("3120".equals(args[0])) { //코드업 190701
                (new Temperature()).run();
            } else if ("2001".equals(args[0])) {//코드업 190701
                (new Minimum_payment()).run();
            } else if ("1398".equals(args[0])) {//코드업 190701~2
                (new Change()).run();
            } else if ("11047".equals(args[0])) { //여기부터 백준 190703
                (new Coin()).run();
            } else if ("11399".equals(args[0])) { //190703
                (new ATM()).run();
            } else if ("1931".equals(args[0])) { //190704
                (new MeetingRoom()).run();
            } else if ("2217".equals(args[0])) { //190704
                (new Rope()).run();
            } else if ("1541".equals(args[0])) { //190704
                (new Bracket()).run();
            } else if ("1969".equals(args[0])) { //190705
                (new DNA()).run();
            } else if ("2200".equals(args[0])) { //190705
                (new Polynomial()).run();
            } else if ("1439".equals(args[0])) { //190705
                (new Flip()).run();
            } else if ("5585".equals(args[0])) { //190708
                (new JapanChange()).run();
            } else if ("1120".equals(args[0])) { //190709
                (new StringEquality()).run();
            } else if ("1138".equals(args[0])) { //190709
                (new StandInLine()).run();
            } else if ("2875".equals(args[0])) { //190709
                (new ContestORintern()).run();
            }
        } else {
            System.out.println("Input the Argument!");
        }
    }
}
