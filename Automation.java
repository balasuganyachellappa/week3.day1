package week3.day1;

public class Automation implements Language, TestTool {
	final int a=15;
	String name;
	 int b;
	
	public static void main(String[] args) {
		Automation myCode=new Automation();
		myCode.java();
		myCode.selenium();
				
	}

public void java() {
	System.out.println("Executing from java method inetface language");	
	this.getName();
	
}
public  void selenium() {
	
	int a =21;
	//System.out.println(b);
	System.out.println("using this final keyword here" +a);		
}
public void getName()
{

System.out.println("hi is executing for this keyword");
}
}