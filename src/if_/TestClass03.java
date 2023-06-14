package if_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int num;
	
		System.out.print("수 입력: ");
		num = sc.nextInt();
		if(num %2 ==0){
			System.out.println(num+"은(는) 짝수입니다(1)");
			System.out.println(num+"은(는) 짝수입니다(2)");
			System.out.println(num+"은(는) 짝수입니다(3)");
			
		}
		if (num%2!=0) {
			System.out.println(num+"은(는) 홀수입니다(1)");
			System.out.println(num+"은(는) 홀수입니다(2)");
			System.out.println(num+"은(는) 홀수입니다(3)");
		}
		System.out.println("다음문장 실행");
	
	}
}
