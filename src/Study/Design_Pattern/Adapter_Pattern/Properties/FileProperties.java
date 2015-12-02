package Study.Design_Pattern.Adapter_Pattern.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @FileName    : FileProperties.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : FileIo�� �̿��� Properties�� �а� ���� �ֵ��� ���ִ� Ŭ���� (Adapter)
 * 				  ������ �ָ� Properties Ŭ������ �޼ҵ���� ���۽�Ŵ.
 * 
 */
public class FileProperties extends Properties implements FileIO {
	

	@Override
	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename), "written by FileProperties");
		
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key, "");
	}

}
