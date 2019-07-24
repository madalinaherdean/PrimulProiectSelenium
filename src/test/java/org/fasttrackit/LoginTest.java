package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    //Ex 8
    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("madalina_herdean@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#send2")).click();
    }

    @Test
    public void login_userincorect() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();
    }

    @Test
    public void login_passwordincorect() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("madalina_herdean@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#send2")).click();
    }
    @Test
    public  void forgotyourpassword() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();
        driver.findElement(By.cssSelector("#email")).sendKeys("madalina_herdean@yahoo.com");
        WebElement forgotButton = driver.findElement(By.cssSelector("#login-form > div > div.col-2.registered-users > div.content.fieldset > ul > li:nth-child(3) > a"));
        forgotButton.click();
        driver.findElement(By.cssSelector("#emailaddres")).sendKeys("madalina_herdean@yahoo.com");
    }
    }