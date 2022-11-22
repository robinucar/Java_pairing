# Building a word-guessing game - Part IV

## Objectives 

* Use the `main` method to create a CLI program.
* Use a loop.
* Read user input.
* Instantiate classes and use them from the `main` method.

## Exercise: showing guessed letters

1. Duplicate the test you've written for `getWordToGuess` earlier. This time, we'll extend this test so it calls `guessLetter` to guess one letter that we know is in the word. For example, if the word is "DEVELOPER", we could call `guessLetter("E")`.
2. Assuming the word to guess is "DEVELOPER" — if we call `guessLetter("E")` and this method has been correctly implemented, what string should `getWordToGuess()` return?
3. Make sure this new test verifies the new value from `getWordToGuess()` is correct, after guessing correctly one letter.

<details>
<summary>Reveal suggested solution</summary>

```java
// GameTest.java

@Test public void testGuessLetterRightAndDisplayGuessedLetter() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChoser);

    assertEquals(game.guessLetter('K'), true);
    assertEquals(game.getWordToGuess(), "M_K___");
}

@Test public void testGuessLetterWrong() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChoser);

    assertEquals(game.guessLetter('O'), false);
    assertEquals(game.getWordToGuess(), "M_____");
}
```

```java
// Game.java

import java.util.ArrayList;

public class Game {
    // ...

    public String getWordToGuess() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (i == 0) {
                // first letter is always shown
                builder.append(currentLetter);
            } else {
                // show letter only if it was already guessed
                if (guessedLetters.indexOf(currentLetter) != -1) {
                    builder.append(currentLetter);
                } else {
                    builder.append("_");
                }
            }
        }

        return builder.toString();
    }
}
```

</details>

## Exercise: using the CLI

To complete this exercise, you'll have to:
 * Implement a `main` method for the `App` class.
 * Use the `Scanner` class to read a letter entered in the terminal.
 * Use `System.out` methods to print to the terminal.
 * Use a loop.

We should end up with a very simple version of the game, that we can interact with using the terminal, as shown below:

```
Welcome! Today the word to guess is:
L_____
Enter one letter to guess (10 attempts remaining):
N
Right!
L_N__N
Enter one letter to guess (10 attempts remaining):
K
Wrong...
L_N__N
Enter one letter to guess (9 attempts remaining):
O
Right!
LON_ON
Enter one letter to guess (9 attempts remaining):
(...)
```

(and yes, as you probably guessed, the word is "LONDON"!)

1. Run the app this time, instead of the tests. You should see the "Hello World!" message from Gradle's generated code. Go have a look at `App.java`, which is the class launched when running the program.
2. What is the method of the `App` class that Java automatically runs?
3. Modify the `main` method in `App.java` so it instantiates the `Game` game class and prints out the word to guess in the terminal. When running the app, you should now see a hidden word, such as `M_____`.
4. Implement the game loop that keeps asking the player to enter one letter (you'll likely need to do a bit of research on how to read user input). Use the `guessLetter` method to then indicate whether the player did guess correctly one letter or not.
5. Indicate the number of remaining attempts inside the CLI prompt.

Attempt the exercises by yourself before watching the following video:
[Example Solution](https://www.youtube.com/watch?v=8samh2h8g5w)

## Exercise - debugging

Someone from your cohort wrote the following code in the `main` method, however when trying out the game, it doesn't behave at all as expected. They also tell you they've used a [`do-while` loop](https://www.javatpoint.com/java-do-while-loop) to implement the game loop. Can you find out what the problem is?

```java
WordChoser choser = new WordChoser();
Game game = new Game(choser);
System.out.println("Welcome! Today the word to guess is:");

do {
    System.out.println(game.getWordToGuess());

    System.out.println("Enter one letter to guess:");

    Scanner scanner = new Scanner(System.in);
    Character guess = scanner.nextLine().charAt(0);
    Boolean result = game.guessLetter(guess);

    if () {
        System.out.println("Right!");
    } else {
        System.out.println("Wrong...");
    }
} while (result);
```

[Next Challenge](09_challenge_game_over.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/08_challenge_guessed_letters.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/08_challenge_guessed_letters.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/08_challenge_guessed_letters.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/08_challenge_guessed_letters.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/08_challenge_guessed_letters.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
