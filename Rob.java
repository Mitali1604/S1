package package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import newpackage.BaseClass;

public class Rob extends BaseClass 
	{

		public static void main(String[] args) throws InterruptedException, AWTException
		{
			driver.get("http://www.google.com");
			
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_M);
				r.keyRelease(KeyEvent.VK_M);
				r.keyPress(KeyEvent.VK_I);
				r.keyRelease(KeyEvent.VK_I);
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_T);
				r.keyPress(KeyEvent.VK_S);
				r.keyRelease(KeyEvent.VK_S);
				
				Thread.sleep(2000);
			
		}


}
