package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;


public class GroupeDeletionTest extends TestBase {

  @Test
  public void testGroupeDeletion() {
    app.getGroupeHelper().returnToGroupePage("Группы");
    app.getGroupeHelper().selectGroupe("selected[]");
    app.getGroupeHelper().selectGroupe("delete");
    app.getGroupeHelper().returnToGroupePage("group page");
  }

}

