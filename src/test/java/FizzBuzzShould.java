import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  /**
   * TODO List:
   * - should return a string number when number is not divisible by 3 any 5
   * - should return Fizz when number is divisible by 3
   * - should return Buzz when number is divisible by 5
   * - should return FizzBuzz when number is divisible by 3 and 5
   */

  @ValueSource(ints = {1, 2, 4})
  @ParameterizedTest
  void return_number_if_its_not_divisible_by_3_or_5(int number) {
    assertEquals(String.valueOf(number), fizzBuzz.convert(number));
  }

  @ValueSource(ints = {3, 6, 9})
  @ParameterizedTest
  void return_fizz_when_number_is_divisible_by_3(int number) {
    assertEquals("Fizz", fizzBuzz.convert(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 20})
  void return_buzz_when_number_is_divisible_by_5(int number) {
    assertEquals("Buzz", fizzBuzz.convert(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30, 45})
  void return_fizzbuzz_when_number_is_divisible_by_3_and_5(int number) {
    Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(number));
  }
}
