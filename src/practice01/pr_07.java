package practice01;

import java.util.Scanner;

public class pr_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("	      숫자 맞추기 게임 시작 				");
		System.out.println("==================================");

		int ran = (int) (Math.random() * 100) + 1;
		while (true) {
			System.out.print(">>");
			int a = sc.nextInt();
			
			if (a == ran) {
				System.out.println("맞았습니다.");
				System.out.println("게임을 종료 하시겠습니까 ? (y/n)>>");
				String b= sc.next();
				if(b.equals("y")) {
					System.out.println("게임을 종료합니다.");
					break;
				}else if (b.equals("n")) {
					continue;
				}
			} else if (a <ran) {
				System.out.println("더 높게");
			}else if(a>ran){
				System.out.println("더 낮게 ");
			}
		}

	}

}
