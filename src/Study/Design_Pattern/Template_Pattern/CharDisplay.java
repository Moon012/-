package Study.Design_Pattern.Template_Pattern;

/**
 * @FileName    : CharDisplay.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : AbstractDisplay를 상속 받아 구현 
 */

public class CharDisplay extends AbstractDisplay{
	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");		
	}

}
