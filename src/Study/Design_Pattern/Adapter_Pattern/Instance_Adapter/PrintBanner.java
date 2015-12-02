package Study.Design_Pattern.Adapter_Pattern.Instance_Adapter;


/**
 * @FileName    : PrintBanner.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : PrintBanner Ŭ������ Print �߻�Ŭ������ ��� �޾� �����ϰ� BannerŬ������ �ν��Ͻ� ����
 * 				  �ν��Ͻ�ȭ �� BannerŬ������ �޼ҵ带 ��밡���ϰ� ��
 * 				  Print Ŭ������ �� �޼ҵ���� BannerŬ������ �޼ҵ忡 ���ϵ��� ������. 
 */

public class PrintBanner extends Print {
	Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeek() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
}
