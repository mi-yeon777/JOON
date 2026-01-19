package day3;

import java.util.Scanner;

public class Joon2501 {
    public static void main(String[] args) {

        // Scanner 객체 생성
        // System.in → 키보드 입력
        Scanner sc = new Scanner(System.in);

        // nextInt()
        // -> 입력된 정수를 하나 읽어옴
        int N = sc.nextInt();   // 문제: 약수를 구할 대상 숫자N
        int K = sc.nextInt();   // 몇 번째 약수를 찾을지

        // 약수의 개수를 세기 위한 변수
        int count = 0;

        // for문
        // i를 1부터 N까지 1씩 증가시키며 반복
        for (int i = 1; i <= N; i++) {

            // if문
            // N % i == 0
            // → N을 i로 나눴을 때 나머지가 0이면 i는 N의 약수
            if (N % i == 0) {

                // 약수를 하나 찾았으므로 개수 증가
                count++;

                // 지금 찾은 약수가 K번째인지 확인
                if (count == K) {

                    // K번째 약수 출력
                    System.out.println(i);

                    // return
                    // → main 메서드 즉시 종료
                    return;
                }
            }
        }

        // for문이 끝날 때까지 K번째 약수를 못 찾은 경우
        // (즉, 약수의 개수가 K보다 적을 때)
        System.out.println(0);
    }
}

