package memberPack;

import java.util.Scanner;

public class Main {

	/**
	 * 1 선택 아이디 패스워드 전화번호 1 등록 2 출력 3. 상세 검색 4. 수정 5. 회원탈퇴 메시지(다른 회원 아이디 입력시 에러 ) 0.
	 * 종료
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 처음 시작 하는 메인 메소드
		System.out.println("회원 조회 시스템이 실행되었습니다.");
//		System.out.println("등록할 회원 수를 입력하세요.: " + memberCount);
		Member member = new Member();

		while(true){
			System.out.println("1. 회원등록 2. 전체 등록된 회원 출력 3. 상세검색 4. 회원정보 수정 5. 회원탈퇴 0.종료");
			int type = sc.nextInt();
			switch (type) {
				case 1:
						System.out.println("1을 입력했습니다. 회원을 등록합니다.");
						member.register(sc);
						break;
				case 2:
						System.out.println("2을 입력했습니다. 등록된 전체 회원을 출력합니다.");
						member.selectAll();
						break;
				case 3:
						System.out.println("3을 입력했습니다. 상세 회원을 조회합니다.");
						member.select(sc);
						break;
				case 4:
						System.out.println("4을 입력했습니다. 회원정보를 수정합니다.");
						member.edit(sc);
						break;
				case 5 :
						System.out.println("5을 입력했습니다. 회원 탈퇴합니다.");
						member.delete(sc);
						break;
				case 0:
					System.out.println("0을 입력했습니다. 시스템을 종료합니다.");
					sc.close();
						return;
				default:
					System.out.println(type + "숫자를 눌렀습니다. 등록되지 않은 숫자입니다 다시 입력하세요");

			}
		}
	}
}
