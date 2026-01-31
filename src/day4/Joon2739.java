package day4;
//[반복문]구구단

import java.util.Scanner;

public class Joon2739 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt(); // 단 입력

        //for문 횟수가 미리 정해져 있을 때 특정 코드 블록을 반복 실행
        //for(초기화식; 조건식; 증감식)
        for (int i =1; i <= 9; i++) {
            // 입력한 단(N)에 대해 1부터 9까지 곱셈 결과 출력
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}
