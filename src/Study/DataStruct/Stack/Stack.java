package Study.DataStruct.Stack;

import java.util.ArrayList;

/**
 * @FileName    : Stack.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Stack은 LIFO(Last In First Out) 즉, 가장 마지막 입력된 자료가 가장 먼저 출력
 */

public class Stack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	char c = 'a';
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		top = -1;
	}
	
	public boolean push(long item){
		
		if( isFull() ){
			System.out.println("stack is full");
			return false;
		}
		else{
			stackArray[++top] = item;
			return true;
		}
	}
	
	public boolean pop(long item[]){
		
		if( isEmpty() ){
			System.out.println("stack is empty");
			return false;
		}else{
			item[0] = stackArray[top--];
			return true;
		}
	}
	
	public boolean peek(long item[]){
		
		if( isEmpty() ){
			
			System.out.println("stack is empty");
			return false;
			
		}else{
			
			item[0] = stackArray[top];
			return true;
			
		}
	}
	
	public int size(){
		return maxSize;
	}
	
	private boolean isEmpty() {
		
		return (top == -1);
	}

	private boolean isFull() {
		
		return (top == maxSize -1);
	}

	public void add(ArrayList<Integer> arr) {

		for(int i=0; i< 10; i++){
			arr.add(i);
		}
		
	}

	
}
