package practice01;

import java.util.Scanner;

public class pr_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("	      ���� ���߱� ���� ���� 				");
		System.out.println("==================================");

		int ran = (int) (Math.random() * 100) + 1;
		while (true) {
			System.out.print(">>");
			int a = sc.nextInt();

			if (a == ran) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.println("������ ���� �Ͻðڽ��ϱ� ? (y/n)>>");
				String b = sc.next();
				if (b.equals("y")) {
					System.out.println("������ �����մϴ�.");
					break;
				} else if (b.equals("n")) {
					continue;
				}
			} else if (a < ran) {
				System.out.println("�� ����");
			} else if (a > ran) {
				System.out.println("�� ���� ");
			}
			sc.close();
		}

	}

}
