package Study.DataStruct.Node.Double_Ended;

/**
 * -- 이중 단말 연결 리스트
 * @FileName    : Excute.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 이중 단말 연결리스트 테스트
 */

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
