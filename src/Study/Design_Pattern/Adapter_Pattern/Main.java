package Study.Design_Pattern.Adapter_Pattern;

/**
 * @FileName    : Main.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Adapter������ ���۽�Ű�� ���� MainŬ���� 
 */

public class Main {

	public static void main(String[] args) {
		
		Print p = new PrintBanner("Hello");
		p.printWeek();
		p.printStrong();
	}
	

}
