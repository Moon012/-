package Study.DataStruct.Serach;

/**
 * @FileName    : BinarySearch.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ���� Ž��(binary search)�� ���ĵǾ� �ִ� �ڷ���� ���տ��� Ư���� �ڷḦ ã���� �� �� ���� ���Ǹ�
 * 				  �ſ� ���� Ž�� �˰���.
 * 				  ���� Ž���� ���� Ž������ �޸� �ڷḦ �����̶�� ������� �����Ѵ�. �׷��� ������ Ž���� ����������, 
 * 				  ���ο� ���ڵ��� �����̳� ������ �� �� �ڷ� ������ ���߸��� �ʾƾ� �ϴ� ������� �ִ�.
 * 				 
 *  			  ** �ð� ���⵵ : O(nlog2N)
 * 				  ** �ݵ�� ���ڵ���� ������ ������ �Ǿ�����Ѵ�.
 * 
 * 				  mid ������ �˻��ϴ°� ����. ���� ��ġ ���� ���� mid�� �� �߱� ������ +1, -1 �� ����� �ٽ� �˻�
 * 				  ���� �ʵ��� �Ѵ�.
 * 				
 */


public class BinarySearch {
	
	public static void binarySearch(int key, int[] arr){
		
		int mid;
		int left = 0;
		int right = arr.length -1;
		
		while (right >= left){
			
			mid = right + left;
			
			if(key == arr[mid]){
				System.out.println(key + " is in ter array with index value : " + mid);
				break;
			}
			
			if(key < arr[mid]){
				
				right = mid - 1;
				
			}else{
				
				left = mid + 1;
			}
		}
	}

}
