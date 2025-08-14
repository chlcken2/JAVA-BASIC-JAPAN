package test1;

import java.util.Scanner;

public class Basic_ifif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		int year = sc.nextInt();
		String passedMessage = "불합격";

		if (year == 4 && score >= 70) {
			passedMessage = "통과";
		} else if (year != 4 && score >= 60) {
			passedMessage = "통과";
		}

		System.out.print(passedMessage + "입니다");

	}

}
