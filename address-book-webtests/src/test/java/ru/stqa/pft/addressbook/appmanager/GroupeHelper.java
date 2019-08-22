package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeHelper {
  private WebDriver driver;

  public GroupeHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void submitGroupeCreation(String submit) {
    driver.findElement(By.name(submit)).click();
  }

  public void fillGroupeForm(GroupeData groupeData) {
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
