import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCurrentWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/herma/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.findElement(By.id("new-tab-button")).click();
        Thread.sleep(1000);
        driver.close(); //functia close inchide fereastra activa
    }
}
