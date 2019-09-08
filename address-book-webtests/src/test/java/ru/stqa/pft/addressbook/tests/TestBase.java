package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import sun.plugin2.util.BrowserType;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

  @BeforeMethod(alwaysRun = true)
  public void setUp() {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() {
    app.stop();
  }

}
