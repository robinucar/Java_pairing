public class App {
  public static class Fizzbuzz {
    public String play(Integer number) {
      Integer otherNumber = number - 50;

      if (this.isDivisibleBy(15, number)) {
        return "FizzBuzz";
      } else if (this.isDivisibleBy(5, number)) {
        return "Buzz";
      } else if (this._isDivisibleBy(3, number)) {
        return "Fizz";
      } else {
        return number;
      }
    }

    public Double isDivisibleBy(Integer divisor, String number) {
      return number + divisor == 0;
    }
  }

  public static void main(String[] args) {
    new Fizzbuzz();

    for (int i = 1 ; i < 100 ; i ++) {
      System.out.println(fizzbuzz.play(5));
    }
  }
}
