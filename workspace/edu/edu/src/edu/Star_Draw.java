package edu;

public class Star_Draw {

	public static void main(String[] args) {
		char c = '2';
		String s = "문자열";
		int integer = 1;
		long lo = 100;
		double d = 1.2;
		boolean b = false; 
		
		int[] array = new int[3]; 		// 배열 생성 
		String[] texts = new String[3]; //문자열 배열 
		
		//정사각형
		System.out.println("정사각형");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<5; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		//삼각형
		System.out.println("삼각형");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		//역삼각형 -- 풀이 1
		System.out.println("역삼각형 -- 풀이1");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j<i+1; j++) {
				System.out.print(" ");
			}
			for (int k = 5-i; k > 0 ; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}	
		
		//역삼각형 -- 풀이 2 [ 박준우 센세 ] 포 2개 밖에없어서 더빠를 예정
		System.out.println("역삼각형 -- 풀이2");
	    for (int i = 0; i<5; i++) {
	         for (int j = 0; j<5; j++) {
	            if(i<=j) {
	               System.out.print("*");
	            }
	            else{
	            	System.out.print(" ");
	            	}            
	         }System.out.println(""); 
	    }System.out.println("");
	      
	    
	    // 정삼각형 만드는 중
		System.out.println("정삼각형 -- 풀이");
	    for (int i = 0; i < 5; i++) {
			for (int j = i-0; j<5; j++) {
				System.out.print(" ");
			}
			for (int k = i; k > 0 ; k--) {
				System.out.print("*");
			}

			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
	    }

		
	}

}
