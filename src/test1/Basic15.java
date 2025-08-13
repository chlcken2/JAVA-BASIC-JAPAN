package test1;

import java.util.Scanner;

public class Basic15 {
    public static void main(String[] args) {
        /**
         * 학번 이름 국어 영어 수학 점수를 입력 받아서 총점, 평균, 합격여부를 출력
         * 총점은 세 과목을 더하고  평규은 총점을 과목수로 나눈다
         * 합격 여뷰는 평균이 80점 이상
         * 학생 정보 홍길동 90 90 90
         */

        Scanner sc = new Scanner(System.in);
        int studentNumber = sc.nextInt();
        String studentName = sc.next();
        int korScore = sc.nextInt();
        int engScore = sc.nextInt();
        int mathScore = sc.nextInt(); //camel

        int totalScore = korScore+engScore+mathScore;
        float avgScore = totalScore/3.0f;
        String result = avgScore >= 80 ? "합격" : "탈락";


        System.out.println("학번: " + studentNumber + " 이름: " + studentName+ " 총점: " + totalScore + " 평균: " + avgScore + " 합격유무: " + result);
    }
}
