import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaiduSearch {

    WebDriver driver;

    @Given("^I open baidu search page$")
    public void iOpenBaiduSearchPage() {

        System.setProperty("webdriver.chrome.driver", "E:\\SoftwareInstall\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");
    }

    @When("^I input \"([^\"]*)\" in search box$")
    public void iInputInSearchBox(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("kw")).sendKeys(arg0);
    }

    @And("^I click search button$")
    public void iClickSearchButton() {
        driver.findElement(By.id("su")).click();
    }

    @Then("^show search result should include \"([^\"]*)\"$")
    public void showSearchResultShouldInclude(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        String title=driver.getTitle();
        driver.quit();
        System.out.println(title);
        boolean result =title.contains(arg0);
        System.out.println(result);
        assert result;
    }
}
