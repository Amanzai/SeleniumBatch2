package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();
        //driver.quit();
    }
}
