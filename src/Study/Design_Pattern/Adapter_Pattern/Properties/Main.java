package Study.Design_Pattern.Adapter_Pattern.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @FileName    : Main.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Properties �׽�Ʈ �غ������� Main Ŭ����
 */

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		
		
		try {

			f.readFromFile("C:/Users/Moon/workspace/myStudy/src/Study/Design_Pattern/Adapter_Pattern/Properties/file.txt");
			System.out.println(f.getValue("year"));
			f.setValue("year", "2015");
			f.setValue("month", "12");
			f.setValue("day", "2");
			f.writeToFile("C:/Users/Moon/workspace/myStudy/src/Study/Design_Pattern/Adapter_Pattern/Properties/newfile.txt");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
