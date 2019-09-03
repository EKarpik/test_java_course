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
    click(By.name("Группы"));
  }
  public void createGroupe() {
    click(By.name("Новая группа"));
  }

  public void returnToGroupePage() {
    click(By.name("Группы"));
  }

  public void deleteSelectedGroupes() {
    click(By.name("delete"));
  }

  public void selectGroupe() {
    click(By.name("selected[]"));
  }

  public void initGroupeModification() {
    click(By.name("edit"));
  }

  public void submitGroupeModification() {
    click(By.name("update"));
  }
}
