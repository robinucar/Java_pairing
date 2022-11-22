# Your first Java program

Java is a very popular language in the software world. It can be used to build a lot of different kinds of programs, including desktop, mobile and web applications. If you've previously learned a language like Ruby or Javascript, Java is going to feel really different in a number of ways - but you won't encounter anything that you cannot learn!

First things first, in this section we're going to build our first Java program. This will be a simple program that will print `Hello, Makers!` on the terminal. By writing and then executing this program, we'll learn a few things about Java.

<!-- OMITTED -->

## Objectives

 * Install Java.
 * Write a Java class.
 * Compile a Java class.
 * Run a Java class.
 * Understand the difference between compiling and running.
 * Understand that errors can happen at compile time, others at runtime.

## Installing Java

[Go there to install the JDK](https://docs.oracle.com/en/java/javase/15/install/installation-jdk-macos.html)

Once this is done, you should be able to check the installed Java version by typing `java -help` in the terminal. Example:

```
java -help 

Usage: java [options] <mainclass> [args...]
           (to execute a class)
   or  java [options] -jar <jarfile> [args...]
           (to execute a jar file)
  (...)
```

## Hello, Java

<!-- OMITTED -->

Write the following code into a file named `Hello.java`. Maybe you'll see some similarities with the syntax of programming languages you've previously learned, and notice some other things that are different. Don't worry too much about the bits of code you don't fully understand right now, as we'll get there.

```java
class Hello {
  public static void main(String[] args) {
    System.out.println("Hello, Makers!");
  }
}
```

We're now going to run the following command:
```
javac Hello.java
```
 
Use `ls` to list the files in this directory. What new file do you notice?

Let's now run this other command:

```
java Hello
```

If everything worked, you should see the message "Hello, Makers!" printed to the terminal. Congratulations, you just wrote your first Java program!

A few important things to take from it:
  * In Java, all the code is written within classes. Our program needs to have at least one class — the main class, here called `Hello`.
  * This class name doesn't matter, but it needs to implement a `main` method similar to the one above. This is the "entrypoint" of the code when the program starts.

## Compilation and runtime

You've noticed we had to go through two different steps to run this program, rather than just one, like you would do with a Ruby program, for example. But why is that? Do Java engineers just like having twice as much work to do, compared to Ruby developers?

Probably not. The truth is that, Java is different from a language like Ruby (or Javascript) in the way programs are created and run. In a language like Ruby, the code is read and interpreted by the Ruby interpreter (the `ruby` program) and executed at the same time.

In Java, however, a Java file needs first to be *compiled* to an executable program. You've probably noticed the presence of a file called `Hello.class` after calling `javac` earlier. This new file is the compiled version of our Java source file.

But this program is just sitting there, it's not executed yet! Which is why we need to call `java` to run it.

## Exercise: a second program

Let's have a look at a slightly more complex Java program:
```java
class Calculator {
  public static void main(String[] args) {
    Integer result = 2 + 2;
    System.out.printf("The result is %d \n", result);
  }
}
```

1. *Compile* this Java class using `javac`.
2. *Run* the Java class using `java`.

If you've done the above correctly, you should see the following printed in the terminal:
```
The result is 4
```

Note: instead of first compiling with `javac`, and then running the program with `java`, we can do both in one step and write:

```bash
$ java Calculator.java
The result is 4
```

## Exercise: displaying the time

<!-- OMITTED -->

To complete this exercise, you'll have to:
  * Define a class and a `main` method.
  * Use `System.out.printf`.
  * Use the `DateTimeFormatter` and `Date` classes.

### Questions

1. Write a class `Clock` that implements a `main` method, similar to the previous exercise.
2. Implement this method so it prints the current time in the terminal, like this:

```bash
$ java Clock.java
The current time is 15:05
```

Attempt the exercise by yourself before watching the following video:
[Example Solution](https://www.youtube.com/watch?v=hBlWaK6id0Y)


[Next Challenge](02_compile_error.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/01_first_java_program.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/01_first_java_program.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/01_first_java_program.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/01_first_java_program.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/01_first_java_program.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
