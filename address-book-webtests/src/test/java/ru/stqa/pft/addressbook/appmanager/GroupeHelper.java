package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeHelper extends HelperBase {

  public GroupeHelper(WebDriver driver) {
        super(driver);
  }

  public void submitGroupeCreation() {
    click(By.name("submit"));
  }

  public void fillGroupeForm(GroupeData groupeData) {
    type(By.name("group_name"), groupeData.getName());
    type(By.name("group_header"), groupeData.getHeader());
    type(By.name("group_footer"), groupeData.getFooter());
  }


  public void initGoupeCreation() {
    click(By.name("new"));
  }
    public void returnToGroupePage() {
        click(By.name("группы"));
  }

  public void deleteSelectedGroupes() {
        click(By.name("delete"));
  }

  public void selectGroupe() {
        click(By.name("selected[]"));
  }

  public void goToGroupePage(String группы) {
        click(By.linkText("группы"));
  }

}
