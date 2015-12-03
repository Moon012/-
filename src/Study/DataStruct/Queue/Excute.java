package Study.DataStruct.Queue;

public class Excute {
	
	public static void main(String[] args){
		
		Queue queue = new Queue(10);
		
		for(long i = 0; i < 10; i ++){
			queue.insert(i);
		}
		
		long[] item = new long[1];
		queue.peek(item);
		System.out.print(" peek : ");
		System.out.println(item[0]);
		
		queue.remove(item);
		System.out.print(" remove : ");
		System.out.print(item[0]+ " ");
		queue.remove(item);
		System.out.println(item[0]+ " ");
		
		
	}

}
