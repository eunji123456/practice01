package practice01;

import java.util.Scanner;

public class pr_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// *���ڸ� �Է¹޴´� .5�� �Է¹޴´ٰ� �����ϸ� 5+5-2+5-2-2 ..0��������
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� .");
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
		System.out.println("��� �� : " + sum);
		sc.close();
	}
}
