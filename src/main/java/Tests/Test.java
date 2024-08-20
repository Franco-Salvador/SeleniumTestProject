package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\OneDrive\\Documentos\\InstallationProject\\Project\\SeleniumTestProject\\src\\main\\resources\\drivers\\chromedriver.exe");

// Initialize browser
        WebDriver driver = new ChromeDriver();

// Open google
        driver.get("http://www.google.com");

// Maximize browser
        driver.manage().window().maximize();

// Find search sobre google
//WebElement searchBox = driver.findElement(By.name("q"));
        WebElement sobreGoogle = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[1]"));
        sobreGoogle.click();

        WebElement todosProductos = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[3]/div/div[2]/div/div/a[1]"));
        todosProductos.click();


// Enter search query
//searchBox.sendKeys("Meta AI");

// Submit search query
//searchBox.submit();

// Wait for 2 seconds



// Close the browser

    }
}