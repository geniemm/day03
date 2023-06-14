package if_else_if;

import java.util.Scanner;

public class TestClass02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int coffee = 2000;
	int price;
	System.out.print("커피의 개수 입력: ");
	int cnt = sc.nextInt();
	if(cnt <=10) {
		price = cnt*coffee;
		System.out.println("총 금액: "+price+"원");
	}
	else if(cnt>10) {
		price = (10*coffee)+((cnt-10)*1500);
		System.out.println("총 금액: "+price+"원");
	}
	else {
		System.out.println("잘못입력하셨습니다.");
	}
	System.out.println("====맛있는 커피====");
}
}
