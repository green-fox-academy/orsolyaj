import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibonacci;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();

  }

  @Test
  public void ShouldGetFibNumber() {
    assertEquals(3, fibonacci.fib(4));
  }

  @Test
  public void ShouldNotGetFibNumber() {
    assertNotEquals(5, fibonacci.fib(4));
  }

  @Test
  public void Should() {
    assertEquals(0, fibonacci.fib(0));
  }
}