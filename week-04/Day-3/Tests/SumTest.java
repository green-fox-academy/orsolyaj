import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum;

  @Before
  public void setup() {
    sum = new Sum();

  }

  @Test
  public void ShouldDosummingWithFullList() {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 2));
    assertEquals(10, sum.summing(list));
  }

  @Test
  public void ShouldDoSummingWithList() {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2));
    assertEquals(2, sum.summing(list));
  }

  @Test
  public void ShouldDoSummingWithEmptyList() {
    ArrayList<Integer> list = new ArrayList<>();
    assertEquals(0, sum.summing(list));
  }

  @Test (expected = NullPointerException.class)
  public void ShouldDoSummingWithNullList() {
    sum.summing(null);
  }

}