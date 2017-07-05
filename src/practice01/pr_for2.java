package practice01;

import java.util.Scanner;

public class pr_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력 하세요.");
		int in = sc.nextInt();
	
		/*3을 입력받는다고 가정,입력받아오는 숫자인 3은 변수 in 에 저장될거야 . 
		 * 1부터가 시작이고 받아오는 in 만큼 반복 해야겠지 ?- 전체 반복의 바깥 for문 */
	
		
			for(int a=1;a<in+1;a++) {//반복문이 1-3까지 세번 돌아감 
				
				for(int b=1;b<a+1;b++) { //a가 1일때 for(int b=1; b<2;b++) 에서 에이를 찍으니까 1이 한번 찍힘 
										 //a가 2일때 for(int b=1; b<3;b++) 에서 에이를 찍으니까 2가 두번  찍힘 
					System.out.print(a);
					
				}System.out.println(" ");//줄바꿈을 위한 용도 
			}
		
		
	}

}
