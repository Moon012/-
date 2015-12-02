package Study.Design_Pattern.Iterator_Pattern;

/**
 * @FileName    : Aggregate.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : iterator를 interface한 집합체
 */
public interface Aggregate {
	
	public abstract Iterator iterator();
}
