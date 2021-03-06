package com.percentagecaculate.practica;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertEquals;

//import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calculatedriverdemo {

private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/percent-calculator.html");
	}

	@Test
	public void testGooglePage() {
		

		
		//Calculadora de porcentaje
	    WebElement cpar1 = driver.findElement(By.name("cpar1"));
	    cpar1.sendKeys("8");
	    
	    WebElement cpar2 = driver.findElement(By.name("cpar2"));
	    cpar2.sendKeys("5");
	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table[1]/tbody/tr[2]/td/input[2]")).click();
	    
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    //Calculadora de porcentaje en frases comunes

	    WebElement c21par1 = driver.findElement(By.name("c21par1"));
	    c21par1.sendKeys("80");
	    
	    WebElement c21par2 = driver.findElement(By.name("c21par2"));
	    c21par2.sendKeys("18");
	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr/td[2]/input[2]")).click();

	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    
	    WebElement c22par1 = driver.findElement(By.name("c22par1"));
	    c22par1.sendKeys("800");
	    
	    WebElement c22par2 = driver.findElement(By.name("c22par2"));
	    c22par2.sendKeys("180");
	    
	    //driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr/td[2]/input[2]")).click();

	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    
	    
	    WebElement c23par1 = driver.findElement(By.name("c23par1"));
	    c23par1.sendKeys("8000");
	    
	    WebElement c23par2 = driver.findElement(By.name("c23par2"));
	    c23par2.sendKeys("1800");
	    
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    
	    //Calculadora de diferencia porcentual

	    WebElement c3par1 = driver.findElement(By.name("c3par1"));
	    c3par1.sendKeys("100");
	    
	    WebElement c3par2 = driver.findElement(By.name("c3par2"));
	    c3par2.sendKeys("10");
	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[3]/td/input[2]")).click();

	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    //Calculadora de cambio de porcentaje

	    WebElement c2par1 = driver.findElement(By.name("c2par1"));
	    c2par1.sendKeys("78");
	    
	    WebElement c2par2 = driver.findElement(By.name("c2par2"));
	    c2par2.sendKeys("10");
	    
	    Select se = new Select(driver.findElement(By.xpath("//*[@name='c2type']")));
	    se.selectByValue("decrease");

	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table[6]/tbody/tr[2]/td/input[2]")).click();

	    	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    
	    
	    
	    
	    
		
	}
	
	/*@Test void localizadores() {
		 
		By locator = By.id("id_del_elemento");
		
		By locator_name = By.name("name_elemnt");
		
		By locator_className = By.className("clase_elemento");
		
		By locator_tagName = By.tagName("tag");
		
		By locator_linktext = By.linkText("texto_link");
		
		By locator_partialLinkText = By.partialLinkText("parte_texto");
		
		By locator_cssSelector = By.cssSelector("input[name='q']");
		
		By locator_Xpath = By.xpath("//input[@name='q']");
		
		// JavaScript
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement searchBox = (WebElement)js.executeScript("return document.getElementsByName('q')[0]");
		
	}*/
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}	
	


