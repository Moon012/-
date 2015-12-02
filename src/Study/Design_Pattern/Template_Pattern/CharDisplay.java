package Study.Design_Pattern.Template_Pattern;

/**
 * @FileName    : CharDisplay.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : AbstractDisplay�� ��� �޾� ���� 
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
