package Study.DataStruct.Node.Double;

/**
 * 이중 연결 리스트
 * @FileName    : LinkNode.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 이중 연결 리스트를 위한 노드
 */

public class LinkNode {
	
	private int data;
	private LinkNode nextNode;
	private LinkNode previous;
	
	
	public LinkNode (int inputData){
		data = inputData;
	}
	
	public void print(){
		System.out.println(data);
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(LinkNode nextNode) {
		this.nextNode = nextNode;
	}
	public LinkNode getPrevious() {
		return previous;
	}
	public void setPrevious(LinkNode previous) {
		this.previous = previous;
	}
	
	

}
