package question;

import java.util.Scanner;

public class test01 {
public static void main(String[] args) {
	// 가위바위보 게임
	Scanner sc = new Scanner (System.in);
	
	
	int com = (int)(Math.random()*3)+1;
	
	//System.out.println(com);
	System.out.println("=======가위 바위 보 게임 ======");
	System.out.println("가위(1), 바위(2), 보(3)중에 숫자 하나를 입력하세요\n");
	
	System.out.print("가위 바위 보! ==> ");
	int user = sc.nextInt();
	
	System.out.println("==========================");

	if(user>com) {
		System.out.println("이겼습니다~!");
	}else if(user<com) {
		System.out.println("졌습니다 ㅠㅠ");
	}else if(user == com) {
		System.out.println("비겼습니다..");
	}
	else {
		System.out.println("잘못 입력하셨습니다!");
	}
	System.out.println("==========================");

}
}
