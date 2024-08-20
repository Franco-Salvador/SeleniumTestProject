package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        // Configuración del Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\InstallationProject\\Project\\SeleniumTestProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navegación a la página de Google
        driver.get("https://www.google.com");

        // Búsqueda de un término
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium automation");
        searchInput.submit();

        // Espera a que aparezcan los resultados de búsqueda
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Verificación de que se ha encontrado al menos un resultado
        WebElement firstResult = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > h3"));
        System.out.println("Primer resultado: " + firstResult.getText());

        // Cierre del navegador
        driver.quit();
    }
}