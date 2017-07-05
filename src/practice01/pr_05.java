package practice01;

import java.util.Scanner;

public class pr_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 		//스캐너를 불러옴 
		System.out.println("숫자를 입력하세요 "); 		//숫자입력 하세요~~출력
		int c = 0; 									// 변수를 비교해 담을 그릇 
		for (int b = 0; b < 5; b++) {			    //5번 입력받아야하니까 5번 돌림 
			System.out.print("숫자 : ");				//숫자 :출력 
			int a = sc.nextInt(); 					//숫자출력후에 스캐너로 입력받음 
			if (a > c) {							//받아온 숫자를 비교해서 크면 저장 아니면 그냥둠 
				c = a;								//한계 : 정수 음수는 받을수없음 ㅠ 
			}
		}
		System.out.println("최대값 :" + c);
	}

}
