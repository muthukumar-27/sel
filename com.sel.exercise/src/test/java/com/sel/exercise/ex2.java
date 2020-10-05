package com.sel.exercise;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ex2 {
	public static void main(String arg[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			
			
			d.get("https://www.qaautomation.co.in/2018/11/full-page-screenshot-using-selenium-ashot.html");
		JavascriptExecutor js=(JavascriptExecutor)d;
		
			System.out.println(js.executeScript("return document.URL"));
			System.out.println(js.executeScript("return document.TITLE"));
			System.out.println(js.executeScript("return window.innerHeight"));
			System.out.println(js.executeScript("return window.innerWidth"));
			Thread.sleep(1000);
			js.executeScript("history.go(0);");
			
			TakesScreenshot s=(TakesScreenshot)d;
			File sr=s.getScreenshotAs(OutputType.FILE);
			File des=new File("D://downloads/t1.png");
			FileUtils.copyFile(sr, des);
			
			
			Screenshot sc=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(d);
			ImageIO.write(sc.getImage(),"PNG",new File("D://downloads/p1.png"));
			
			
	}
}
