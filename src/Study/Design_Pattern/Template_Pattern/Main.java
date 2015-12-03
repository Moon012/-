package Study.Design_Pattern.Template_Pattern;

/**
 * @FileName    : Main.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : AbstractDisplay클래스 타입으로 상속받은 CharDisplay, StringDisplay 객체를 생성시킴(다형성)
 * 				 구현 방식은 몰라도 AbstractDisplay 클래스의 display()메소드를 동작시키면 값 출력
 * 
 * -- Template Method 패턴 이점 : 상위 클래스의 템플릿 메소드에서 알고리즘이 기술 되어 있으므로 하위 클래스측에서는 
 * 								알고리즘을 일일이 기술할 필요 없음.
 * 								Template Method 패턴 작성된 프로그램의 알고리즘의 오류 발견시
 * 								 템플릿 메소드만 수정하면 됨.
 * 
 * -- Template Method 클래스 연계 : 상위 클래스와 하위 클래스가 연계되어있다.
 * 								 상위 클래스에서 선언된 추상메소드를 실제 하위 클래스에서 구현할때에는 
 * 								 그 메소드가 어느 타이밍에서 호출되는지 이해해야 한다.
 * 								 상위 클래스의 소스 프로그램 없으면 하위 클래스의 구현이 어려울 수 있다.
 * 
 * -- LSP(The Liskov Substitution Principle) : 상위 클래스형 변수에 하위 클래스의 인스턴스를 대입해도 
 * 											    제대로 작동할 수 있도록 한다.
 * 
 * 	(instanceof등으로 하위 클래스의 종류를 특정하지 않아도 작동하도록 만드는 것이 좋다.)
 * 											
 */


public class Main {
	
	public static void main(String[] args){
		
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");
		
		d1.display();
		d2.display();
		d3.display();
		
	}
	

}
