# Typing in Java

### Learning goals
 * Explain what types are and how they are used, in Java.
 * Apply that knowledge to use the right type for variables and method signatures.

<!-- OMITTED -->

### Intro

 * How is Java different from Ruby or JS, with regards to typing? Can you give examples?
 * How does Java use types? Where specifically in the code do you need to be careful with typing?

## Writing code

For each question, you can use the following `App` class as a scaffold. Remember that you can directly execute this class from the terminal with the command `java App.java` to check if it works.

```java
class App {
    public static void main(String[] args) {
      // write your code here
    }
}
```

You might want to have a look at [Java String Format Specifiers](https://www.javatpoint.com/java-string-format) to know which one to use with `printf`.

1. Declare a variable called `greeting` to contain the string "Hello" and one variable called `name` to contain the name of someone from your group. Concatenate those two variables into a variable `result` and use `System.out.printf` to print the string "Hello <name>"

2. Declare a new variable `age` to contain someone's age. Use the three variables `greeting`, `name` and `age` to print a message such as "Hello <name>, you are <age> years old". 

## Missing types

In the following examples, typing information has been completely messed up, so it's all broken. Can you fix it, so the examples work when you run them?

*Hint: the only thing you should change to make the code work is the typing for variables, method arguments and method return values — assume that the general logic of the code is right, and that there are no other bugs.*

### Temperature converter

When run with `java TemperatureConverter.java`, it should print the following output:

```
60.000000 in fahrenheit = 15.555556 in celcius
27.000000 in celcius = 80.600000 in fahrenheit
```

```java
// TemperatureConverter.java

public class TemperatureConverter {
    public static Boolean main(String[] args) {
        String converter = new TemperatureConverter();

        Int fahrenheit = 60.0;
        System.out.printf("%f in fahrenheit = %f in celcius\n", fahrenheit, converter.toCelsius(fahrenheit));

        String celcius = 27.0;
        System.out.printf("%f in celcius = %f in fahrenheit\n", celcius, converter.toFahrenheit(celcius));
    }

    public void toCelsius(fahrenheit) {
        Double factor = (5.0 / 9.0);
        return (fahrenheit - 32) * factor;
    }

    public void toFahrenheit(celcius) {
        Boolean factor = (9.0 / 5.0);
        return celcius * factor + 32;
    }
}
```

### Students directory

When run with `java StudentDirectory.java`, it should print the following output:

```
List of students:
 * Alex - January 2020
 * Maria - January 2020
 * Lisa - January 2020
```

In this exercise, you might need to research:
  * how [the `ArrayList` generic type is working](https://www.w3schools.com/java/java_arraylist.asp).
  * how an `ArrayList` value [can be iterated over using the `Enumeration` class](https://www.java2novice.com/java-collections-and-util/collections/list-enumeration/).
  * how `String.format` is working, as well as format identifiers used by that method (`%d`, `%s`, etc).

```java
// StudentDirectory.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class StudentDirectory {

    // This is a "nested" static class made for convenience here - 
    // you can assume the following line is right!
    static class Student {
        // Properties
        private String name;
        private Int cohortName;

        // Constructor
        public Student(String name, String cohortName) {
            this.name = name;
            this.cohortName = cohortName;
        }

        // Getters
        public String getName() {
            return this.name;
        }

        public Int getCohortName() {
            return this.cohortName;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add(new Student("Alex", "January 2020"));
        studentList.add(new Student("Maria", "January 2020"));
        studentList.add(new Student("Lisa", "January 2020"));

        Enumeration<Student> enumeration = Collections.enumeration(studentList);

        System.out.println("List of students:");
        while (enumeration.hasMoreElements()) {
            String currentStudent = enumeration.nextElement();
            Boolean line = String.format(" * %d - %d", currentStudent.name, currentStudent.cohortName);
            System.out.println(line);
        }
    }
}

```

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=workshops/typing/README.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=workshops/typing/README.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=workshops/typing/README.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=workshops/typing/README.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=workshops/typing/README.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
