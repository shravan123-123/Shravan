package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		//Step1:Launch The Browser
				WebDriver driver=new ChromeDriver();
				
				//Step2:Navigate To The Application Via URL
				driver.get("https://www.saucedemo.com");
				
				//step3:enter username
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				
				//step4:enter password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
				//step5:click on login
				driver.findElement(By.id("login-button")).click();
		
				//step6:close the browser
				driver.quit();
	}

}

	
	

