package day4;
//[3.반복문]별 찍기
import java.util.Scanner;

public class Joon2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// 출력할 줄 수 입력

        //2wnd 랙ans
        // 1부터 N까지 줄 반복
        for (int i = 1; i <= N; i++) {
            // 각 줄마다 j개 만 큼 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 한 줄 끝나면 줄 바꿈
            System.out.println();
        }
    }
}
