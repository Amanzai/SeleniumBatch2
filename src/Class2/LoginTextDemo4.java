package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTextDemo4 {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/");
        driver.findElement(By.linkText("login In")).isDisplayed();
        System.out.println("test");
    }
}
