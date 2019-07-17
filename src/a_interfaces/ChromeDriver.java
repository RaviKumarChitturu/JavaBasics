package a_interfaces;

public class ChromeDriver implements Webpage {
	
	public void click() {

		System.out.println("click method from ChromeBrowser");

	}
	
	public void sendKeys() {

		System.out.println("sendKeys method from ChromeBrowser");

	}

	public void getText() {

		System.out.println("getText method from ChromeBrowser");

	}

	public void waitForElement(){

		System.out.println("waitForElement method from ChromeBrowser");

	}
	public void getWebElement(){
		
	}
	
	public static void main(String[] args) {
		Webpage w=new ChromeDriver();
		w.getText();
		w.sendKeys();
		w.click();
		w.getWebElement();
		
		ChromeDriver c=new ChromeDriver();
		c.waitForElement();
		

	}

}
