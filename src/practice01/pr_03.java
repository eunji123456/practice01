package practice01;

public class pr_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*a�� 1�̶�� �����غ��� a=1 �̰� �Ʒ��� ������ 
 * ���� for ���� ������ 
 * ���������� ���� ������ �ְ� , 2���� ������ , �׸��� 10������ (9��)���� ��� ��� ������ 
 * �μ⸦ �մϴ� . ���� �� 2* 1 =���̿� �� ���� ��ĭ���� 
 * a�� 1��ä�� ���� for���� ���������� ���ư� 
 *  */
		for(int a=1;a<10;a++) {//9���� ���� 
			for(int b=2;b<10;b++) {
				System.out.print (b+"*"+a+"="+a*b +" ");
			}System.out.println(" ");
		}
	}

}
