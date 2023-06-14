package if_;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1;
		System.out.print("수를 입력: ");
		num1 = sc.nextInt();
		if(num1%3==0) {
			System.out.println(num1+"은(는) 3의 배수입니다.");
		}
		if(num1%3!=0) {
			System.out.println(num1+"은(는) 3의 배수가 아닙니다.");
		}
		System.out.println("\n-----------------------");
		int num2, num3, num4;
		System.out.print("세개의 숫자를 입력: ");
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		if(num2>num3 && num2>num4) {
			System.out.println("가장 큰수는 "+num2+"입니다.");
		}
		if(num3>num4 && num3>num2) {
			System.out.println("가장 큰수는 "+num3+"입니다.");
		}
		if(num4>num3 && num4>num2) {
			System.out.println("가장 큰수는 "+num4+"입니다.");
		}
		
		System.out.println("\n-----------------------");
		int num5,num6;
		System.out.print("두개의 숫자를 입력: ");
		num5=sc.nextInt();
		num6=sc.nextInt();
		if(num5>num6 && num5%2==0) {
			System.out.println("큰 수 "+num5+"은(는) 짝수입니다.");
		}
		if(num6>num5 && num6%2==0) {
			System.out.println("큰 수 "+num6+"은(는) 짝수입니다.");
		}
		System.out.println("\n-----------------------");
	}
}
