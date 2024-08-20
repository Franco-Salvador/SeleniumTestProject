package SaucedemoTests;

// Importar las librerías necesarias
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Método para realizar el login
    public void login(String username, String password) {
        // Encontrar el campo de nombre de usuario
        WebElement nombreUsuario = driver.findElement(By.id("user-name"));
        nombreUsuario.sendKeys(username);

        // Encontrar el campo de contraseña
        WebElement contraseña = driver.findElement(By.id("password"));
        contraseña.sendKeys(password);

        // Encontrar el botón de registro
        WebElement botonRegistro = driver.findElement(By.id("login-button"));
        botonRegistro.click();
    }
}
