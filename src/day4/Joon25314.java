package day4;

//[4.반복문] 코딩은 체육과목 입니다
import java.util.Scanner;

public class Joon25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        /*for문: 번복 횟수가 미리 정해져 있을 때 특정 코드 블록을 반복 실행하는 제어문
          for(초기화식; 조건식; 증감식) */
        //N은 4의 배수이므로 N/4만큼 long 출력
        for (int i = 0; i < N / 4; i++) {
            System.out.print("long ");
        }
        //마지막에 int 출력
        System.out.println("int");

        //예: 20 입력시 출력-> long long long long long int
        //for문의 조건에 의해 N(20)/4 =5만큼 long 출력된것
    }
}
