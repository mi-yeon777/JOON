package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Joon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //키보드 입력받을 준비
        String S = sc.nextLine(); //nextLine() : 한 줄을 통째로 문자열로 입력받음

        // 알파벳 a~z 위치 저장 배열
        int[] positions = new int[26];
        Arrays.fill(positions, -1); // 기본값 -1

        // 문자열 순회
        //for 문은 주어진 조건을 만족하는 동안 반복적인 작업을 수행
        for (int i = 0; i < S.length(); i++) {
            //*문자열을 앞에서부터 검사
            // i는 문자열에서 현재 보고 있는 문자 인덱스(0부터)
            //S.length() : 문자열 길이
            //예: "beakjoon"이면 길이 8 → i는 0~7까지
            char c = S.charAt(i);
            //*i번째 문자 꺼내기
            //S.charAt(i) : 문자열에서 i번째 글자를 가져옴
            //예: i=0이면 b, i=1이면 e …
            int index = c - 'a';//알파벳을 배열 인덱스로 변환 (??a,c는 아스키 코드관련인가?)
            //자바에서 문자(char)는 내부적으로 숫자(유니코드 값)로 저장됨.
            //'a'를 빼면 알파벳 순서대로 0~25가 됨

            // 처음 등장한 경우만 저장
            //if문은 프로그래밍에서 조건을 판단하여 참(true)일 때만 특정 코드 블록을 실행하도록 하는 제어문
            if (positions[index] == -1) {
                positions[index] = i;
                //positions[index]가 아직 -1이면
                //→ 이 알파벳은 아직 등장한 적 없음
                // 그때만 현재 위치 i를 저장
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " ");
            //baekjoon 입력시 [ 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 ] 출력
        }
    }
}