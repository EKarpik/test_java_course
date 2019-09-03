package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;


public class GroupeDeletionTest extends TestBase {

  @Test
  public void testGroupeDeletion() {
    app.getNavigationHelper().goToGroupePage();
    app.getGroupeHelper().selectGroupe();
    app.getGroupeHelper().deleteSelectedGroupes();
    app.getGroupeHelper().returnToGroupePage();
  }

}

