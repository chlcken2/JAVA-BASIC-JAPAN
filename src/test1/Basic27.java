package test1;

import java.util.Scanner;

public class Basic27 {

	public static void main(String[] args) {
		// 무한 for / 예금, 출금, 조회, 종료
		// 1. 예금, 2.출금, 3.조회 4.종료
		// 메뉴선택:
		// 예금액 입력:
//		System.out.println("@@@@@@@@1. 예금, 2. 출금, 3. 조회, 4.종료 start");
		int initAccount = 0; // 초기 금액
		int addAccount = 0; // 예금 금액
		int minusAccount = 0; // 출금 금액
		int menu = 0;

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1. 예금, 2. 출금, 3. 조회, 4.종료");
			System.out.print("메뉴선택: ");
			menu = sc.nextInt();

			if (menu == 4) {
				System.out.println("종료 ");
				break;
			}

			switch (menu) {
			case 1:
				System.out.print("예금액 입력: ");
				addAccount = sc.nextInt();
				initAccount += addAccount;
				System.out.println("잔액: " + initAccount);
				break;

			case 2:
				System.out.print("출금액 입력: ");
				minusAccount = sc.nextInt();
				initAccount -= minusAccount;
				System.out.println("잔액: " + initAccount);
				System.out.println("출금: " + minusAccount);
				break;
			case 3:
				System.out.println("조회: " + initAccount);
				break;
			}
		}

	}

}
