package test1;

import java.util.Scanner;

public class Basic25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력
		int no = sc.nextInt();
		String name = sc.next();
		int gender = sc.nextInt();
		int rank = sc.nextInt();
		String convertedGender = "입력값 오류"; // 성별
		String convertedRank = "입력값 오류 "; // 직급
		int salary = 260; // 기본 고정 급여
		int bonus = 0; // 보너스

		// 조건 - 성별
		if (gender == 1) {
			convertedGender = "남자";
		} else if (gender == 2) {
			convertedGender = "여자";
		}

		// 조건 - 직급 변경
		if (rank == 1) {
			bonus = 300;
			convertedRank = "이사";
		} else if (rank == 2) {
			bonus = 200;
			convertedRank = "부장";
		} else if (rank == 3) {
			bonus = 100;
			convertedRank = "과장";
		} else if (rank == 4) {
			bonus = 50;
			convertedRank = "대리";
		} else if (rank == 5) {
			bonus = 10;
			convertedRank = "사원";
		}

		// 결과 출력
		System.out
				.println("사원번호" + "\t" + "성명" + "\t" + "성별" + "\t" + "직급" + "\t" + "기본급" + "\t" + "보너스" + "\t" + "총액");
		System.out.println(no + "\t" + name + "\t" + convertedGender + "\t" + convertedRank + "\t" + salary + "\t"
				+ bonus + "\t" + (salary + bonus));

		sc.close();

	}

}
