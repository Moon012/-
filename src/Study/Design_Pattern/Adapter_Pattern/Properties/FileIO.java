package Study.Design_Pattern.Adapter_Pattern.Properties;

import java.io.IOException;

/**
 * @FileName    : FileIO.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : properties를 읽고 쓰기 위한 FileIO 인터페이스
 */
public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key, String value);
	public String getValue(String key);

}
