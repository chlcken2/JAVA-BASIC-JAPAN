package test1;

import java.util.Scanner;

public class Basic29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			// 게임이 시작할 때마다 컴퓨터의 랜덤값 생성
			int com = (int) (Math.random() * 3) + 1;

			System.out.println("가위바위보 게임 시작! 가위(1), 바위(2), 보(3) 중에서 하나를 입력하세요.");
			int me = sc.nextInt();

			// 입력값 유효성 검사
			if (me < 1 || me > 3) {
				System.out.println("⚠️ 1, 2, 3 중에서만 입력해야 합니다. 다시 시작합니다.");
				continue; // 현재 반복을 중단하고 다시 while 루프 시작
			}

			// 가위(1), 바위(2), 보(3)를 문자열로 변환 
			String[] rps = { "", "가위", "바위", "보" };
			System.out.println("나: " + rps[me] + ", 컴퓨터: " + rps[com]);

			// 승패 판별 로직
			int result = me - com;

			if (result == 0) {
				System.out.println("😄 비겼습니다.");
			} else if (result == 1 || result == -2) {
				System.out.println("🎉 이겼습니다!");
			} else { // result == -1 || result == 2
				System.out.println("😭 졌습니다.");
			}

			System.out.print("다시 하시겠습니까? (y/n) ");
			String yesOrNo = sc.next();

			if (yesOrNo.equals("n")) {
				flag = false;
			}
		}
		System.out.println("게임이 종료되었습니다. 안녕히 계세요.");
		sc.close(); // Scanner 객체 닫기
	}
}