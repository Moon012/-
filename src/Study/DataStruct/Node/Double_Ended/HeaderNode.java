package Study.DataStruct.Node.Double_Ended;

import Study.DataStruct.Node.Simple.LinkNode;

public class HeaderNode {
	
	private LinkNode nextNode;
	private LinkNode lastNode;

	
	public HeaderNode(LinkNode linkNode){
		
		nextNode = linkNode;
	}
	
	
	public LinkNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkNode nextNode) {
		this.nextNode = nextNode;
	}

	public LinkNode getLastNode() {
		return lastNode;
	}

	public void setLastNode(LinkNode lastNode) {
		this.lastNode = lastNode;
	}


}
