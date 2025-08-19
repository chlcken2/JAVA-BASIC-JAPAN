package workout_practice_for_obj;

import java.util.Scanner;

public class GymUserInterface {
	public static void main(String[] arg) {
		System.out.print("신규유저 등록 : '등록' 입력 , 유저 정보 수정 : '수정' 입력");
		Scanner sc = new Scanner(System.in);
		String action = sc.next();
		if (action.equals("등록")) {
			System.out.print("신규유저 등록 실행 ");
			String userName = sc.next(); // 유저 이름
			String userLocation = sc.next(); // 유저 주소
			String gender = sc.next(); // 유저 성별
			int userAge = sc.nextInt();// 유저 나이

			// 유저 등록
			GymRegister registeredUser = new GymRegister(userName, userLocation, gender, userAge);
			registeredUser.displayName();
		}

		if (action.equals("수정")) {
			System.out.print("신규유저 수정  실행 ");
			String userName = sc.next(); // 유저 이름
			String userLocation = sc.next(); // 유저 주소
			String gender = sc.next(); // 유저 성별
			int userAge = sc.nextInt();// 유저 나이

			GymRegister editedUser = new GymRegister(userName, userLocation, gender, userAge);
			editedUser.edit();
		}
		sc.close();
	}
}
