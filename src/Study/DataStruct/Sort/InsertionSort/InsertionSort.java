package Study.DataStruct.Sort.InsertionSort;

/**
 * @FileName    : InsertionSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Insertion Sort(���� ����)�� �� ���� �⺻ ���ĵ� �� ���� ū ȿ������ ������ ����.
 * 				  �Ϲ������� �� ���Ŀ����� ������ �ܰ�� ���� �ϴµ�, ���� ������ �̹� ��� ���� ���ĵ� 
 * 				  �迭���� ���� ū ȿ���� ���� ����.
 * 				  �Ϲ������� ����ӵ� ȿ�� :
 * 					 ���� ���� = 2 * �������� , ���� ���� > �������� (���� �ӵ� �ǹ� ȿ���� ���� ���� ũ�ٰ� ǥ���ߴ�.)
 * 				 
 * 				 ���õ� ���� �ӽ� ������ �� ���� ����� �񱳸� �����ϸ� ���ǿ� ���� �ʴ� ���� �ڷ� ������ 
 * 				 �´� ��ġ�� �����Ѵ�.
 * 				 
 * 				  �ð� ���⵵ : O(N^2)
 * 
 * -- ���� �� �� : ���� ���Ľ� ������ ���� �����ϴ� �Ϳ� ���ؼ� �迭�� 0��°�� �����ϸ� �ȵȴ�. 
 * 				 ���ʿ��� �˻��� �ϸ� ������ �迭�� �� �ϱ⶧���� error�� �߻��� �� �ִ�.
 * 				 �׷��Ƿ� ù��° �迭�� ������ 1��°�� �Ǵ� ���̴�.��
 * 					
 */


public class InsertionSort {
	
	public InsertionSort(int[] arr) {
		
		for (int i = 1; i< arr.length; i++){
			
			int temp = arr[i];
			int j = i;
			
			while(j>0 && arr[j-1] >= temp){
				
				arr[j] = arr[j-1];
				--j;
			}
			
			arr[j]= temp;
			
			displayArray(arr);
		}
	}

	private void displayArray(int[] arr) {
		
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}
