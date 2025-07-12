import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserRegistration {
    WebDriver driver;

    @BeforeAll
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
//    @Test
//    @DisplayName("Verify if user is Successfully registered")
//    public void submitForm() throws InterruptedException {
//        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
//        driver.findElement(By.id("first_name")).sendKeys("Shafaiat");
//        driver.findElement(By.id("last_name")).sendKeys("Hossain");
//        driver.findElement(By.id("user_email")).sendKeys("shafaiat12345679@gmail.com");
//        driver.findElement(By.id("radio_1665627729_Male")).click();
//        driver.findElement(By.id("user_pass")).sendKeys("Shaf@!12345?");
//        driver.findElement(By.id("input_box_1665629217")).sendKeys("Bangladesh");
//        // Month Selection
//        WebElement dobField=driver.findElement(By.id("date_box_1665628538_field"));
//        dobField.click();
//        Select select=new Select(driver.findElement(By.className("flatpickr-monthDropdown-months")));
//        select.selectByVisibleText("September");
//        // Year Selection
//        WebElement yearDropdown = driver.findElement(By.className("numInputWrapper"));
//        yearDropdown.click();
//        Actions actions=new Actions(driver);
//        actions.sendKeys(Keys.CONTROL+"a");
//        actions.sendKeys(Keys.BACK_SPACE);
//        actions.sendKeys("1998");
//        actions.sendKeys(Keys.ENTER).perform();
//        // Date Selection
//        driver.findElement(By.cssSelector("[aria-label='September 6, 1998']")).click();
//        driver.findElement(By.cssSelector("[data-label=Phone]")).sendKeys("1521534633");
//        List<WebElement>dropDown=driver.findElements(By.className("ur-label"));
//        dropDown.get(9).click();
//        for(int i=0;i<18;i++){
//            actions.sendKeys(Keys.ARROW_DOWN).perform();
//        }
//        WebElement checkbox = driver.findElement(By.cssSelector("label[data-label='Terms and Conditions']"));
//        checkbox.click();
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scroll(0,1500)");
//        Thread.sleep(1000);
//        driver.findElements(By.cssSelector("[type=submit]")).get(2).click();
//        WebElement succeccActual=driver.findElement(By.id("ur-submit-message-node"));
//        String actualText=succeccActual.getText();
//        String expectedText="User successfully registered.";
//        Assertions.assertEquals(actualText,expectedText);
//
//    }
    @Test
    void scrapData() throws IOException, InterruptedException {
        driver.get("https://dsebd.org/latest_share_price_scroll_by_value.php");
        Thread.sleep(4000);
        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        System.out.println(" Total rows found: " + allRows.size());
        FileWriter writer = new FileWriter("./src/test/resources/dse_data.txt");

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                String text = cell.getText();
                System.out.println(text);
                writer.write(text);
            }
            writer.write("\n");
        }
        writer.close();
        System.out.println("Data saved to file.");
    }
    @AfterAll
    void tearDown() {
        driver.quit();
    }


}





















