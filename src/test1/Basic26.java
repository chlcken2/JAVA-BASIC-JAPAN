package test1;

public class Basic26 {
	public static void main(String[] args) {

		// while, do while, for 100까지 출력

		System.out.println("=======while문 시작=======");
		int n = 0;
		while (n <= 100) {
			System.out.print(n + " ");
			n++;
			if (n % 10 == 0 && n != 0) {
				System.out.println();
			}
		}

		System.out.println("=======do while 문 시작=======");
		int n1 = 0;
		do {
			System.out.print(n1 + " ");
			n1++;
			if (n1 % 10 == 0 && n1 != 0) {
				System.out.println();
			}

		} while (n1 <= 100);

		System.out.println("=======for문 시작=======");
		int n2 = 0;
		for (int i = 0; i <= 100; i++) {
			System.out.print(n2 + " ");
			n2++;
			if (n2 % 10 == 0 && n2 != 0) {
				System.out.println();
			}
		}
	}
}