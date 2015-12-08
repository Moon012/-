package Study.DataStruct.Queue.Deque;

import Study.DataStruct.Queue.Linked_List_Queue.QueueList;


public class Excute {
	
	public static void main(String[] args){
		
		Deque_Array da = new Deque_Array(5);
		
		for(int i =0; i<5; i++){
			da.insertRear(i);
		}
		
		da.display();
		
		da.insertRight(4);
		da.insertRear(3);
		
		long[] item = new long[1];
		da.removeFront(item);
		System.out.println(item[0]);
		da.removeFront(item);
		da.removeFront(item);
		da.removeFront(item);
		da.removeFront(item);
		System.out.println(item[0]);
		System.out.println("");
		da.variable();
		
		System.out.println("");
		da.removeFront(item);
		da.removeleft(item);
//		da.variable();
		
	}

}
