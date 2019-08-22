package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeCreationTests extends TestBase {


  @Test
  public void testGoupeCreation() throws Exception {

    app.getGroupeHelper().goToGroupePage("Группы");
    app.getGroupeHelper().initGoupeCreation("new");
    app.getGroupeHelper().fillGroupeForm(new GroupeData("test1", "test2", "test3"));
    app.getGroupeHelper().initGoupeCreation("submit");
    app.getGroupeHelper().returnToGroupePage("Группы");
  }

}
