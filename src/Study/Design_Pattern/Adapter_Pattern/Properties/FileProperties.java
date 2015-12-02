package Study.Design_Pattern.Adapter_Pattern.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @FileName    : FileProperties.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : FileIo를 이용해 Properties를 읽고 쓸수 있도록 해주는 클래스 (Adapter)
 * 				  위임을 주면 Properties 클래스의 메소드들을 동작시킴.
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
