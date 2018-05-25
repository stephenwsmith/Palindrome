package stephen.edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import static edu.cnm.deepdive.Palindrome.isPalindrome;

import org.junit.jupiter.api.Test;

class PalindromeTest {
private static final String[] PALINDROMES = {
        "Alibabila",
        "ABba",
        "Notlobbolton"
  };

  @Test
  void testInterestingPalindrome() {
    for (String test:PALINDROMES) {
      assertTrue(Palindrome.isPalindrome(test));
      }
  assertFalse(Palindrome.isPalindrome("ab"));
  assertFalse(Palindrome.isPalindrome("abbac"));
  assertTrue (Palindrome.isPalindrome("Notlobbolton"));
      assertFalse(Palindrome.isPalindrome("AbbB"));
    assertTrue(Palindrome.isPalindrome("ABba"));
  }

  private static final String[] NON_PALINDROMES = {
      "Sonar",
    "Abacab",
    "abbac",
    "ab",
    "AbbB",
  };

@Test
  void testDegeneratePalindromes(){
  assertTrue(Palindrome.isPalindrome(""));
  assertTrue(Palindrome.isPalindrome("A"));
}

  public static void main(String[] args) {

  }
}