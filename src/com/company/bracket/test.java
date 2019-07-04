package com.company.bracket;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();

                int num = 0; // 입력 숫자 구분용
                int sum = 0; // +연산을 위한 변수(괄호 안 숫자 합산용)
                int answer = 0; // 최종 정답

                boolean flag = true; // +일 경우 true, -일 경우 false
                for (char c : input.toCharArray()) {
                        int su = c - '0';
                        if (su < 0) {
                                sum += num; // 부호가 나오면 일단 sum에 더해준다. (-는 앞의 값에 영향을 주지 않음)
                                num = 0; // 부호가 나왔으므로 새로운 숫자를 위해 초기화
                                if (c == '-') {
                                        // -가 나오면 flag에 따라 최종 값에 더해준다.
                                        if (flag) answer += sum; // 음수
                                        else answer -= sum; // 양수
                                        sum = 0; // 괄호가 시작되었으므로 초기화 한다.
                                       flag = false;
                                    }
                            } else num = num * 10 + (c - '0');
                    }
                sum += num; // 마지막 숫자 괄호 안 합산
                System.out.println(answer + (flag ? sum : -1 * sum)); // 부호에 따라 마지막 값 처리
            }
}
