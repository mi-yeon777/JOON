package day4;

//[반복문] 코딩은 체육과목 입니다
import java.util.Scanner;

public class Joon25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        //N은 4의 배수이므로 N/4만큼 long 출력
        for (int i = 0; i < N / 4; i++) {
            System.out.print("long ");
        }
        //마지막에 int 출력
        System.out.println("int");

    }
}
