import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Refer {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, Integer m) {
	  System.out.println("inside Test n="+n+" & s="+s+" & m="+m);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside After Method");
  }


  @DataProvider
  public Object[][] dp() {
	  System.out.println("inside data provider");
    return new Object[][] {
      new Object[] { 1, "a" ,2},
      new Object[] { 2, "b" ,3},
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("inside Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("inside After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("inside After suite");
  }

}
