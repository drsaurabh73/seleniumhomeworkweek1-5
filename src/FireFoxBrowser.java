import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver" , "driver/geckodriver.exe");
        WebDriver driver =  new FirefoxDriver();

        //open the URL
        driver.get(baseUrl);
        //Open the Title page
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        // Print the current URL
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current URL = " + currenturl);
        // Print the page source
        String pagesource = driver.getPageSource();
        System.out.println("The source page is " + pagesource);
        //Enter the email to the email field
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("pramukhswami@gmail.com");
        //enter the password in password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("1234@##");

        driver.close();


    }
}
