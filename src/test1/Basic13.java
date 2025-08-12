package test1;

import java.util.Scanner;

public class Basic13 {
    public static void main(String[] args) {
        /**
         * 키보드로부터 정수값을 입력 받아서 입력 받은 값이 90-100 사이이면 true
         * 그렇지 않으면 false를 출력하세요.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("결과 "+(a>=90 && a <=100));
    }
}
