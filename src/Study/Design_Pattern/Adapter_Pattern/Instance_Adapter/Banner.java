package Study.Design_Pattern.Adapter_Pattern.Instance_Adapter;

public class Banner {
	
	private String string ;

	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParen(){
		System.out.println("( " + string +" )");
	}
	
	public void showWithAster(){
		System.out.println("*" + string +"*");
	}
	
}
