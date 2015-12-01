package Study.DataStruct.Node.Simple;

/**
 * @FileName    : LinkNode.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 단순 노드 
 */

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
