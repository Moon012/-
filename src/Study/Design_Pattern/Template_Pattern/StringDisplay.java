package Study.Design_Pattern.Template_Pattern;

/**
 * @FileName    : StringDisplay.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : AbstractDisplay를 상속받아 구현
 */

public class StringDisplay extends AbstractDisplay {
	
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}
	
	
	@Override
	public void open() {
		printLine();
		
	}


	@Override
	public void print() {
		System.out.println("|" +string+"|");
	}

	@Override
	public void close() {
		printLine();
		
	}
	
	private void printLine() {
		System.out.print("+");
		for(int i = 0; i<width; i++){
			System.out.print("-");
		}
		System.out.println("+");
		
	}
	
	
}
