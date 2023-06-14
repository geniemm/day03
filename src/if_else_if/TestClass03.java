package if_else_if;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.print("정수를 입력: ");
	int num = sc.nextInt();
	if(num==0) {
		System.out.println("잘못입력했다!");
	}
	else if(num%3==0 && num%4==0) {
		System.out.println(num+"은(는) 3의 배수이면서, 4의 배수");
	}
	else if(num%3==0) {
		System.out.println(num+"은(는) 3의 배수");
	}
	else if(num%4==0) {
		System.out.println(num+"은(는) 4의 배수");
	}
	else if(num%3!=0 || num%4!=0) {
		System.out.println(num+"은(는) 3의 배수도, 4의 배수도 해당안됨");
	}
	else {
		System.out.println("집에 가고싶다.");
	}
}
}
