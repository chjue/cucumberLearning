package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    WebDriver driver;


    @Given("^I navigated to lemfix site$")
    public void i_navigated_to_lemfix_site() throws Throwable {
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//        driver.get("http://fm.lemfix.com");
        System.out.println("hello 1");
    }

    @When("^I input \"([^\"]*)\" and \"([^\"]*)\" to login$")
    public void i_input_vincent_and_password_to_login(String us_name, String us_psswd) throws Throwable {
//        WebElement loginTop;
//        WebElement username;
//        WebElement password;
//        WebElement loginBTN;
//
//        loginTop = driver.findElement(By.xpath("html/body/div[1]/div/div[3]/ul/li[2]/a"));
//        loginTop.click();
//
//        username = driver.findElement(By.id("user_login"));
//        password = driver.findElement(By.id("user_password"));
//        loginBTN = driver.findElement(By.xpath(".//*[@id='new_user']/div[4]/input"));
//
//        username.sendKeys(us_name);
//        password.sendKeys(us_psswd);
//        loginBTN.click();
//
//        Thread.sleep(1000);
        System.out.println("hello "+ us_name);
        System.out.println("hello "+us_psswd);
    }

    @Then("^I verify login \"([^\"]*)\"")
    public void i_verify_login_result(String rs) throws Throwable {
//        String title = driver.getTitle();
//        String result;
//        if(title.contains("登录")){
//            result = "fail";
//        }else if(title.equals("Lemfix")){
//            result = "success";
//        }else{
//            result = null;
//        }
//        System.out.println(title);
//        System.out.println("result=" + result);
//        Assert.assertTrue(result.equals(rs));
//
//        Thread.sleep(1000);
//        driver.quit();
        System.out.println("hello "+rs);
    }
}