import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  Apple apple1;

  @Before
  public void setup() {
    apple1 = new Apple();
  }

  @Test
  public void ShouldGetApple() {
    assertEquals("apple", apple1.getApple());
  }

}