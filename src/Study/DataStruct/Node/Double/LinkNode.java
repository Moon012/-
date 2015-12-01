package Study.DataStruct.Node.Double;

/**
 * ���� ���� ����Ʈ
 * @FileName    : LinkNode.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ���� ���� ����Ʈ�� ���� ���
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
