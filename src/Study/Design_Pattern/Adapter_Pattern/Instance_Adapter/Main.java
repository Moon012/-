package Study.Design_Pattern.Adapter_Pattern.Instance_Adapter;

public class Main {

	public static void main(String[] args) {
		
		Print p = new PrintBanner("Hello");
		p.printWeek();
		p.printStrong();
		
	}

}
