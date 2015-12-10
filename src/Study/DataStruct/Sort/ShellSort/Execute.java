package Study.DataStruct.Sort.ShellSort;

public class Execute {
	
	public static void main(String[] args){
		int[] arr = new int[20];
		
		for(int i = arr.length-1, j=0; i>=0; i--){
			
			arr[i] = ++j;
			
		}
		
		ShellSort ss = new ShellSort(arr);
		
	}

}
