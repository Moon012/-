package Study.Design_Pattern.Template_Pattern;

/**
 * @FileName    : AbstractDisplay.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : AbstractDisplay 추상메소드로서 실질적인 구현은 상속받은 클래스에서 하지만 display 메소드로 
 * 				  동작한다. 즉 구현 클래스가 있어야 한다.
 */

public abstract class AbstractDisplay {
	
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	public final void display(){
		open();
		for(int i = 0 ; i<5; i++){
			print();
		}
		close();
	}

}
