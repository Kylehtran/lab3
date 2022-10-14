import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	//@Test 
	public void testReverseInPlace() {
    
    int[] input2 = { -1, 0, 4, 8, -3 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ -3, 8, 4, 0, -1 }, input2);

    
	}


  @Test
  public void testReversed() {
    int[] input1 = {10, 8, 9, 7 };
    assertArrayEquals(new int[]{7, 9, 8, 10 }, ArrayExamples.reversed(input1));
  }

  //@Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1.0, 1.0, 3.0,5.0,7.0,9.0};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
}
