package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeHelper {
  private WebDriver driver;

  public GroupeHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void submitGroupeCreation() {
    click(By.name("submit"));
  }

  public void fillGroupeForm(GroupeData groupeData) {
    type(By.name ("group_name"), groupeData.getName());
    type(By.name("group_header"), groupeData.getHeader());
    type(By.name("group_footer"), groupeData.getFooter());
  }


  private void type(By locator, String text) {
    click(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void initGoupeCreation() {
    submitGroupeCreation(s);
  }

  public void returnToGroupePage() {
    click(By.name("группы"));
  }

  public void deleteSelectedGroupes() {
    click(By.name("delete"));
  }

  public void selectGroupe(String s) {
    deleteSelectedGroupes(s);
  }

  public void goToGroupePage(String группы) {
    click(By.linkText("группы"));
  }

}
