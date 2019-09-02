package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver driver;

  private NavigationHelper navigationHelper;
  private GroupeHelper groupeHelper;
  private SessionHelper sessionHelper;

  public void init() {
    System.setProperty("webdriver.chrome.driver", "C:\\addressBook\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
