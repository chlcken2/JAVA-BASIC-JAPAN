package test1;

import java.util.Scanner;

public class basic10 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        int rest = score%2;
        boolean result = rest==0; // same
        System.out.println("result: "+result);
    }
}
