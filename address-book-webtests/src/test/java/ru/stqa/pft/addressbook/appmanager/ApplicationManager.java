package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver driver;

  private NavigationHelper navigationHelper;
  private GroupeHelper groupeHelper;
  private SessionHelper sessionHelper;

public ApplicationManager (String browser){
  this.browser = browser;
}
  public void init() {
    String browser = BrowserType.FIREFOX;
    if (browser == BrowserType.FIREFOX) {
        driver = new FirefoxDriver();
    }
      else if (browser == BrowserType.CHROME) {
        driver = new ChromeDriver();
      }
      else if (browser == BrowserType.IE) {
      driver = new InternetExplorerDriver();
    }


driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("C:\\addressBook\\Drivers\\chromedriver.exe");
    goToPage();
    groupeHelper = new GroupeHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");
  }

  private void goToPage() {
    driver.get("http://localhost/addressbook/");
  }

  public void stop() {
    driver.quit();
  }

  public GroupeHelper getGroupeHelper() {
    return groupeHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
