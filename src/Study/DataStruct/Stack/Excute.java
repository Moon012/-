package Study.DataStruct.Stack;

import java.util.ArrayList;

/**
 * @FileName    : Excute.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : stack �׽�Ʈ�غ��� ���� Ŭ����
 * 
 * 				  pop() �޼ҵ� : ���ÿ��� ���ŵ� �ڷᰡ item[]�̶�� �޼ҵ� �Ű� ������ ���� �� �޼ҵ带
 * 				  ȣ���� ������ ����.
 * 				  �Ű������� item[]�� long ������ �迭�ε� �ڹ��� �⺻��(primitive) ������ ������ ���
 * 				  ���� ���� ȣ��(call by value)�θ� �Ű� ������ ���޵Ǳ� ������ ������ ���� ȣ��(call by reference)
 * 				  �� �Ű� ������ ���޵Ǵ� �迭�� �̿��Ͽ� pop() �޼ҵ带 ȣ���� ������ �ڷḦ �����ϱ� ����				 
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
		
		
//		���� ������ �ѱ� ���� ������ ������ �ִ� ���� ����� �� ����(call by reference)
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		stack.add(arr);
//		
//		for(int i =0; i<arr.size(); i++){
//			System.out.println(arr.get(i));
//		}
//		
	}

}
