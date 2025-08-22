package test1;

public class BasicPibonachi {

	public static void main(String[] args) {
		/**
		 * 피보나치 수열 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열, 앞의 두수가 1과 1이면 그다음은 2, 그다음수는 3, 그다음수는 5,
		 * 그다음수는 8 ... 1,1,2,3,5,8,13... 그럼 10번째 피보나치수열은 무엇인가요?
		 */

		int first = 1;
		int second = 1;
		int result = 0;
		System.out.print(first + "," + second);
		for (int i = 3; i <= 10; i++) {
			result = first + second;
			System.out.print("," + result);
			first = second;
			second = result;

		}

	}

}
