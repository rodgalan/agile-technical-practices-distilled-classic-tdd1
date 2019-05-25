public class FizzBuzz {
  public String convert(int number) {
    if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
      return "FizzBuzz";
    }
    if (isDivisibleBy3(number)) {
      return "Fizz";
    }
    if (isDivisibleBy5(number)) {
      return "Buzz";
    }
    return String.valueOf(number);
  }

  private boolean isDivisibleBy5(int number) {
    return number % 5 == 0;
  }

  private boolean isDivisibleBy3(int number) {
    return number % 3 == 0;
  }
}
