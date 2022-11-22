# Building a word-guessing game - Part VI

<!-- OMITTED -->

## Objectives 

* All of the previous objectives!

We're now able to play our game using the CLI, and we have a way to stop the game when the player wins or loses. Maybe we can pause for a bit and look at tidying up a bit more?

Let's list what our `Game` class is doing so far:
 * guessing letters and checking if they're right or wrong
 * managing remaining attempts and guessed letters
 * knowing if the game is won or lost
 * displaying the word to guess

Our Game class is starting to grow. This is normal! As we add more features and the game is starting to look like a real program, the main class will tend to have more and more methods. It's important to recognise when such classes need to be broken down into smaller components.

Looking at the list above, it seems the three first things are dealing with the game *data* or *state* (player actions, whether they were right guesses or not). The last one, displaying the word to guess, is dealing with *displaying* something to the player. Maybe this last one is therefore a good candidate to be extracted in its own class.

## Exercise - extracting Masker

Our new class will feature one method only and it will contain the code that is currently inside `getWordToGuess`. Since the job of this class is to hide, or mask, the word to guess, we can call it `Masker`.

1. Create a new `MaskerTest` class with a structure similar to `GameTest`.
2. Move the tests covering the `getWordToGuess` method into this new class, since this will now be the job of `Masker` to hide the word.
3. Implement the `Masker` class by moving the code from `getWordToGuess` to a new method. This method should receive the word to guess as an argument, as well as the list of guessed letters. `getWordToGuess` will now delegate the work to the new method.
4. Remember to mock `Masker` in your tests, like you did before for the `WordChoser`.

```java
package game;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class MaskerTest {
    @Test
    public void testGetsMaskedWord() {
        Masker masker = new Masker();
        ArrayList<Character> guessedLetters = new ArrayList<Character>();
        guessedLetters.add('E');
        guessedLetters.add('V');

        assertEquals(masker.getMaskedWord("DEVELOPER", guessedLetters), "DEVE___E_");
    }
}
```

[Next Challenge](11_challenge_multiplayer.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/10_challenge_view.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/10_challenge_view.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/10_challenge_view.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/10_challenge_view.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/10_challenge_view.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
