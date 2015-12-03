package Study.DataStruct.Stack.Linked_List_Stack;


/**
 * @FileName    : StackList.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 3. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : linked list�� ���� �� stack
 * 				  
 *  -- ���� ���� �� ��  : link�� ���� ��带 ��, stack�� �ֻ� �� ���� pop�Ǳ⶧���� �ؿ� ��忡 link�� �ɷ� �־�� �Ѵ�.  
 */

public class StackList {

	private StackNode top;
	
	public StackList() {
		
		this.top = null;
	}
	
	public void push(long item){
		
		StackNode newNode = new StackNode(item);
		newNode.setLink(top);
		top = newNode;
		
	}
	
	public boolean pop(long item[]){
		
		if( isEmpty() ){
			
			System.out.println("stack is empty");
			return false;
			
		}else {
			
			item[0] = top.getStackItem();
			top = top.getLink();
			
			return  true;
		}
	}
	
	public boolean peek(long[] item){
		
		if( isEmpty() ){
			System.out.println("stack is empty");
			return false;
		}else{
			
			item[0] = top.getStackItem();
			return true;
		}
	}

	private boolean isEmpty() {
		
		return (top == null);
	}
}
