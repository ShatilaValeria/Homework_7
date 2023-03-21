package checkingTheSubmenu;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CheckingTheSubmenu {
    private ChromeDriver driver;
    private static final String CATALOG_NAME_PATTERN = "//span[@class='b-main-navigation__text' and text()='%s']";
    private static final String NAME_PATTERN = "//span[@class='b-main-navigation__dropdown-advert-sign' and text()='%s']";
    private static final String CITY_NAME_PATTERN = "(//span[@class='b-main-navigation__dropdown-advert-sign' and text()='%s'])[2]";
    private static final String MINSK_CITY_NAME_PATTERN = "(//span[@class='b-main-navigation__dropdown-advert-sign' and text()='%s'])[3]";

    @Дано("запуск страницы {string}")
    public void запуск_страницы(String string) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(string);
    }

    @Когда("выбераем пункт {string}")
    public void пользователь_выбирает_пункт(String string) {
        WebElement getmenu = driver.findElement(By.xpath(String.format(CATALOG_NAME_PATTERN, string)));
        Actions actions = new Actions(driver);
        actions.moveToElement(getmenu).perform();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Тогда("отображающее категории по городам 2 - {string}, {string}, {string}")
    public void отображающее_категории_города(String string1, String string2, String string3) {
        boolean actual2 = driver.findElement(By.xpath(String.format(CITY_NAME_PATTERN, string2))).isDisplayed();
        boolean actual3 = driver.findElement(By.xpath(String.format(CITY_NAME_PATTERN, string3))).isDisplayed();
        boolean actual1 = driver.findElement(By.xpath(String.format(MINSK_CITY_NAME_PATTERN, string1))).isDisplayed();

        Assert.assertTrue(actual1);
        Assert.assertTrue(actual2);
        Assert.assertTrue(actual3);
    }

    @Тогда("отображающее категории по ценовому диапазону - {string}, {string}, {string}")
    @Тогда("отображающее категории по количеству комнат - {string}, {string}, {string}")
    @Тогда("отображающее категории деление по цене - {string}, {string}, {string}")
    @Тогда("отображающее категории  деление по городам - {string}, {string}, {string}")
    @Тогда("отображающее категории  деление по маркам - {string}, {string}, {string}")
    public void отображающее_категории_количеству_комнат(String string1, String string2, String string3) {
        boolean actual1 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string1))).isDisplayed();
        boolean actual2 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string2))).isDisplayed();
        boolean actual3 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string3))).isDisplayed();

        Assert.assertTrue(actual1);
        Assert.assertTrue(actual2);
        Assert.assertTrue(actual3);
    }

    @Тогда("закрытие страницы")
    public void закрытие_страницы() {
        driver.quit();
    }
}
