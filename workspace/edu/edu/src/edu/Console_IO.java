package edu;

import java.util.Scanner;

public class Console_IO {

	public static void main(String[] args) {
		//�ܼ� �� ��ĵ �޾Ƽ� ����غ���
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		String value = scan.next();
		System.out.println("�Է� �� : " + value);
		
		System.out.print("���ڸ� �Է� : ");
		
		int integer = 0;

		while(true) {
		try {
			integer = scan.nextInt();
			System.out.println("�Է� �� : " + integer);
			break;
		}catch( Exception e) {
			System.out.print("�ٽ� �Է����ּ���");
			scan.next();						// nextInt�� �޴� �����带 ���� ���Ѿ���
			System.out.print("���� �� �Է� : ");
		}
		}

		
		
				
				

		
		scan.close();
	}

}
