package daily.coding.problem;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class DirectionTest {


  @Test
  public void directionValidTest() {
    Direction direction = new Direction();
    Set<String> rules = new HashSet<>();
    rules.add("A N B");
    rules.add("B NE C");
    rules.add("C N A");

    Assert.assertFalse(direction.isValid(rules));
  }

  @Test
  public void directionNotTest() {
    Direction direction = new Direction();
    Set<String> rules = new HashSet<>();
    rules.add("A NW B");
    rules.add("B N B");

    Assert.assertTrue(direction.isValid(rules));
  }
}
