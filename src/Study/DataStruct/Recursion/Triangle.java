package Study.DataStruct.Recursion;

import java.util.Scanner;

/**
 * @FileName    : Triangle.java
 * @Project     : myStudy
 * @Date        : 2016. 1. 20. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : �ﰢ��(���� �ƴ� �� ��° ������ �� ���  1~100 ���� = 5050) 
 */
public class Triangle {

	
	public static void  main(String args[]){
		
		System.out.print("�ﰢ�� �� �Է� : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int ans = triRec(num);
		
		System.out.println(num + " ��° �ﰢ��  = " + ans);
	} 
	
	
	static int triRec(int n){
		
		System.out.println( " n = " + n + " �� ����");
		
		if(n == 1){
			
			System.out.println("1 ��ȯ");
			return 1;
			
		}else{
			
			int tmp = n + triRec(n-1);
			System.out.println(tmp + " ��ȯ ");
//			return( n + triRec(n-1) );
			return tmp;
		}
	}
}
