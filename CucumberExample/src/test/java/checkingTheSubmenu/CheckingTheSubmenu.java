package checkingTheSubmenu;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckingTheSubmenu {
//    private  ChromeDriver driver;
//    private static final String CATALOG_NAME_PATTERN = "//span[@class='b-main-navigation__text' and text()='%s']";
//    private static final String NAME_PATTERN = "//span[@class='b-main-navigation__dropdown-advert-sign' and text()='%s']";
//   private static final String PRICE_NAME_PATTERN = "//*[contains(text(), '%s')]";
//
////
////    @Дано("запуск страницы {string}")
////    public void запуск_страницы(String string) {
////        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
////        driver = new ChromeDriver();
////        driver.get(string);
////    }
////
////    @Когда("выбераем пункт {string}")
////    public void пользователь_выбирает_пункт(String string) {
////        WebElement getmenu = driver.findElement(By.xpath(String.format(CATALOG_NAME_PATTERN, string)));
////        Actions actions= new Actions(driver);
////        actions.moveToElement(getmenu).perform();
////    }
//
////    @Тогда("отображающее категории деление по цене - {string}, {string}, {string}")
////    public void отображающее_категории_цены (String string1, String string2, String string3) {
////       boolean actual1 =  driver.findElement(By.xpath(String.format(PRICE_NAME_PATTERN, string1))).isDisplayed();
////       boolean actual2 =  driver.findElement(By.xpath(String.format(PRICE_NAME_PATTERN, string2))).isDisplayed();
////       boolean actual3 =  driver.findElement(By.xpath(String.format(PRICE_NAME_PATTERN, string3))).isDisplayed();
////
////       Assert.assertTrue(actual1);
////       Assert.assertTrue(actual2);
////       Assert.assertTrue(actual3);
////    }
//
////    @Тогда("отображающее категории  деление по городам - {string}, {string}, {string}")
////    public void отображающее_категории_города(String string1, String string2, String string3) {
////        boolean actual1 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string1))).isDisplayed();
////        boolean actual2 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string2))).isDisplayed();
////        boolean actual3 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string3))).isDisplayed();
////
////        Assert.assertTrue(actual1);
////        Assert.assertTrue(actual2);
////        Assert.assertTrue(actual3);
////    }
//
//    @Тогда("отображающее категории деление по цене - {string}, {string}, {string}")
////    @Тогда("отображающее категории  деление по городам - {string}, {string}, {string}")
////    @Тогда("отображающее категории  деление по маркам - {string}, {string}, {string}")
//    public void отображающее_категории_маке(String string1, String string2, String string3) {
//        boolean actual1 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string1))).isDisplayed();
//        boolean actual2 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string2))).isDisplayed();
//        boolean actual3 = driver.findElement(By.xpath(String.format(NAME_PATTERN, string3))).isDisplayed();
//
//        Assert.assertTrue(actual1);
//        Assert.assertTrue(actual2);
//        Assert.assertTrue(actual3);
//    }
}
