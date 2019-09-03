package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeCreationTests extends TestBase {


  @Test
  public void testGoupeCreation(){

    app.getNavigationHelper().goToGroupePage();
    app.getGroupeHelper().initGoupeCreation();
    app.getGroupeHelper().createGroupe();
    app.getGroupeHelper().fillGroupeForm(new GroupeData("test1", "test2", "test3"));
    app.getGroupeHelper().submitGroupeCreation();
    app.getGroupeHelper().returnToGroupePage();
  }

}
