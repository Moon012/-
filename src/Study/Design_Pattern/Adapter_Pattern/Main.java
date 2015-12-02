package Study.Design_Pattern.Adapter_Pattern;

/**
 * @FileName    : Main.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Adapter패턴을 동작시키기 위한 Main클래스 
 */

public class Main {

	public static void main(String[] args) {
		
		Print p = new PrintBanner("Hello");
		p.printWeek();
		p.printStrong();
	}
	

}
