package javaMethods;

//Java program to demonstrate working of Robot 
//class. This program is for Windoes. It opens 
//notepad and types a message. 
import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.*; 

public class Robo 
{ 
	public static void main(String[] args) throws IOException, 
						AWTException, InterruptedException 
	{ 
		//String command = "notepad.exe"; 
		//String command = "iexplore.exe"; 
		
		//Runtime run = Runtime.getRuntime(); 
		//run.exec(command); 
		Runtime.getRuntime().exec("cmd /c start http://google.com/");
		try { 
			Thread.sleep(2000); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 

		// Create an instance of Robot class 
		Robot robot = new Robot(); 

		// Press keys using robot. A gap of 
		// of 500 mili seconds is added after 
		// every key press 
		robot.keyPress(KeyEvent.VK_K); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_E); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_S); 
		Thread.sleep(500); 
		 
		
		robot.keyPress(KeyEvent.VK_SPACE); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_Y); 
		Thread.sleep(500); 
		
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_O); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_M); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_SPACE); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_G); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_E); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_E); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_K); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_S); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_F); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_O); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_R); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_G); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_E); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_E); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_K); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_S); 
	} 
} 

