package day4;
//[조건문] 시험성적
import java.util.Scanner;

public class Joon9498 {
    public static void main(String[] args) {
        //[입력 받기 위한 Scanner 객체 생성]
        Scanner sc = new Scanner(System.in);

        //[정수를 입력받아 변수에 저장]
        int score = sc.nextInt();//시험 점수 입력 (0~100)

        //if문
        if (score >= 90) { // 90~ 100
            System.out.println("A");
        //else if문
        } else if (score >= 80 ){ // 80~ 89
            System.out.println("B");
        } else if (score >= 70 ) { // 70~ 79
            System.out.println("C");
        } else if (score >= 60) { // 60~ 69
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //Scanner 자원정리
        sc.close();
    }
}
//switch문
//public class joon9498 {
//    public static void main(String[] args) {
//
//        // 입력 받기
//        Scanner sc = new Scanner(System.in);
//        int score = sc.nextInt();
//
//        // 점수를 10으로 나눈 몫으로 판단
//        switch (score / 10) {
//            case 10: // 100점
//            case 9:  // 90 ~ 99점
//                System.out.println("A");
//                break;
//
//            case 8:  // 80 ~ 89점
//                System.out.println("B");
//                break;
//
//            case 7:  // 70 ~ 79점
//                System.out.println("C");
//                break;
//
//            case 6:  // 60 ~ 69점
//                System.out.println("D");
//                break;
//
//            default: // 0 ~ 59점
//                System.out.println("F");
//        }
//
//        sc.close();
//    }
//}
