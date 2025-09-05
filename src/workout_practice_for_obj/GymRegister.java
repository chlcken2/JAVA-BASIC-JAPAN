package workout_practice_for_obj;

/**
 * 헬스장 회원 등록 시스템 예시로 설명하는 클래스와 객체 개념
 * https://crm-guide.bodycodi.com/82a00b55-198b-49e4-8835-d737c24b1715
 */
public class GymRegister {
	public static String gymName = "바벨 필라테스";
	public String memberName;
	public String address;
	public String gender;
	public int age;

	public GymRegister(String name, String address, String gender, int age) {
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.memberName = name;
	}

	public void displayName() {
		System.out.println("---  등록된 " + gymName + " 회원 정보 ---"); // 모든 객체가 클래스 변수를 사용
		System.out.println("이름: " + memberName);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("주소: " + address);
		System.out.println("--------방문을 환영합니다.---------");
	}

	public void edit() {
		// 실제 db에 저장하고, 저장된 값을 불러와야함
		System.out.println("---  수정된 " + gymName + " 회원 정보 ---"); // 모든 객체가 클래스 변수를 사용
		System.out.println("이름: " + memberName);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("주소: " + address);
		System.out.println("--------수정 되었습니다.---------");
	}

	public static void main(String[] args) {
		System.out.println("현재 헬스장 지점 이름: " + gymName);
		System.out.println();

		// 첫 번째 객체 생성
		// member1 변수는 GymRegister 클래스로부터 만들어진 객체를 가리키므로 'GymRegister의 인스턴스', 'GymRegister의 인스턴스 변수'
		GymRegister member1 = new GymRegister("이창현", "서울시 강남구", "남", 29);
		member1.displayName();

		// 두 번째 객체 생성
//        Workout member2 = new Workout("김민지", "서울시 서초구","여", 25);
//        member2.displayName();
	}
}
