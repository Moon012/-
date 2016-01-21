package Study.DataStruct.Recursion;

import java.util.Scanner;

/**
 * @FileName    : Triangle.java
 * @Project     : myStudy
 * @Date        : 2016. 1. 20. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 삼각수(흔히 아는 몇 번째 까지의 합 계산  1~100 합은 = 5050) 
 */
public class Triangle {

	
	public static void  main(String args[]){
		
		System.out.print("삼각수 값 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int ans = triRec(num);
		
		System.out.println(num + " 번째 삼각수  = " + ans);
	} 
	
	
	static int triRec(int n){
		
		System.out.println( " n = " + n + " 에 들어가기");
		
		if(n == 1){
			
			System.out.println("1 반환");
			return 1;
			
		}else{
			
			int tmp = n + triRec(n-1);
			System.out.println(tmp + " 반환 ");
//			return( n + triRec(n-1) );
			return tmp;
		}
	}
}
