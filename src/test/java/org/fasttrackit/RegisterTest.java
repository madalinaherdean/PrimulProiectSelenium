package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    //ex 5
    @Test
    public void RegisterTest1() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement registerButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a"));
        registerButton.click();
        WebElement newsletter = driver.findElement(By.cssSelector("#is_subscribed"));
        newsletter.click();

        driver.findElement(By.cssSelector("#firstname")).sendKeys("Herdean");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Madalina");
        driver.findElement(By.cssSelector("#emailid")).sendKeys("madalina_herdean@yahoo.com");
        driver.findElement(By.cssSelector("#pasword")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#confirmpasword")).sendKeys("1234567");
    }
}


