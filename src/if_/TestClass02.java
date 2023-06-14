package if_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num;
		System.out.print("수 입력: ");
		num = input.nextInt();
		if(num>10) {
			System.out.println("1종속 문장 실행");
			System.out.println("2종속 문장 실행");
			System.out.println("3종속 문장 실행");
		}
		System.out.println("다음문장 "); // 이건 항상 실행되는뎅

		
	}
}
