package Study.DataStruct.Sort.RadixSort;

import java.util.Stack;

public class Execute {

	public static void main(String[] args) {
		int[] arr = new int[13];
		
//		Random r = new Random();
		
		arr[0] = 41;
		arr[1] = 333;
		arr[2] = 444;
		arr[3] = 121;
		arr[4] = 358;
		arr[5] = 888;
		arr[6] = 999;
		arr[7] = 777;
		arr[8] = 222;
		arr[9] = 331;
		arr[10] = 341;
		arr[11] = 361;
//		
		
//		for(int i = 0; i<arr.length; i++){
//			
//			arr[i] = r.nextInt(999);
//		}
		
		RadixSort rs = new RadixSort();
		rs.dispalyArray_int(arr);
		
		rs.radixSort(arr);
		
	}

}
