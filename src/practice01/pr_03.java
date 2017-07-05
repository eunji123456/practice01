package practice01;

public class pr_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*a가 1이라고 가정해보자 a=1 이고 아래로 내려옴 
 * 안쪽 for 문을 돌겟지 
 * 안쪽포문은 비라는 변수가 있고 , 2부터 시작임 , 그리고 10전까지 (9번)돌고 비는 계속 증가해 
 * 인쇄를 합니다 . 변수 비가 2* 1 =에이와 비를 곱함 한칸띄우고 
 * a가 1인채로 안의 for문의 여덟바퀴를 돌아감 
 *  */
		for(int a=1;a<10;a++) {//9줄을 만듬 
			for(int b=2;b<10;b++) {
				System.out.print (b+"*"+a+"="+a*b +" ");
			}System.out.println(" ");
		}
	}

}
