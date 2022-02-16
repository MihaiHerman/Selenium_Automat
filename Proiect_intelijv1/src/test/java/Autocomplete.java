/*
       o variabila este o adresa de memorie la care sunt stocate informatii
       o functie reprezinta un set de instructiuni grupate sub un singur nume
       o clasa reprezinta un tipar care defineste atributele pe care trebuie sa le aiba un obiect si actiunile pe care trebuie sa le faca
       un obiect este o instanta a unei clase, adica o reprezentare reala creata pe baza tiparului definit in clasa
       un tip de data este o proprietate a unei variabile sau functii care specifica ce informatii pot sa fie stocate in variabile sau returnata de catre functie
       putem spune ca o functie returneaza ceva, atunci cand trimite rezultatul actiunii pe care o face catre exterior
        */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/herma/Desktop/chromedriver.exe"); // Aici i-am spus sistemului unde sa gaseasca driverul
        WebDriver driver = new ChromeDriver(); //Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
        driver.get("https://formy-project.herokuapp.com/autocomplete"); // Aici am deschis linkul specificat intre paranteze
        WebElement autocomplete = driver.findElement(By.id("autocomplete")); //Aici identificam prin intermediul id-ului elementul textbox in care se poate pune adresa
                                            //elementul identificat este salvat intr-o variabila numita autocomplete care are tipul de data webElement.
        autocomplete.sendKeys("strada Lalelelor, nr. 5");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")).click();
        driver.quit();
    }
}
