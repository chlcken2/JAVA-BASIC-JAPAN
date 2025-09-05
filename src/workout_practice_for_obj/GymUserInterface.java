package workout_practice_for_obj;

import java.util.Scanner;

public class GymUserInterface {
	public static void main(String[] arg) {
		System.out.println("신규유저 등록 : '등록' 입력 , 유저 정보 수정 : '수정' 입력");
		Scanner sc = new Scanner(System.in);
		String action = sc.next();
		if (action.equals("등록")) {
			System.out.print("신규유저 등록 실행 ");
			System.out.println("유저 이름을 입력하세요. ");
			String userName = sc.next(); // 유저 이름
			System.out.println("유저 주소를 입력하세요. ");
			String userLocation = sc.next(); // 유저 주소
			System.out.println("유저 성별을 입력하세요. ");
			String gender = sc.next(); // 유저 성별
			System.out.println("유저 나이를 입력하세요. ");
			int userAge = sc.nextInt();// 유저 나이

			// 유저 등록
			// registeredUser 변수는 GymRegister 클래스로부터 만들어진 객체를 가리키므로 'GymRegister의 인스턴스'라고 부릅니다.
			GymRegister registeredUser = new GymRegister(userName, userLocation, gender, userAge);
			// 결과 메소드 호출
			registeredUser.displayName();
		}

		if (action.equals("수정")) {
			System.out.print("신규유저 수정  실행 ");
			System.out.print(" 수정 이름 입력 : ");
			String userName = sc.next(); // 유저 이름
			System.out.print(" 수정 주소 입력 : ");
			String userLocation = sc.next(); // 유저 주소
			System.out.print(" 수정 성별 입력 : ");
			String gender = sc.next(); // 유저 성별
			System.out.print(" 수정 나이 입력 : ");
			int userAge = sc.nextInt();// 유저 나이

			// editedUser 변수는 GymRegister 클래스의 '인스턴스'입니다.
			GymRegister editedUser = new GymRegister(userName, userLocation, gender, userAge);
			editedUser.edit();
		}
		sc.close();
	}
}
