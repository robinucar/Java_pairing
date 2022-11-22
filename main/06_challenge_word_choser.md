# Building a word-guessing game - Part II

So far the `Game` class is doing two things:
 * It picks a random word from the `DICTIONARY`
 * It displays the word to guess with hidden letters

It looks like there is an opportunity for us to tidy the codebase and achieve better separation of concerns.

## Objectives 
 * Extract functionality to a new class.
 * Use dependency injection.
 * Mock a class and stub a method result in a unit test.

## Exercise - extracting the random word

<!-- OMITTED -->

To complete this exercise, you'll need to:
  * Create a new class.
  * Use dependency injection to inject a class instance into the `Game` constructor.

### Questions

1. Write the tests for a new `WordChoser` class that will contain the `DICTIONARY` array attribute as well as the `getRandomWordFromDictionary()` method. Those things will then be moved from `Game` to this new class.
2. Make sure the `Game` class calls the method `getRandomWordFromDictionary` of a `WordChoser` instance to get a random word.

## Installing mockito

<!-- OMITTED -->

We'll use the mockito library in order to mock classes and isolate our unit tests. Let's add it to our `build.gradle` file:

```gradle
dependencies {
    // Use JUnit test framework.
    testImplementation 'junit:junit:4.13.2'
    testImplementation "org.mockito:mockito-core:3.+" // <-- add this line

    // ...
}
```

We can now run `gradle` in the project directory to make sure the new dependencies are installed.

## Exercise - mocking `WordChoser`

To complete this exercise, you'll need to:
  * Use mockito to [create a mock of a class](https://site.mockito.org/#:~:text=now%20you%20can%20verify%20interactions).
  * [Stub the return value for a mock class's method](https://site.mockito.org/#:~:text=and%20stub%20method%20calls).

### Questions

1. Modify your `Game` tests so they mock the `WordChoser` class (to get a predictable word) and inject this mock into `Game`. If something seems wrong, make sure you've mocked the `getRandomWordFromDictionary` method *before* it is called to get the word.

Note: You'll know if you've mocked `WordChoser` correctly if you can change all the words in the `WordChoser` dictionary to different ones, but the `GameTest` tests still pass.

<details>
<summary>Reveal</summary>

```java
// GameTest.java

@Test
public void testGetsWordToGuessWithRandomWord() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedChoser);

    assertEquals(game.getWordToGuess(), "D________");
}
```

```java
// WordChoser.java

package game;

import java.util.Random;

public class WordChoser {
  private static final String[] DICTIONARY = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[rand.nextInt(DICTIONARY.length)];
  }
}

```

```java
// Game.java

public Game(WordChoser choser) {
    this.word = choser.getRandomWordFromDictionary();
}
```

</details>

Attempt the exercises by yourself before watching the following video:
[Example Solution](https://www.youtube.com/watch?v=XtLXmVImp2w)

## Exercise: debugging

<!-- OMITTED -->

Someone from your cohort worked on the previous exercise to implement the class `WordChoser` and mock it in the `GameTest` test class. However, their test does not work — it seems the word is always chosen at random, even when testing. Here's the test they wrote, and the `Game` constructor:

```java
// GameTest.java

@Test
public void testGetsWordToGuessWithRandomWord() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game();

    assertEquals(game.getWordToGuess(), "D________");
}
```

```java
// Game.java

public Game() {
    WordChosen choser = new WordChosen();
    this.word = choser.getRandomWordFromDictionary();
}
```

1. Can you see what the problem is?
2. How would you fix it to make sure the word returned by `getRandomWordFromDictionary` is *always* "DEVELOPER" when running the tests?

[Next Challenge](07_challenge_player_guess.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/06_challenge_word_choser.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/06_challenge_word_choser.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/06_challenge_word_choser.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/06_challenge_word_choser.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/06_challenge_word_choser.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
