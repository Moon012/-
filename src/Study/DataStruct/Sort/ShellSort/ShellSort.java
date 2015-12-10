package Study.DataStruct.Sort.ShellSort;

/**
 * @FileName    : ShellSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 10. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ShellSort(�� ����)�� ��ǻ�� ������ Donald L. Shell �� �̸��� ���� ���� ���� ���.
 * 				  �� ������ ���� ���� �˰����� Ȱ���Ͽ� ���� ������ ������ ���� �ڷ���� ���� Ƚ���� ������ġ�� ����� ������
 * 				  �������ν� ���Ľð��� ���� ��Ų��.
 * 
 * 				  -- ũ����(Knuth)���� : 3 * h + 1
 * 				  ������ ũ���� ������ ������� �� �迭�� lenth ���� Ŀ�� �Ѵ�. 
 * 					ex)�迭 1000 > (364 * 3 +1)  ��, ������ ũ���� ����(h)�� 364�� �ȴ�.
 * 				 
 * 				  �ð� ���⵵ : O(N^3/2) == O(N^1.5)   - �Ϲ����� �ð� ���⵵�̴�. (��Ȳ�� ���� ���� �� �� ����.)
 * 
 *  -- ���� ���� �� �� : ũ���� ���� ��ŭ �迭�� ������ ��, ���� �����ϱ� ���� ����� ����� �������� �̷��� ������� 
 * 					 �� ���ϴ� ���� �ƴ϶� ù ���� �迭�� �޿� ���ݹ迭���� ���������Ѵ�. (�迭�� 10�� ���� : {4,3,2,1} �� {9,8,7,6}  {5,10} : ��  ���� ��� )
 * 					 ��, ũ���� ������ �����̷� ���� ������ �ϴµ� �迭�� ũ�Ⱑ 10�̱� ������ ũ���� ������ 4�̴�
 * 					 �迭�� 4��°�� 9�� �迭�� 0��°�� 0�� �� �Ѵ�. �迭�� �ε����� �ȱ�鼭 ���Ѵ�. 
 * 					 ũ������ ������ �ٿ����� ���� ������ �Ѵ�.
 * 
 *  -- 1000���� �迭�� ũ������������ �� �� : 364-sort -> 121-sort -> 40-sot -> 13-sort -> 4-sort -> 1-sort
 */


public class ShellSort {

	public ShellSort(int[] arr) {
		
		int h = 1;
		
		while(h <= arr.length/3){
			
			h= h*3 +1;
			
//			system.out.println(h + " : " + arr.length/3);
			
		}
		
		while( h> 0){
			
			System.out.println(" h �� : "+ h );
			
			for(int i = h; i < arr.length; i++){

				int temp = arr[i];
				int j = i;
				
				while(j>h-1 && arr[j-h] >= temp){
					
					arr[j] = arr[j-h];
					j -= h;
				}
				
				arr[j] = temp;
				
				displayArray(arr);
				System.out.println("");
			}
			
			h = (h-1)/3;
			
		}
	}

	public void displayArray(int[] arr) {
		
		for(int i =0; i<arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
		
	}

}
