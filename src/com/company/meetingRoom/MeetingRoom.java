package com.company.meetingRoom;

import com.company.inter.AlgolRun;

import java.util.*;

//회의 시간을 정렬할 때 가장 많은 회의를 선택하도록 정렬하는 방법은
//끝나는 시간을 기준으로 정렬을 하는 것이다.
//가장 빨리 끝나는 회의를 먼저 고려한다면 그만큼 뒤에 남아있는 회의가 많기 때문이다.
//종료 시간이 같을 때는 시작 시간이 빠른 순서대로 정렬해야 한다.
public class MeetingRoom implements AlgolRun {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(); //회의의 개수 입력 받기
        int[][] schedule = new int[num][2]; //회의의 시작 시간, 끝나는 시간

        for(int i=0;i<num;i++){
            schedule[i][0] = scan.nextInt(); //회의의 시작 시간
            schedule[i][1] = scan.nextInt(); //끝나는 시간 입력
        }

        Arrays.sort(schedule, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) {
                //start[0], end[0] 배열은 arr[][] 의 첫번째 라인(시작시간)이다.
                //start[1], end[0] 배열은 arr[][] 의 두번째 라인(종료시간)이다.
                if(start[1]==end[1]){
                    //만약 비교하는 값의 종료시간이 같을 경우 시작시간으로 정렬한다.
                    return Integer.compare(start[0], end[0]);
                }
                //종료시간에 따라 정렬한다.
                return Integer.compare(start[1], end[1]);
            }
        });
        int cnt = 0;
        int end = -1;
        //현재 시작시간이 이전 종료시간보다 늦을 경우
        for(int i=0;i<num;i++) {
            if (schedule[i][0]>=end){
                //System.out.println(arr[i][0] + " " + arr[i][1]);
                end = schedule[i][1];    //현재 종료시간을 다음 시작시간과 비교하기위해 저장
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main (String[] args){
        MeetingRoom mr = new MeetingRoom();
        mr.run();

    }
}
