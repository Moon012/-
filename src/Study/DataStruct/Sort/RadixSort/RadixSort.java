package Study.DataStruct.Sort.RadixSort;

import java.util.Stack;

/**
 * @FileName    : RadixSort.java
 * @Project     : myStudy
 * @Date        : 2016. 1. 20. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ��� ���� - ������ �ڸ� ���� ���ʷ� ���� �ϴ� ���(1�� �ڸ� ����, 10�� �ڸ� ����)
 * 				  ��� ������ �迭�� ��ü ũ��� ������ ũ���� ��� ���̺��� ���� �޸𸮰� �ʿ�.
 * 				  ��� ������ �� ���İ� ���� ���� ������ ������ �˰��������� �߰����� �޸𸮰� �ʿ� �ϱ� ������ 
 * 				  �޸��� ������ ���� ���� ��쿡�� ����Ǳ� �����. ����, ��� ������ ���Ĺ���� Ư���� ������
 * 				  ���� �Ǵ� �ε� �Ҽ���ó�� Ư���� �� ������ �ʿ��� �ڷῡ�� ������ �� ����.
 * 				 
 * 				  �ð� ���⵵ : O(nlogn)
 * 
 */
public class RadixSort {
	
	
	public int[] radixSort(int[] arr){
		
		
		int num_digits = 0;
		
		// �� �迭�� ���鼭 �ڸ� ���� ���Ѵ�. ��, ���� �ڸ��� 3�ڸ� õ�� �ڸ��� 4�ڸ��� ���´�.
		for(int i =0; i <arr.length; i++){
			
			if(Integer.toString(arr[i]).length() > num_digits ){
				num_digits = Integer.toString(arr[i]).length();
				// int -> Integer �� ��ȯ (Auto boxing)
				// Integer -> int �� ��ȯ ( Auto unboxing)
			}
			
			/*  1. int (Primitive �ڷ��� (long, float, double,. ....)
			 *  - �ڷ���
			 *  - ��� ������ ����.
			 *   - null �� �ʱ�ȭ �Ұ���, 0���� �ʱ�ȭ 
			 *   
			 *  2. Integer (Wrapper Ŭ����(��ü)  
			 *  - Ŭ����
			 *  - Unboxing �� ���� ������ ��� ������ �Ұ���������, null���� ó���� �� ����. 
			 *  - null�� ó���� �����ؼ� SQL �� ������ ��� ó���� ����. �������� ��������� �Ұ���
			 *  
			 *  3. Integer.valueOf(String) �� Integer.parseInt(String)�� ���̰� ����!
			 *	- Integer.valueOf(String) �� ����ϸ� Integer Ŭ������ �����ϱ� ������ ������� �Ұ���
             *  - Integer.paraseInt(String)�� int ������ �����ϱ� ������ null���� ���� �ȵ�.
			 */
		}
		
		Integer[] array = new Integer[arr.length]; 
		
		for(int i = 0; i<arr.length; i++){ // Integer �迭�� �ٽ� �־��ش�. Integer �޼ҵ带 ����ϱ� ����
			
			array[i] = new Integer(arr[i]);
			
		}
		
		/*
		 * ��������� �ϱ� ���ؼ� ����(Stack)�� ����Ѵ�. ��� ������ �ϱ� ���ؼ��� �־��� �迭������ ���� ū ���� ����
		 * ���ڰ� ��° �ڸ� �������� ���� Ȯ���� �ϰ� �׷� ���� ���ÿ� �ش� �׸���� �����ϱ� ���� ��Ÿ���� ��ȯ.
		 * ����ϴ� �׸��� ���� 10�����̹Ƿ� ������ 10���� �����Ѵ�. ������ LIFO �̴�.
		 */
		for(int i = 0; i<num_digits; i++){ 
			
			Stack[] s = new Stack[10]; // 10������ ����ϱ� ������ �ڸ� ���� ��ġ�� ���ϱ� ���� stack�� 10�� ����
			
			for(int j = 0; j<s.length; j++){ //stack�� �迭�� ������� ������ �ʱ�ȭ�� ������Ѵ�.
				
				s[j] = new Stack();
				
			}
			
			/*
			 * Integer�� �޼ҵ� (intValue : type - int) �� �̿�, Math.pow(�������, ���� ��) : type - double
			 * �� �ڸ��� ũ�⸦ ���� �� �׿� �´� ��ġ�� stack�� �ִ´�.
			 * 
			 */
			for(int j = array.length-1; j>=0; j--){  
				
				int idx = (int)(array[j].intValue() % (Math.pow(10, i+1)) / (Math.pow(10, i)));
				
				s[idx].push(array[j]);
			}
			
			
			int k = 0;
			
			for(int j = 0; j<s.length; j++){
				
				/*
				 *  �� �ڸ����� �´� ��ġ�� ���� ���� stack ���� ������ �ٽ� �迭�� ��´� 
				 *  ���� �ڸ����� ���ϱ� ���� �ٽ� �迭�� ��ƾ� �Ѵ�.
				 *  ��, ù ��° ������ �� 1�� �ڸ��� ������ �� ����, �� ��° ������ �� 10�� �ڸ��� ���ĵȴ�. �ݺ�!
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
