package Study.DataStruct.Stack.Linked_List_Stack;

public class StackNode {
	
	private long stackItem;
	private StackNode link;
	
	public StackNode(long item) {
		this.stackItem = item;
	}
	
	public long getStackItem() {
		return stackItem;
	}
	public void setStackItem(long stackItem) {
		this.stackItem = stackItem;
	}
	public StackNode getLink() {
		return link;
	}
	public void setLink(StackNode link) {
		this.link = link;
	}
	
	
	
}
