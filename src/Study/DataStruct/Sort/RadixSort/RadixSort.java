package Study.DataStruct.Sort.RadixSort;

import java.util.Stack;

/**
 * @FileName    : RadixSort.java
 * @Project     : myStudy
 * @Date        : 2016. 1. 20. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 기수 정렬 - 숫자의 자리 수를 기초로 정렬 하는 방식(1의 자리 끼리, 10의 자리 끼리)
 * 				  기수 정렬은 배열의 전체 크기와 동일한 크기의 기수 테이블을 위한 메모리가 필요.
 * 				  기수 정렬은 퀵 정렬과 같이 빠른 성능을 가지는 알고리즘이지만 추가적인 메모리가 필요 하기 때문에 
 * 				  메모리의 여유가 많지 않을 경우에는 적용되기 힘들다. 또한, 기수 정렬은 정렬방법의 특수성 때문에
 * 				  음수 또는 부동 소수점처럼 특수한 비교 연산이 필요한 자료에는 적용할 수 없다.
 * 				 
 * 				  시간 복잡도 : O(nlogn)
 * 
 */
public class RadixSort {
	
	
	public int[] radixSort(int[] arr){
		
		
		int num_digits = 0;
		
		// 각 배열을 돌면서 자리 수를 구한다. 즉, 백의 자리는 3자리 천의 자리는 4자리가 나온다.
		for(int i =0; i <arr.length; i++){
			
			if(Integer.toString(arr[i]).length() > num_digits ){
				num_digits = Integer.toString(arr[i]).length();
				// int -> Integer 로 변환 (Auto boxing)
				// Integer -> int 로 변환 ( Auto unboxing)
			}
			
			/*  1. int (Primitive 자료형 (long, float, double,. ....)
			 *  - 자료형
			 *  - 산술 연산이 가능.
			 *   - null 로 초기화 불가능, 0으로 초기화 
			 *   
			 *  2. Integer (Wrapper 클래스(객체)  
			 *  - 클래스
			 *  - Unboxing 을 하지 않으면 산술 연산이 불가능하지만, null값은 처리할 수 있음. 
			 *  - null값 처리가 용이해서 SQL 과 연동할 경우 처리가 용이. 직접적인 산술연산은 불가능
			 *  
			 *  3. Integer.valueOf(String) 과 Integer.parseInt(String)의 차이가 있음!
			 *	- Integer.valueOf(String) 을 사용하면 Integer 클래스로 리턴하기 때문에 산술연산 불가능
             *  - Integer.paraseInt(String)는 int 형으로 리턴하기 때문에 null값이 들어가면 안됨.
			 */
		}
		
		Integer[] array = new Integer[arr.length]; 
		
		for(int i = 0; i<arr.length; i++){ // Integer 배열에 다시 넣어준다. Integer 메소드를 사용하기 위함
			
			array[i] = new Integer(arr[i]);
			
		}
		
		/*
		 * 기수정렬을 하기 위해서 스택(Stack)을 사용한다. 기수 정렬을 하기 위해서는 주어진 배열에서의 가장 큰 값을 갖는
		 * 숫자가 몇째 자리 이하인지 먼저 확인을 하고 그런 다음 스택에 해당 항목들을 삽입하기 위해 그타입을 변환.
		 * 사용하는 항목의 값이 10진수이므로 스택은 10개를 생성한다. 스택은 LIFO 이다.
		 */
		for(int i = 0; i<num_digits; i++){ 
			
			Stack[] s = new Stack[10]; // 10진수를 사용하기 때문에 자리 수의 위치를 정하기 위해 stack은 10개 생성
			
			for(int j = 0; j<s.length; j++){ //stack은 배열로 만들었기 때문에 초기화를 해줘야한다.
				
				s[j] = new Stack();
				
			}
			
			/*
			 * Integer의 메소드 (intValue : type - int) 를 이용, Math.pow(제곱대상, 제곱 승) : type - double
			 * 각 자리의 크기를 구한 후 그에 맞는 위치의 stack에 넣는다.
			 * 
			 */
			for(int j = array.length-1; j>=0; j--){  
				
				int idx = (int)(array[j].intValue() % (Math.pow(10, i+1)) / (Math.pow(10, i)));
				
				s[idx].push(array[j]);
			}
			
			
			int k = 0;
			
			for(int j = 0; j<s.length; j++){
				
				/*
				 *  각 자리수에 맞는 위치를 구한 것을 stack 에서 꺼내어 다시 배열에 담는다 
				 *  다음 자리수를 비교하기 위해 다시 배열에 담아야 한다.
				 *  즉, 첫 번째 돌았을 땐 1의 자리만 정렬이 된 상태, 두 번째 돌았을 땐 10의 자리가 정렬된다. 반복!
				 */
				
				while ( !s[j].empty() ){ 
					 array[k++] = (Integer)s[j].pop(); 
				}
			}
			
			dispalyArray_Integer(array);
		}
		
		
		for(int j = 0; j<array.length; j++){
			arr[j] = array[j].intValue();
		}
		return arr;
	}
	
	

	public void dispalyArray_Integer(Integer[] array) {
		
		for(int i =0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void dispalyArray_int(int[] array) {
		
		for(int i =0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
	}

}
