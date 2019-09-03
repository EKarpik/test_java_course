package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeModificationTests  extends TestBase {
@Test
  public void testGroupeModofication(){
  app.getNavigationHelper().goToGroupePage();
  app.getGroupeHelper().selectGroupe();
  app.getGroupeHelper().initGroupeModification();
  app.getGroupeHelper().fillGroupeForm(new GroupeData("testttt", "test2", "test3"));
  app.getGroupeHelper().submitGroupeModification();

}
}
