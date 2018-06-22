package com.javacodegeeks.testng.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgMavenExampleTest {

		@Test
		public void test(){
     		System.setProperty("webdriver.chrome.driver", "C:/Users/dinakaran_palaniswam/Downloads/chromedriver_win32 (3)/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com");
			String name=driver.getTitle();
			System.out.println("Title is "+name);
	}
			
	
	}