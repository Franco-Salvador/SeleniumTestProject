package Locators;

// Importar las librerías necesarias
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) {
        // Establecer la ruta del chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\InstallationProject\\Project\\SeleniumTestProject\\src\\main\\resources\\drivers\\chromedriver.exe");

        // Inicializar el navegador
        WebDriver driver = new ChromeDriver();

        // Abrir la página de registro
        driver.get("https://www.saucedemo.com/");

        //Maximizar
        driver.manage().window().maximize();

        // Encontrar el campo de nombre de usuario
        WebElement nombreUsuario = driver.findElement(By.id("user-name"));

        // Enviar el nombre de usuario
        nombreUsuario.sendKeys("standard_user");

        // Encontrar el campo de contraseña
        WebElement contraseña = driver.findElement(By.id("password"));

        // Enviar la contraseña
        contraseña.sendKeys("secret_sauce");

        // Encontrar el botón de registro
        WebElement botonRegistro = driver.findElement(By.id("login-button"));

        // Hacer clic en el botón de registro
        botonRegistro.click();

        // Esperar 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // No cerrar el navegador
        // driver.close();
    }
}