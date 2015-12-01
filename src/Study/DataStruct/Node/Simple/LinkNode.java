package Study.DataStruct.Node.Simple;

public class LinkNode {
	
	private int data;
	private LinkNode nodeNext;
	
	public LinkNode(int inputData){
		this.data = inputData;
	}
	
	public void print(){
		System.out.println(data);
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int inputData){
		this.data = inputData;
	}
	
	public LinkNode getNodeNext(){
		
		return nodeNext;
	}
	
	public void setLinkNode(LinkNode link){
		
		this.nodeNext =  link;
	}
}
