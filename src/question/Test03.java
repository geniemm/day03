package question;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {

//✨ 2번 문제
//입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

	Scanner sc = new Scanner(System.in);
	System.out.print("년도 입력: ");
	
	int year = sc.nextInt();
	

	if(year%4==0 && year%100!=0 || year%400==0 && year%100!=0) {
		System.out.println("윤년입니다.");
	}
	else {
		System.out.println("평년입니다.");
	}
	
	
	

}
}
