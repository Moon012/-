package Study.DataStruct.Stack.Linked_List_Stack;


/**
 * @FileName    : StackList.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 3. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : linked list로 구현 한 stack
 * 				  
 *  -- 내가 생각 할 점  : link는 이전 노드를 즉, stack은 최상 단 부터 pop되기때문에 밑에 노드에 link가 걸려 있어야 한다.  
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
