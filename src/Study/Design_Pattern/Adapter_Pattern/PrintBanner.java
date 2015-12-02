package Study.Design_Pattern.Adapter_Pattern;

/**
 * @FileName    : PrintBanner.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 2. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : PrintBannerŬ������ Banner�� ��ӹް� Print�� �����Ѵ�. Print�������̽��� ������ �ʿ��ѵ�
 * 				 ��ӹ��� BannerŬ�������� ���ǵ� �޼ҵ忡�� �����Ѵ�. �� Print Ÿ������ PrintBanner �����ϸ�
 * 				 Print �޼ҵ���� ����� �� ������ �������� ������ BannerŬ������ �޼ҵ�鿡�� ����
 * 				 PrintBannerŬ������ Adapter�� ��Ȱ
 * 
 *  -- Adapter ���� : Target�� ������Ű�� ���� ��
 *  				 Adapter������ ������ Ŭ������ ���� �������� �ʰ� ������ �������̽�(API)�� ���߷��� ��
 *  
 *  -- Adapter ���Ͽ����� ����Ŭ������ �ҽ� ���α׷��� �ݵ�� �ʿ� �Ѱ��� �ƴϴ�.
 *     ���� Ŭ������ ��縸 �˸� ���ο� Ŭ������ ���� �� �ִ�.
 *     
 *  --  Adapter ������ �������� �Ź����� ȣȯ���� ���� ���� �� �� �ִ�. (�������� �Ź����� ������ ����)
 *     
 *  -- Adaptee(���� ���� ���ִ� Ŭ������ ����) ���Ұ� Target��Ȱ�� ����� ����ġ�� �������� ��� ���Ұ�.
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
