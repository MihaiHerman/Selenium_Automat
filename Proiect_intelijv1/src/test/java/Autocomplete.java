import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/herma/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
    }
}
