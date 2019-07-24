import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wishlist {

    //ex 3
    @Test
    public void wishlist() {
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
        WebElement accountButton1 = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton1.click();
        WebElement WishListButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a"));
        WishListButton.click();
        driver.quit();
    }

    @Test
    public void notloggedin() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement WishListButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a"));
        WishListButton.click();
    }
    @Test
    public void addtowishlist() {
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
        WebElement saleButton = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a"));
        saleButton.click();
        WebElement detailsButton = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a"));
        detailsButton.click();
        WebElement addtocartButton = driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a"));
        addtocartButton.click();

    }



    //ex 4
    @Test
    public void addWishList() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement saleButton = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a"));
        saleButton.click();
        WebElement detailsButton = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a"));
        detailsButton.click();
        WebElement addtocartButton = driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a"));
        addtocartButton.click();
    }

}
