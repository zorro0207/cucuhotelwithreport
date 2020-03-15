package org.stepdef;

import java.io.IOException;

import org.base.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal{
	@Before
	public void beforescenario(){
		System.out.println("launch browser");
		
		try {
			browserLaunch();
			loadUrl("https://adactin.com/HotelApp/");
			windowmax();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	@After
	public void afterscerario(Scenario sc) {
		TakesScreenshot tk= (TakesScreenshot) driver;
	byte[] b1 = tk.getScreenshotAs(OutputType.BYTES);
	sc.embed(b1, "image.png");
	
	 driver.quit();
	 
		
		

	}

}
