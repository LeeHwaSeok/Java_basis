package edu.Lecture1;
import java.util.Scanner;
/**
 *  작성자 : 이동준
 *  작성일 : 2022-05-30
 *  내용 : 콘솔 계산기 프로그램(메인)
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
		
		System.out.print("숫자 입력 : ");
		f_val = scan.nextInt();
		
		while (mark.equals("=") == false) {
			System.out.println("");
			System.out.print("계산 기호 입력 : ");
			mark = scan.next();
			
			if (mark.equals("+") ||mark.equals("-")||mark.equals("*")||mark.equals("/")) {
				System.out.println("");
				System.out.print("숫자 입력 : ");
				s_val = scan.nextInt();
				}
			
			if (mark.equals("+")) {f_val += s_val;} 
			else if (mark.equals("-")) {f_val -= s_val;} 
			else if (mark.equals("*")) {f_val *= s_val;} 
			else if (mark.equals("/")) {f_val /= s_val;}
		}
		
		System.out.print("계산 결과 : " + f_val);
		scan.close();
		
	}
}
