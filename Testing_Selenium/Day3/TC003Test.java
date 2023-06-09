// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC003Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC003() {
    driver.get("https://demo.opencart.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    assertThat(driver.getTitle(), is("Your Store"));
    driver.findElement(By.linkText("Desktops")).click();
    driver.findElement(By.linkText("Mac (1)")).click();
    driver.findElement(By.linkText("Phones & PDAs (3)")).click();
    driver.findElement(By.cssSelector(".col:nth-child(1) .img-fluid")).click();
    vars.put("pageUrl", js.executeScript("return window.location.href"));
    System.out.println(vars.get("pageUrl").toString());
    driver.close();
  }
}
