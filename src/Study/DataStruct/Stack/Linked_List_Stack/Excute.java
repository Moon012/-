package Study.DataStruct.Stack.Linked_List_Stack;

public class Excute {
	
	public static void main(String[] args){
		
		StackList sl = new StackList();
		
		for(int i = 0; i<10; i++){
			sl.push(i);
		}
		
		
		long[] item = new long[1];
		
		System.out.print("peek : ");
		sl.peek(item);
		System.out.println(item[0]);
		
		
		System.out.print("pop : ");
		sl.pop(item);
		System.out.print(item[0] + " ");
		sl.pop(item);
		System.out.println(item[0] + " ");
		
		
	}

}
