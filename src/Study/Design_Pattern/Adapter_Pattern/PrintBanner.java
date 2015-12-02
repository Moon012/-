package Study.Design_Pattern.Adapter_Pattern;

/**
 * @FileName    : PrintBanner.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : PrintBanner클래스는 Banner를 상속받고 Print를 구현한다. Print인터페이스는 구현이 필요한데
 * 				 상속받은 Banner클래스에서 정의된 메소드에게 위임한다. 즉 Print 타입으로 PrintBanner 생성하면
 * 				 Print 메소드들을 사용할 수 있지만 실직적은 동작은 Banner클래스의 메소드들에게 위임
 * 				 PrintBanner클래스가 Adapter의 역활
 * 
 *  -- Adapter 목적 : Target을 만족시키기 위한 것
 *  				 Adapter패턴은 기존의 클래스를 전혀 수정하지 않고 목적한 인터페이스(API)에 맞추려는 것
 *  
 *  -- Adapter 패턴에서는 기존클래스의 소스 프로그램이 반드시 필요 한것은 아니다.
 *     기존 클래스의 사양만 알면 새로운 클래스를 만들 수 있다.
 *     
 *  --  Adapter 패턴은 구버전과 신버전의 호환성을 위해 적용 될 수 있다. (구버전과 신버전의 공존을 위해)
 *     
 *  -- Adaptee(실제 실행 해주는 클래스를 말함) 역할과 Target역활의 기능이 지나치게 동떨어진 경우 사용불가.
 */


public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeek() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
	
}
