package Study.Design_Pattern.Adapter_Pattern;

/**
 * @FileName    : Banner.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Banner클래스는 데이터를 가지기 위한 클래스 생성자 및 동작 메소드 2개가 존재
 */


public class Banner {
	
	private String string ;

	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParen(){
		System.out.println("( " + string +" )");
	}
	
	public void showWithAster(){
		System.out.println("*" + string +"*");
	}
	
}
