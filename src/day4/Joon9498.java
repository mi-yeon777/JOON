package day4;
//[1.조건문] 시험성적
import java.util.Scanner;

public class Joon9498 {
    public static void main(String[] args) {
        //[입력 받기 위한 Scanner 객체 생성]
        //Scanner타입의 변수 sc선언, new연산자로 입력 받기 위한 Scanner 객체 생성
        //System.in: System 클래스의 static필드()변수
        //ㄴ키보드 입력 스트림으로 어디서 입력 받을지 알여주는 역할
        //new Scanner(System.in) = 키보드에서 입력받는 Scanner 하나 생성
        Scanner sc = new Scanner(System.in);

        //[정수를 입력받아 변수에 저장]
        /* Scanner 객체는 System.in(표준 입력)을 직접 다루기 불편하기 때문에,
           사람이 쓰기 편하도록 nextInt() 같은 메서드로 감싸서 제공한다*/
        // 정수형 변수score에 sc.nextInt()메서드가 반환된 값을 대입(여기서 sc는 위의Scanner객체)
        //nextInt()는 키보드에 정수 하나를 읽어오는 메서드로, 사용자가 엔터 치면 그 숫자를 반환
        //ㄴ>요약: 정수형 변수 score선언을 해준 후, Scanner객체를 nextInt();메서드로 감싸 정수형 변수 score에 대입해줍니다
        int score = sc.nextInt();//시험 점수 입력 (0~100)

        //if문: 조건식의 결과(true/false)에 따라 코드 블록의 실행 여부를 결정하는 제어문
        if (score >= 90) { // 90~ 100
            System.out.println("A");
        //else if문: 초기 if 문의 조건이 거짓(false)일 때, 추가적인 조건을 검사하여 프로그램의 흐름을 분기하는 제어문
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
