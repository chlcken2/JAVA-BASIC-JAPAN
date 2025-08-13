package test1;

import java.util.Scanner;

public class Basic22If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score > 100) {
			System.out.println("점수가 100을 넘을 수 없습니다");
			sc.close();
			return;
		}

		if (score < 80) {
			System.out.println("재시험 대상자");
		}

		if (score >= 95) {
			System.out.println("A+");
		} else if (score >= 90) {
			System.out.println("A");

		} else if (score >= 85) {
			System.out.println("B+");
		} else if (score >= 80) {
			System.out.println("B");
		}
		sc.close();
	}
}
