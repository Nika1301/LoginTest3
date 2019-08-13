package Steps.com.ua;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.cucumber.java.Before;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class stepdefs {
    WebDriver driver;

    String s;


    @Before
    public void setUp() {
        System.setProperty("driver.chrome", "C:\\Program Files\\webdriver\\chromedriver");
        driver = new ChromeDriver();
    }

    @Given("Navigate to sharelane.com")
    public void navigateToSharelaneCom() {
        driver.get("http://sharelane.com/cgi-bin/main.py");
    }

    @When("You've been navigate to it, click SignUp")
    public void youVeBeenNavigateToItClickSignUp()  {
        WebElement signUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));

        signUp.click();
    }

    @And("Enter Zip code")
    public void enterZipCode() {
        WebElement zipcode = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));

        zipcode.sendKeys("123456");
    }

    @Then("click Continue")
    public void clickContinue() {
        WebElement btnContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        btnContinue.click();

    }

    @And("Enter First Name")
    public void enterFirstName() {
        WebElement firstname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstname.sendKeys("Nika");

    }

    @And("Enter Last Name")
    public void enterLastName() {
        WebElement lastname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastname.sendKeys("Popova");
    }

    @And("Enter Email")
    public void enterEmail() {
        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        email.sendKeys("butterfly130188@gmail.com");
    }

    @And("Enter Password")
    public void enterPassword() {
        WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        password.sendKeys("13011988");

    }

    @And("Enter Confirm Password")
    public void enterConfirmPassword() {
        WebElement confirmpassword = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confirmpassword.sendKeys("13011988");
    }

    @Then("click Register")
    public void clickRegister() {
        WebElement register = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        register.click();
    }

    @When("You've been registered, click underlined here")
    public void youVeBeenRegisteredClickUnderlinedHere() {
        WebElement regmessage = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));

        Assert.assertEquals("Account is created!", regmessage.getText());


        WebElement here = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a"));

        WebElement regmessage1 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b"));

        s = regmessage1.getText();

        here.click();
    }

    @Then("Enter logemail")
    public void enterLogemail() {
        WebElement logemail = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input"));
        logemail.sendKeys(s);


    }

    @And("Enter logpassword")
    public void enterLogpassword() {
        WebElement logpassword = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input"));
        logpassword.sendKeys("1111");

    }

    @And("Click LogIn")
    public void clickLogIn() {
        WebElement login = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input"));

        login.click();

    }


    @Then("You've been login in")
    public void youVeBeenLoginIn() {

    }
            }
