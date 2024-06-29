

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MtsTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://mts.by");
        WebElement declineCookieButton = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        declineCookieButton.click();


    }

    @Test
    public void testBlockTitle() {
        By titleLocator = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > h2");
        String actualTitle = driver.findElement(titleLocator).getText();
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void testPaymentSystemLogosPresence() {
        WebElement logosElement = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]"));
        Assert.assertTrue(logosElement.isDisplayed());
    }

    @Test
    public void testServiceDetailsLink() {

        WebElement detailsLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", detailsLink);
        wait.until(ExpectedConditions.elementToBeClickable(detailsLink));
        detailsLink.click();
        wait.until(ExpectedConditions.urlContains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }


    @Test

    public void testFieldsAndButtonContinue() {

        WebElement dropdownList = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]"));
        dropdownList.click();
        WebElement communicationServices = driver.findElement(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper.opened > ul > li.select__item.active > p"));
        communicationServices.click();
        driver.findElement(By.cssSelector("#connection-phone")).sendKeys("297777777");
        WebElement sumInput = driver.findElement(By.cssSelector("#connection-sum"));
        sumInput.sendKeys("400");
        WebElement emailInput = driver.findElement(By.cssSelector("#connection-email"));
        emailInput.sendKeys("test.payment2024@mail.ru");
        WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection > button"));
        continueButton.click();
        WebElement bepaidIframe = new WebDriverWait(driver, (10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bepaid-app__container > .bepaid-iframe")));
        driver.switchTo().frame(bepaidIframe);
        WebElement closeButton = driver.findElement(By.cssSelector("body > app-root > div > div > app-header > header > div > app-back-navigation > div > div > svg-icon > svg > line:nth-child(2)"));
        closeButton.click();
        driver.switchTo().defaultContent();
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}