package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
  private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    this.driver=driver;
  }

  private void goToGroupePage(String группы) {
    driver.findElement(By.linkText(группы)).click();
  }
}
