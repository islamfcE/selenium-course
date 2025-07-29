package FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:\\Users\\dell\\IdeaProjects\\qc card_selenium_course\\src\\main\\resources\\index.html");

        driver.findElement(By.id("welcome")).getText();
        System.out.println(driver.findElement(By.id("welcome")).getText());
        driver.quit();
    }
}
