package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void goToGroupePage(String группы) {
    click(By.linkText(группы));
  }
}
