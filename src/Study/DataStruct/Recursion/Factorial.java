package Study.DataStruct.Recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @FileName    : Factorial.java
 * @Project     : myStudy
 * @Date        : 2016. 1. 20. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ���� ���� Factorial - ���⼭ int ���� ��� ������ ū ���ڸ� ������ overflow�� �߻�
 * 				  BigInteger�� ó�� 
 */

public class Factorial {
	
	public static void main(String[] args){
		
		System.out.print("���� �Է� : ");
		int num = new Scanner(System.in).nextInt();
		
		BigInteger big = BigInteger.valueOf(num);
		
//		int ans = factorial(num);
		
		BigInteger ans = factorial2(big);
		
		System.out.println(num + " ��° �������� ��� = " + ans);
		
	}

	private static BigInteger factorial2(BigInteger n) {
		
		if( n.intValue() == 0  || n.intValue() == 1 ){
			
			return BigInteger.valueOf(1);
			
		}else{

			return n.multiply(factorial2(n.subtract(BigInteger.valueOf(1))));

		}

	}

	private static int factorial(int n) {
		
		if(n == 0){
			
			return 1;
			
		}else{
			
			return(n * factorial(n - 1));
			
		}
	}

}
