package practice01;

import java.util.Scanner;

public class pr_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 		//��ĳ�ʸ� �ҷ��� 
		System.out.println("���ڸ� �Է��ϼ��� "); 		//�����Է� �ϼ���~~���
		int c = 0; 									// ������ ���� ���� �׸� 
		for (int b = 0; b < 5; b++) {			    //5�� �Է¹޾ƾ��ϴϱ� 5�� ���� 
			System.out.print("���� : ");				//���� :��� 
			int a = sc.nextInt(); 					//��������Ŀ� ��ĳ�ʷ� �Է¹��� 
			if (a > c) {							//�޾ƿ� ���ڸ� ���ؼ� ũ�� ���� �ƴϸ� �׳ɵ� 
				c = a;								//�Ѱ� : ���� ������ ���������� �� 
			}
		}
		System.out.println("�ִ밪 :" + c);
	}

}
