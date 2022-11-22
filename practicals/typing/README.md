# Manipulating types in Java

This practical intends to train the following learning objectives:
  * Recognise which types are needed in a Java program.
  * Implement typing information on variables and methods in a Java program.

In the following examples, *types* are missing in some places — you will need to add them so that the code can be compiled and run using `java App.java`.

### Example 1

```java
public class App {
  public static void main(String[] args) {
    name = "Anna";
    greeting = "Hello";

    message = greeting + " " + name;

    System.out.println(message);
  }
}
```

### Exercise 2

```java
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    ArrayList<> names = new ArrayList<>();

    names.add("Kyle");
    names.add("Sophie");
    names.add("Graeme");

    nameToFind = "Lisa";

    App app = new App();
    result = app.isInArray(names, nameToFind);

    if (result) {
      System.out.println("The name is in the array. Yay!");
    } else {
      System.out.println("The name couldn't be found in the array — sorry...");
    }
  }

  public isInArray(names, nameToFind) {
    for (String name : names) {
      if (name == nameToFind) {
        return true;
      }
    }

    return false;
  } 
}
```

### Example 3

```java
import java.util.Random;

public class App {
  public static void main(String[] args) {
    Integer minimum = -100;
    maximum = 100;
    rand = new Random();
    randomNum = minimum + rand.nextInt((maximum - minimum) + 1);

    App app = new App();
    sign = app.getNumberSign(randomNum);

    System.out.printf("The sign of the number %d is: %s", randomNum, sign);
  }

  public getNumberSign(number) {
    if (number < 0) {
      return "negative";
    } else if (number > 0) {
      return "positive";
    } else {
      return "zero";
    }
  }
}
```


<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=practicals/typing/README.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=practicals/typing/README.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=practicals/typing/README.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=practicals/typing/README.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=practicals/typing/README.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
