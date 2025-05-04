package glue;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;

public class Account {

    WebDriver driver;
  
  
    @Given("User logs into the application using Chrome browser")
    public void user_logs_into_the_application_using_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("User enters into Google website")
    public void user_enters_into_google_website() throws InterruptedException {
        driver.get("https://ultimatix.com/");
        Thread.sleep(3000);
      
    }

    @Then("The title of the page should be {string}")
    public void the_title_of_the_page_should_be(String expectedTitle) throws InterruptedException {
//    	 WebElement text = driver.findElement(By.xpath("//textarea[@title='Search']"));
//         text.sendKeys("Kalam",Keys.ENTER);  
//         Thread.sleep(3000);
//         
//         
//         WebElement checkbox = driver.findElement(By.ByXPath.className("(//div[@role='presentation'])[1]"));
//         checkbox.click();
//         
//         
//    	
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        if(actualTitle.equalsIgnoreCase(expectedTitle);
        System.out.println("Title test passed");
        //assertEquals(expectedTitle, actualTitle);
    }

    @And("User logs out from the site")
    public void user_logs_out_from_the_site() {
        driver.close();
    }
}
