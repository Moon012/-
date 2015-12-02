package Study.Design_Pattern.Adapter_Pattern.Properties;

import java.io.IOException;

/**
 * @FileName    : FileIO.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : properties�� �а� ���� ���� FileIO �������̽�
 */
public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key, String value);
	public String getValue(String key);

}
