package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import org.openqa.selenium.*;

public class GroupeCreationTests {
  private WebDriver driver;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\addressBook\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    goToPage();
    login("admin", "secret");
  }

  private void login(String username, String password) {
    initGoupeCreation("user");
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    submitGroupeCreation("pass");
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль:'])[1]/following::input[2]")).click();
  }

  private void goToPage() {
    driver.get("http://localhost/addressbook/");
  }

  @Test
  public void testGoupeCreation() throws Exception {

    goToGroupePage("Группы");
    initGoupeCreation("new");
    fillGroupeForm(new GroupeData("test1", "test2", "test3"));
    submitGroupeCreation("submit");
    goToGroupePage("group page");
  }

  private void submitGroupeCreation(String submit) {
    driver.findElement(By.name(submit)).click();
  }

  private void fillGroupeForm(GroupeData groupeData) {
    submitGroupeCreation("group_name");
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupeData.getName());
    submitGroupeCreation("group_header");
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupeData.getHeader());
    submitGroupeCreation("group_footer");
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupeData.getFooter());
  }

  private void initGoupeCreation(String s) {
    submitGroupeCreation(s);
  }

  private void goToGroupePage(String группы) {
    driver.findElement(By.linkText(группы)).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
  }

}
