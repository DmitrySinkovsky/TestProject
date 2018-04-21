import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void startSession(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://carvoy.com");`
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

    @Test
    public void LoginTest(){
        driver.findElement(By.cssSelector("li[class='new-sign-in']")).click();
        sleep(5);
        driver.findElement(By.cssSelector("input[id ='exampleInputEmail1']")).sendKeys("lihoy@singree.com");
        driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("1111111");
        sleep(2);
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div/div/form[2]/button")).click();
        sleep(5);
    }
}
