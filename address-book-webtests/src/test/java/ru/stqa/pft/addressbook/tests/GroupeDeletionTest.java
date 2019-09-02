package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;


public class GroupeDeletionTest extends TestBase {

  @Test
  public void testGroupeDeletion() {
    app.getGroupeHelper().returnToGroupePage();
    app.getGroupeHelper().selectGroupe();
    app.getGroupeHelper().selectGroupe();
    app.getGroupeHelper().returnToGroupePage();
  }

}

