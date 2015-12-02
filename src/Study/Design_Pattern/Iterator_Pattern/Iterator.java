package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : Iterator.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Iterator패턴을 하기 위한 Iterator의 인터페이스를 설계
 * 				  hasNext() 메소드와 next()메소드를 추상화 시킴
 */

public interface Iterator {
	
	public abstract boolean hasNext();
	public abstract Object next();
}
