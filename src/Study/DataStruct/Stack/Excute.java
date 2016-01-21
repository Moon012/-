package Study.DataStruct.Stack;

import java.util.ArrayList;

/**
 * @FileName    : Excute.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : stack 테스트해보기 위한 클래스
 * 
 * 				  pop() 메소드 : 스택에서 제거된 자료가 item[]이라는 메소드 매개 변수를 통해 이 메소드를
 * 				  호출한 곳으로 전달.
 * 				  매개변수인 item[]이 long 형식의 배열인데 자바의 기본형(primitive) 형식의 데이터 경우
 * 				  값에 의한 호출(call by value)로만 매개 변수가 전달되기 때문에 참조의 의한 호출(call by reference)
 * 				  로 매개 변수가 전달되는 배열을 이용하여 pop() 메소드를 호출한 곳으로 자료를 전달하기 위함				 
 */


public class Excute {
	
	public static void main(String[] args){
		
		Stack stack = new Stack(7);
	
		for(int i = 0; i<stack.size(); i++){
			stack.push(i);
		}
		
		 
		long popItem[] = new long[1];
		System.out.print("peek : ");
		
		stack.peek(popItem); 
		System.out.println(popItem[0]);
		
		System.out.print("pop : ");
		while(stack.pop(popItem)){
			System.out.print(popItem[0] + " ");
		}
		
		
//		참조 변수를 넘김 참조 변수가 가지고 있는 값을 출력할 수 있음(call by reference)
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		stack.add(arr);
//		
//		for(int i =0; i<arr.size(); i++){
//			System.out.println(arr.get(i));
//		}
//		
	}

}
