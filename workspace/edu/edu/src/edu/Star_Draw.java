package edu;

public class Star_Draw {

	public static void main(String[] args) {
		char c = '2';
		String s = "���ڿ�";
		int integer = 1;
		long lo = 100;
		double d = 1.2;
		boolean b = false; 
		
		int[] array = new int[3]; 		// �迭 ���� 
		String[] texts = new String[3]; //���ڿ� �迭 
		
		//���簢��
		System.out.println("���簢��");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<5; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		//�ﰢ��
		System.out.println("�ﰢ��");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		//���ﰢ�� -- Ǯ�� 1
		System.out.println("���ﰢ�� -- Ǯ��1");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j<i+1; j++) {
				System.out.print(" ");
			}
			for (int k = 5-i; k > 0 ; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}	
		
		//���ﰢ�� -- Ǯ�� 2 [ ���ؿ� ���� ] �� 2�� �ۿ���� ������ ����
		System.out.println("���ﰢ�� -- Ǯ��2");
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
	      
	    
	    // ���ﰢ�� ����� ��
		System.out.println("���ﰢ�� -- Ǯ��");
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
