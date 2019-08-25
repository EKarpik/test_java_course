package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeHelper {
  private WebDriver driver;

  public GroupeHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void submitGroupeCreation(By submit) {
    driver.findElement(By.name(submit)).click();
  }

  public void fillGroupeForm(GroupeData groupeData) {
    type(By.name ("group_name"), groupeData.getName());
    type(By.name("group_header"), groupeData.getHeader());
    type(By.name("group_footer"), groupeData.getFooter());
  }


  private void type(By locator, String text) {
    submitGroupeCreation(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void initGoupeCreation(String s) {
    submitGroupeCreation(s);
  }

  public void returnToGroupePage(String группы) {
    driver.findElement(By.linkText(группы)).click();
}

  public void deleteSelectedGroupes(String delete) {
    driver.findElement(By.name(delete)).click();
  }

  public void selectGroupe(String s) {
    deleteSelectedGroupes(s);
  }

  public void goToGroupePage(String группы) {
    driver.findElement(By.linkText(группы)).click();
  }

}
