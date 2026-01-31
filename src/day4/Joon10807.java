package day4;
//[1차원 배열] 개수 세기
import java.util.Scanner;
//[1차원 배열] 개수 세기
public class Joon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 정수 N입력
        int count = 0;         // v의 개수 저장 //정수형 지역 변수를 선언하고 초기값을 0으로 설정

        int[] arr = new int[N]; //int[] 정수형 배열타입
        // 크기가 N인 정수 배열 생성
        // N개의 정수를 저장하기 위한 공간확보

        // N개의 정수를 입력받는 반복문
        for (int i = 0; i < N; i++) {
            // i는 배열 인덱스 역할 (0부터 N-1 까지)

            arr[i] = sc.nextInt();
            // 입력받은 정수를 배열의 i번째 칸에 저장
        }

        int v = sc.nextInt();  // 찾을 정수 v

        // v가 몇 개인지 세기
        for (int i = 0; i < N; i++) {
            if (arr[i] == v) {
                //같다면

                count++;//개수 증가
            }
        }

        System.out.println(count);
    }
}
