package test1;

import java.util.Scanner;

public class Basic23Condition {

	public static void main(String[] args) {
		/**
		 * 학번, 이름 국어 영어 수학 점수를 입력받아 총점, 평균,학점,합격 여부를 출력하세요
		 * 
		 * 데이터 입력: 1 홍길동 90 90 90
		 * 
		 * 성적표 번호 이름 국어 영어 수학 총점 평균 학점 합격여부 1 홍길동 90 90 90 270 90.0 A 합격 학점은 평균이 90이상 =
		 * A, 80이상 B, 70이상 C, 60이상 D, 나머지 f 합격 여부는 80이상이면 합격 그렇지 않으면 불합격
		 */

		Scanner sc = new Scanner(System.in);

		int bno = sc.nextInt();
		String name = sc.next();
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int mathScore = sc.nextInt();

		int totalScore = korScore + engScore + mathScore;
		double avgScore = totalScore / 3;
		String studentGrade = "f";
		String passedResult = "불합격";

		if (avgScore >= 90) {
			passedResult = "합격";
			studentGrade = "A";
		} else if (avgScore >= 80) {
			passedResult = "합격";
			studentGrade = "B";
		} else if (avgScore >= 70) {
			studentGrade = "C";
		} else if (avgScore >= 60) {
			studentGrade = "D";
		}

		System.out.println("\t성적표");
		System.out.println("\t번호이름\t국어\t영어\\t수학\\t총점\\t평균학점 합격여부");
		System.out.print(bno + " " + name + " " + " " + korScore + " " + engScore + " " + mathScore + " " + totalScore
				+ " " + avgScore + " " + studentGrade + " " + passedResult + " ");

	}

}
