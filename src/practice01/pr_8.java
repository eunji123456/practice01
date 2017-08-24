package practice01;

import java.util.Scanner;

public class pr_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int save = 0;

		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("	1.���� | 2.��� | 3.�ܰ� | 4. ����          ");
			System.out.println("--------------------------------------");
			System.out.print("���� > ");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.print("���ݾ�>");
				int money=sc.nextInt();
				save+=money;
				break;
			case 2:
				System.out.print("��ݾ�>");
				int money1=sc.nextInt();
				save-=money1;
				break;
			case 3:
				System.out.print("�ܰ��>");
				System.out.println(save);
				break;
			case 4:
				System.out.println("����");
				break;
			}
			sc.close();
		}
	}
}
