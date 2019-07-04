package com.company.bracket;

import com.company.inter.AlgolRun;

import java.util.Scanner;

//첫 번째 뺄셈이 나온 이후로 그 다음 뺄셈기호를 만날때까지 괄호를 친다(더한다).
public class Bracket implements AlgolRun {
    @Override
    public void run() {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int num = 0; //입력 숫자 구분용
        int sum = 0; //+연산 (괄호 안 합산)
        int ans = 0; //answer

//             해당 flag는 - 부호가 나와서 앞서 계산된 값을 저장할 때,
//             해당 값의 부호를 나타내는 기호이다.
//             첫번째 값은 무조건 양수이므로 +인 true이고,
//             이후 한번이라도 -가 나온 경우 false를 유지한다.
//             중간에 나오는 +연산은 -를 위해 더 해주기만 할 뿐이므로 true로 바꾸지 않는다.

        boolean flag = true;

//            0 -> 아스키코드 48
//            + -> 43
//            - -> 45

        for(char c : str.toCharArray()){
            int su = c - '0';
            if(su < 0){
                sum += num; // 부호가 나오면 일단 sum에 더해준다. (-는 앞의 값에 영향을 주지 않음)
                num = 0; // 부호가 나왔으므로 새로운 숫자를 위해 초기화
               if (c == '-') {
                   // -가 나오면 flag에 따라 최종 값에 더해준다.
                   if (flag) ans += sum; // 음수
                   else ans -= sum; // 양수
                   sum = 0; // 괄호가 시작되었으므로 초기화 한다.
                   flag = false;
                }
            }else{
                num = num *10 + (c-'0');
            }
        }
        sum += num; // 마지막 숫자 괄호 안 합산
        System.out.println(ans + (flag ? sum : -1 * sum)); // 부호에 따라 마지막 값 처리

    }

    public static void main (String[] args){
        Bracket b = new Bracket();
        b.run();
    }
}
