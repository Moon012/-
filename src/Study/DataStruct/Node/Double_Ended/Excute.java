package Study.DataStruct.Node.Double_Ended;

public class Excute {

	public static void main(String[] args) {
		
		Double_Ended de =  new Double_Ended();
		
		de.insertNode(4);
		de.insertNode(6);
		de.insertNode(2);
		de.insertNode(1);
		de.insertNode(7);
		
		de.display();
		
		System.out.println("");
		
		de.delete(4);
		de.delete(7); // 마지막 노드 였음
		de.display();
		System.out.println("마지막 노드 삭제 후 ");
		System.out.println(de.headerNode.getLastNode().getData());
		
//		System.out.println("");
//		
//		de.find(7);
		
		
	}

}
