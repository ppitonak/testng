package test.triangle;


/**
 * this test checks the CountCalls's static counter to see if we got the
 * expected number of calls
 */
public class CheckCount {
  
  /**
   * @testng.test parameters="expected-calls"
   */
  public void testCheckCountDeprecated(String expectedCalls) {
    try {

      //      System.out.println("\n\ntestCheckCount time = " + System.currentTimeMillis());
      int i = (Integer.valueOf(expectedCalls)).intValue();
      int numCalls = CountCalls.getNumCalls();
      assert (numCalls == i)  : "Count calls expected " + i + " but got " + numCalls;
    } catch (NumberFormatException nfe) {
      assert false : "CountCalls needs an expected-calls numeric parameter";
    }
  }

  /**
   * @testng.parameters value = "expected-calls"
   * @testng.test
   */
  public void testCheckCount(String expectedCalls) {
    try {

      //      System.out.println("\n\ntestCheckCount time = " + System.currentTimeMillis());
      int i = (Integer.valueOf(expectedCalls)).intValue();
      int numCalls = CountCalls.getNumCalls();
      assert (numCalls == i)  : "Count calls expected " + i + " but got " + numCalls;
    } catch (NumberFormatException nfe) {
      assert false : "CountCalls needs an expected-calls numeric parameter";
    }
  }  
}