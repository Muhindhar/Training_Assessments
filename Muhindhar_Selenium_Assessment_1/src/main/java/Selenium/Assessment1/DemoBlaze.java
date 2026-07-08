package Selenium.Assessment1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlaze {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loginBtn = driver.findElement(By.id("login2"));
        loginBtn.click();

        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("admin");

        WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
        submitBtn.click();
        WebElement userGreeting = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        if (userGreeting.isDisplayed()) {
            System.out.println("Login Successful");
        }

        WebElement laptops = wait.until(
                ExpectedConditions.elementToBeClickable(By.linkText("Laptops")));
        laptops.click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[@id='tbodyid']//h4/a")));

        List<WebElement> productList = driver.findElements(
                By.xpath("//div[@id='tbodyid']//h4/a"));

        Set<String> sortedProducts = new TreeSet<>();

        for (WebElement p : productList) {
            sortedProducts.add(p.getText());
        }

        System.out.println("Sorted Laptop List:");
        for (String name : sortedProducts) {
            System.out.println(name);
        }

        WebElement mac = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("MacBook Pro")));

        Actions actions = new Actions(driver);
        actions.moveToElement(mac).perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", mac);

        System.out.println("Found Laptop: " + mac.getText());

        mac.click();

     
        WebElement addToCart = wait.until(
                ExpectedConditions.elementToBeClickable(By.linkText("Add to cart")));
        addToCart.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        System.out.println("Alert handled");
        System.out.println("Product added to cart");

        WebElement cart = driver.findElement(By.id("cartur"));
        cart.click();

        WebElement productTitle = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]")));
        WebElement productPrice = driver.findElement(By.xpath("//td[3]"));

        System.out.println("Product: " + productTitle.getText());
        System.out.println("Price: " + productPrice.getText());
        System.out.println("Product Name and Cost verified successfully");

        WebElement placeOrder = driver.findElement(By.xpath("//button[text()='Place Order']"));
        placeOrder.click();

        WebElement name = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        name.sendKeys("Test User");

        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("salem");
        driver.findElement(By.id("card")).sendKeys("123456789");
        driver.findElement(By.id("month")).sendKeys("09");
        driver.findElement(By.id("year")).sendKeys("2026");

        WebElement purchaseBtn = driver.findElement(By.xpath("//button[text()='Purchase']"));
        purchaseBtn.click();

        WebElement purchaseMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//p[@class='lead text-muted ']")));

        String message = purchaseMsg.getText();

        if (message.contains("Id")) {
            System.out.println("Purchase done Successfully");
            System.out.println(message);
        } else {
            System.out.println("Order is Unsuccessful");
        }
        WebElement okBtn = driver.findElement(By.xpath("//button[text()='OK']"));
        okBtn.click();
        driver.quit();
    }
}