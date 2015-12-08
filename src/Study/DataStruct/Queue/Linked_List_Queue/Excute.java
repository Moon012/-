package Study.DataStruct.Queue.Linked_List_Queue;

public class Excute {
	
	public static void main(String[] args){
		
		QueueList ql = new QueueList();
		
		for(int i = 1; i < 4; i++){
			
			ql.insert(i * 10);
		}
		
		long[] item = new long[1];
		System.out.print(" peek : ");
		ql.peek(item);
		System.out.println(item[0]);
		
		System.out.print(" remove : ");
		ql.remove(item);
		System.out.println(item[0]);
		ql.remove(item);
		System.out.println(item[0]);
		ql.remove(item);
		System.out.println(item[0]);
		ql.remove(item);
		System.out.println(item[0]);
		
		
		
	}
}
