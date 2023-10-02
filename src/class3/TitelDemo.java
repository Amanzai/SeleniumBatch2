package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitelDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dreamhiringacademy.com/");
        boolean text=driver.findElement(By.xpath("//h1[text()='Join core Tech Human Resource Management System']")).isDisplayed();
        if (text){
            System.out.println("visible");

        }else {
            System.out.println("not visible");
        }
        driver.quit();
    }

}
