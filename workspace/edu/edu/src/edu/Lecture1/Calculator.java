package edu.Lecture1;
import java.util.Scanner;
/**
 *  �ۼ��� : �̵���
 *  �ۼ��� : 2022-05-30
 *  ���� : �ܼ� ���� ���α׷�(����)
 * */
public class Calculator {        

	public static void main(String[] args) {
		// x = 2 + 3 - 5 + 3
		// = 5 - 5 + 3
		// = 0 + 3
		// = 3
		int f_val = 0;
		int s_val = 0;
		String mark = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		f_val = scan.nextInt();
		
		while (mark.equals("=") == false) {
			System.out.println("");
			System.out.print("��� ��ȣ �Է� : ");
			mark = scan.next();
			
			if (mark.equals("+") ||mark.equals("-")||mark.equals("*")||mark.equals("/")) {
				System.out.println("");
				System.out.print("���� �Է� : ");
				s_val = scan.nextInt();
				}
			
			if (mark.equals("+")) {f_val += s_val;} 
			else if (mark.equals("-")) {f_val -= s_val;} 
			else if (mark.equals("*")) {f_val *= s_val;} 
			else if (mark.equals("/")) {f_val /= s_val;}
		}
		
		System.out.print("��� ��� : " + f_val);
		scan.close();
		
	}
}
