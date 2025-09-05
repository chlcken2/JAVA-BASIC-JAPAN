package test1;

import java.util.Scanner;

public class InnerMethod01 {
	int totalCount = 0;

	private int calc(int number) {
		if (number > 0 && number % 7 == 0) {
			this.totalCount += number;
		}

		if (number == -99) {
			System.out.println("-99를 입력하여 종료합니다. totalCount: " + this.totalCount);
			return this.totalCount;
		}
		return 0;
	}

	public void addInput() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			int number = sc.nextInt();
			System.out.println("number입력값: " + number);
			calc(number);
		}

		sc.close();
		calc(0);
	}

	public static void main(String[] args) {
		InnerMethod01 i = new InnerMethod01();
		i.addInput();
	}
}