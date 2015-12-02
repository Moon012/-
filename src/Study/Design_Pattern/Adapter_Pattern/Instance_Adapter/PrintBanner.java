package Study.Design_Pattern.Adapter_Pattern.Instance_Adapter;


/**
 * @FileName    : PrintBanner.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : PrintBanner 클래스는 Print 추상클래스를 상속 받아 구현하고 Banner클래스를 인스턴스 시켜
 * 				  인스턴스화 된 Banner클래스의 메소드를 사용가능하게 함
 * 				  Print 클래스의 각 메소들들은 Banner클래스의 메소드에 할일들을 위임함. 
 */

public class PrintBanner extends Print {
	Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeek() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
}
