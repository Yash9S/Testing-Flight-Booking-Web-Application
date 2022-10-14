
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class FlightBookingWebsite {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //System.out.println("we will go to yatra website");
        driver.get("https://www.Yatra.com");
        //System.out.println("we will maximize the screen");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);

        //System.out.println("we will mov the curser to the starting city which will be displayed on thr screen that is NewDelhi");
        WebElement start=driver.findElement(By.cssSelector("#BE_flight_origin_city"));
        start.click();

        //System.out.println("we will click on the starting city which will be displayed on thr screen that is NewDelhi");
        start.sendKeys("NewDelhi");
        driver.findElement(By.cssSelector("BE_flight_origin_city")).click();

        WebElement finall=driver.findElement(By.cssSelector("#BE_flight_arrival_city"));
        finall.click();

        finall.sendKeys("Mumbai");
        driver.findElement(By.cssSelector("#autoSuggest-list > li:nth-child(1)")).click();

        //System.out.println("Then we have to change the starting city from NewDelhi to Bangalore and finall city from Mumbai to Hyderabad");

    }  
}
