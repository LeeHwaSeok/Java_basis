package edu;

import java.util.Scanner;

public class Console_IO {

	public static void main(String[] args) {
		//콘솔 값 스캔 받아서 출력해보기
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		String value = scan.next();
		System.out.println("입력 값 : " + value);
		
		System.out.print("숫자를 입력 : ");
		
		int integer = 0;

		while(true) {
		try {
			integer = scan.nextInt();
			System.out.println("입력 값 : " + integer);
			break;
		}catch( Exception e) {
			System.out.print("다시 입력해주세요");
			scan.next();						// nextInt를 받는 스레드를 종료 시켜야함
			System.out.print("숫자 값 입력 : ");
		}
		}

		
		
				
				

		
		scan.close();
	}

}
