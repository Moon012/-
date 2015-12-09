package Study.DataStruct.Queue.ProrityQueue;

/**
 * @FileName    : PriorityQ.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : PriorityQueue�� �켱���� ���� �� ������ �����ϴ�. ���Խ� ũ�� �񱳰� ����.
 */

public class PriorityQ {
	private int size;
	private int[] queueArray;
	private int items;
	

	public PriorityQ(int size) {
		this.size = size;
		queueArray = new int[this.size];
		items = 0;
	}
	
	public boolean insert(int item){
		
		int j;
		
		if( isFull() ){
			System.out.println("queue is full");
			return false;
		}
		
		if( isEmpty() ){
			queueArray[items++] = item;
		}
		
		else{
			
			for(j = items - 1; j >= 0; j--){
				
				if(item > queueArray[j]){
					queueArray[j+1] = queueArray[j];
				}else{
					
					break;
				}
				
			}
			
			queueArray[j+1] = item;
			items++;
		}
		
		return true;
	}
	
	
	public boolean remove(){
		
		if( isEmpty() ){
			System.out.println("queue is empty");
			return false;
		}else{
			System.out.println(queueArray[--items]);
			return true;
		}
	}
	

	private boolean isFull() {
		
		return (items == queueArray.length);
	}
	
	private boolean isEmpty() {
		
		return (items == 0);
	}
	
	public void display(){

		for(int j = items-1; j >=0; j--){
			System.out.println(queueArray[j]);
		}
	}
}
