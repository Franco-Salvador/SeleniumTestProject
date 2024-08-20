package SaucedemoTests;

// Importar las librerías necesarias
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AddTest {
    public static void main(String[] args) {
        // Establecer la ruta del chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\InstallationProject\\Project\\SeleniumTestProject\\src\\main\\resources\\drivers\\chromedriver.exe");

        // Inicializar el navegador
        WebDriver driver = new ChromeDriver();

        // Abrir la página de registro
        driver.get("https://www.saucedemo.com/");

        // Maximizar la ventana del navegador
        driver.manage().window().maximize();

        // Crear una instancia de LoginPage
        LoginPage loginPage = new LoginPage(driver);

        // Realizar el login
        loginPage.login("standard_user", "secret_sauce");

        // Esperar 2 segundos para que se cargue la página de productos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Encontrar todos los botones "Add to cart" y hacer clic en ellos
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector("button[name^='add-to-cart']"));

        for (WebElement button : addToCartButtons) {
            button.click();
            // Esperar un momento después de cada clic (opcional)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // No cerrar el navegador
        // driver.close();
    }
}


