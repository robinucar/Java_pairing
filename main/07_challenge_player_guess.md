# Building a word-guessing game - Part III

We'll now have a look at how to implement the next part of the game specifications — guessing the letters of the secret word.

## Objectives 
 * Understanding the difference between `String` and `Character` and how they're both defined.
 * Checking if a character is in a string.
 * Use conditionals.
 * Use `ArrayList` to store a dynamic list of values.
 * Define attributes, read and update their values.

## About Strings and Characters

<!-- OMITTED -->

Remember that a string is a series of single characters: "developer" for example, is a string, made of individual characters "d", "e", "v", etc.

In Java, we have types to represent both of them: `String` and `Character`. As you guessed, when dealing with only a single character (digit or letter, for example), we can use the `Character` type. Be mindful that, unlike other more permissive languages, Java will infer the type of value depending on the quotes used to write literal values: `"developer"` will be a `String` and so too will `"d"` (they both use double quotes). To indicate a character, you should use single quotes — `'d'` or `'e'` will be correctly interpreted as `Character` values. 

```java
String name = "Tomas";
Character firstLetter = 'T';

String city = 'London'; // won't work — single quotes are for characters
```

## Exercise: the `guessLetter` method

<!-- OMITTED -->

To complete this exercise, you'll need to:
 * Write some tests for the `guessLetter` method.
 * Use the `Character` class type.
 * Check if a character is present within a string.
 * Use the [`ArrayList` class](https://www.w3schools.com/java/java_arraylist.asp) — it can store a "dynamic" array of values (we can add items to it).

### Questions

1. Test-drive a new method `guessLetter` which will take one argument – the letter to guess. This new method will need to check that the given letter is *at least once* inside the word to guess.
    * If it is *not* in the word, it will need to decrement the number of remaining attempts.
    * If it is in the word, it should store the fact that this letter has been already guessed — how will you store the letters that have already been guessed?
3. Make sure the `guessLetter` method returns a value that clearly indicates whether, or not, the guess was correct.  What type will you use here?
4. Make sure your test verifies the return value of `guessLetter`.
5. If the player tries to guess a letter, it can be either right or wrong. How many different paths can your code then follow? How many test cases will you need to make sure you cover those different paths?

<details>
<summary>Reveal suggested solution</summary>

```java
@Test public void testGuessLetterRightAndDisplayGuessedLetter() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChoser);

    assertEquals(game.guessLetter('K'), true);
}

@Test public void testGuessLetterWrong() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChoser);

    assertEquals(game.guessLetter('O'), false);
}
```

```java
package game;

import java.util.ArrayList;

public class Game {
    private String word;
    private ArrayList<Character> guessedLetters = new ArrayList<Character>();
    private Integer remainingAttempts = 10;

    // ...

    public Boolean guessLetter(Character letter) {
        if (this.word.indexOf(letter) != -1) {
            guessedLetters.add(letter);
            return true;
        } else {
            remainingAttempts--;
            return false;
        }
    }

    // ...
}

```

</details>

## Exercise: debugging

<!-- OMITTED -->

Someone from your cohort wrote some similar code, however their test does not compile — can you see why? You can replace your own method `guessLetter` with theirs, to make sure you found all the issues with it.

```java
public Boolean guessLetter(String letter) {
    if (this.word.indexOf(letter) == -1) {
        remainingAttempts--;
        return 0;
    } else {
        guessedLetters.add(letter);
        return 1;
    }
}
```

## Generic types

In Java, the class `ArrayList` is what we call a *generic type* (or simply a "generic").

Let's take a moment to think about what an array is — an Array is a list of elements. What is the type of each element? Remember that Java cares a lot about the types we need to store and manipulate in our programs. A list of numbers is not going to have the same size in memory than a list of strings, data objects, or even a list of lists!

All array lists have the same functionality — we can add, remove, list items in the array, which is why we call such a type "generic". But when actually using it, Java needs to know which *type* this list will contain. Which is why the *actual type* of an array list will be something like `ArrayList<String>` (for a list of `String`) or `ArrayList<Character>` (for a list of `Character`). The type inside the two chevrons `<>` is called the *type parameter*.

The type parameter can be a native Java class (i.e type), but also a custom class. Therefore, assuming we have a class `Student`, it's possible to declare an array of students using `ArrayList<Student>`

## Exercise - shopping list

<!-- OMITTED -->

This exercise is a little break from our game. You can work on it in a different project directory. To complete it, you'll have to:
* Write JUnit tests.
* Declare a class and its methods.
* Use attributes.
* Use the generic type `ArrayList` with different type parameters.

### Questions

1. Test-drive a `ShoppingList` class such that:
    * the instance is initialised with an empty list of item names (`String`)
    * it has an `addItem` method which adds a string to a list of items.
    * it has a `getItems` method which returns the list of items.
2. Create a new `ShoppingItem` class that holds two properties: a name and a price (`Double`). Its constructor can be used to pass the two arguments: `new ShoppingItem("Salad", 6.90)`.
3. Modify the tests and `ShoppingList` class so it holds an array of `ShoppingItem` instances rather than just `String`s. It should therefore be possible to use the class like this:

```java
ShoppingList list = new ShoppingList();

list.addItem(new ShoppingItem("HP sauce", 4.99));
list.addItem(new ShoppingItem("Ketchup", 3.99));

list.getItems(); // should return an ArrayList<ShoppingItem> of size 2.
```

Attempt the exercises by yourself before watching the following video:
[Example Solution](https://www.youtube.com/watch?v=_x_Mp5iUYu8)

## Exercise - debugging

<!-- OMITTED -->

Your pair did work on the following exercise, however they get an error when trying to run this code:

```java
ShoppingList list = new ShoppingList();

list.addItem(new ShoppingItem('HP sauce', 4.99));
```

[Next Challenge](08_challenge_guessed_letters.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/07_challenge_player_guess.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/07_challenge_player_guess.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/07_challenge_player_guess.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/07_challenge_player_guess.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/07_challenge_player_guess.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
