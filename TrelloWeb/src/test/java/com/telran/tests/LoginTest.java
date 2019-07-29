package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
WebDriver driver;

@BeforeClass
public void setUp() {
    driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.navigate().to("https://trello.com");


}

@Test
public void loginTest() throws InterruptedException {
    //click on login button
    driver.findElement(By.cssSelector("[href='/login']")).click();
    //fill login & password
    driver.findElement(By.id("user")).sendKeys("zalannet@yandex.ru");
    driver.findElement(By.id("password")).sendKeys("hjrhjr27");
    //click on login button
    driver.findElement(By.id("login")).click();
    Thread.sleep(4000);

}


@AfterClass
public void tearDown(){
    driver.quit();
}
}
