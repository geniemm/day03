package question;

import java.util.Scanner;

public class Test04 {
public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	int hour;
	int price=10000;
	System.out.print("이용시간을 입력하세요 : ");
	hour = sc.nextInt();
	

	if(hour<1 || hour > 8) {
		System.out.println("잘못 입력하셨습니다.");
	}
	else if(hour>=1 && hour<3) {
		System.out.println("이용 금액: "+hour*price+"원");
	}
	else if(hour>=3 && hour<5) {
		System.out.println("이용 금액: "+hour*(int)(price*0.9)+"원");
	}
	else if(hour>=5 && hour<8) {
		System.out.println("이용 금액: "+hour*(int)(price*0.8)+"원");
	}
	
	
}
}
