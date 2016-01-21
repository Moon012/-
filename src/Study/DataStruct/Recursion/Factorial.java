package Study.DataStruct.Recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @FileName    : Factorial.java
 * @Project     : myStudy
 * @Date        : 2016. 1. 20. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 순차 곱셈 Factorial - 여기서 int 형을 썼기 때문에 큰 숫자를 넣으면 overflow가 발생
 * 				  BigInteger로 처리 
 */

public class Factorial {
	
	public static void main(String[] args){
		
		System.out.print("숫자 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		BigInteger big = BigInteger.valueOf(num);
		
//		int ans = factorial(num);
		
		BigInteger ans = factorial2(big);
		
		System.out.println(num + " 번째 순차곱셈 결과 = " + ans);
		
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
