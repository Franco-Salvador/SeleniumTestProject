package SaucedemoTests;

// Importar las librerías necesarias
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
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

        // No cerrar el navegador
        // driver.close();
    }
}

