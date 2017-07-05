package practice01;

import java.util.Scanner;

public class pr_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// *숫자를 입력받는다 .5를 입력받는다고 가정하면 5+5-2+5-2-2 ..0이전까지
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 .");
		int a = sc.nextInt();
		int sum = 0;
		if (a % 2 == 0) {
			for (int b = 0; b <= a; b += 2) {
				sum += b;
			}
			System.out.println(sum);
		} else {
			for (int c = 1; c <= a; c += 2) {
				sum += c;

			}
		}
		System.out.println("결과 값 : " + sum);
		sc.close();
	}
}
