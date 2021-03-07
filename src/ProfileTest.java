import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ProfileTest {

    public String baseurl = "https://www.instagram.com/";
    public String driverPath = "D://SQA_ISTQB EXAM//Selenium Jars and Drivers//drivers//ChromeDrivers//chromedriver_win32//chromedriver.exe";
    public WebDriver driver;


    @Test(priority = 1)
    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseurl);


    }

    @Test(priority = 2)
    public void login() throws InterruptedException {
        driver.get("https://www.instagram.com/softtech_waves/");

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".tdiEy > .sqdOP")).click();
        driver.manage().timeouts().pageLoadTimeout(30 , TimeUnit.SECONDS);
        Thread.sleep(200);
        driver.findElement(By.name("username")).click();
        Thread.sleep(200);
        driver.findElement(By.name("username")).sendKeys("923006706563");
        Thread.sleep(200);
        driver.findElement(By.name("password")).click();
        Thread.sleep(200);
        driver.findElement(By.name("password")).sendKeys("Arshishab5000");
        Thread.sleep(200);
        driver.findElement(By.cssSelector(".sqdOP > .Igw0E")).click();

    }

   @Test(priority = 3)
   public void teardown(){
        System.out.println("Close browser!");
    }

}
