package practice01;

import java.util.Scanner;

public class pr_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("���ڸ� �Է� �ϼ���.");
		int in = sc.nextInt();
	
		/*3�� �Է¹޴´ٰ� ����,�Է¹޾ƿ��� ������ 3�� ���� in �� ����ɰž� . 
		 * 1���Ͱ� �����̰� �޾ƿ��� in ��ŭ �ݺ� �ؾ߰��� ?- ��ü �ݺ��� �ٱ� for�� */
	
		
			for(int a=1;a<in+1;a++) {//�ݺ����� 1-3���� ���� ���ư� 
				
				for(int b=1;b<a+1;b++) { //a�� 1�϶� for(int b=1; b<2;b++) ���� ���̸� �����ϱ� 1�� �ѹ� ���� 
										 //a�� 2�϶� for(int b=1; b<3;b++) ���� ���̸� �����ϱ� 2�� �ι�  ���� 
					System.out.print(a);
					
				}System.out.println(" ");//�ٹٲ��� ���� �뵵 
			}
			sc.close();
		
		
	}

}
