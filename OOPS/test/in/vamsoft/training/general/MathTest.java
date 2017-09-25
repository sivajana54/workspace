package in.vamsoft.training.general;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
  private Math math = new Math();

  @BeforeClass
  public static void initClass() {
    System.out.println("MathTest.initClass()");
  }

  @Before
  public void initObject() {
    System.out.println("MathTest.initObject()");
    math = new Math();
  }

  @After
  public void destroyObject() {
    System.out.println("MathTest.destroyObject()");
    math = null;
  }

  @Test
  public void testCase1() {
    System.out.println("MathTest.testCase1()");
    double result = math.sum(100.98, 12.0);
    double expected = 112.98;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testCase2() {
    System.out.println("MathTest.testCase2()");
    double result = math.sum(0, 0);
    double expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testCase3() {
    System.out.println("MathTest.testCase3()");
    double result = math.sum(-100.98, 100.98);
    double expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testCase4() {
    System.out.println("MathTest.testCase3()");
    double result = math.sum(-100.98, -100.98);
    double expected = -201.96;
    Assert.assertEquals(expected, result, 0);
  }
}
