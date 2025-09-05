package test1;

import java.util.Scanner;

public class Basic28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int input = 0;
		for (;;) {
			System.out.print("값 입력 짝수는 더하고, 홀수는 차감");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if (input % 2 == 0) {
				result += input;
			} else {
				result -= input;
			}
			System.out.println(result);
		}

	
	}

}
