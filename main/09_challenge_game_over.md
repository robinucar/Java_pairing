# Building a word-guessing game - Part V

## Objectives 

* All of the previous objectives!

We're now able to play our game using the CLI to guess the word - however we still have to implement the game over function.

## Exercise - winning or losing

1. What attribute do we need to check in order to determine if the player has lost the game?
2. Test-drive an `isGameLost` method that informs whether, or not, the game has been lost. This test should setup the game data so we're simulating a game that has been lost — perhaps by directly calling `guessLetter` enough times with wrong letters on purpose.
3. Implement the method `isGameLost`.
4. Use this new method in the `App` class to check if the game has been lost after guessing a letter. Depending on its result, display a message and exit the game loop.
5. Repeat the above steps to implement the method `isGameWon` that verifies whether the game has been won (i.e the player has guessed the whole word).

## Exercise - debugging 

<!-- OMITTED -->

Someone in your cohort has finished coding the method `isGameWon` — they came up with a rather simple solution and they're pretty happy with it. They can simply check that the number of letters guessed is equal to the number of letters in the word, minus 1 (the first letter of the word):

```java
// Game.java

public Boolean isGameWon() {
    return guessedLetters.size() == word.length() - 1;
}
```

They've also added this code in the game loop in `App.java`:
```java
// App.java

if (game.isGameWon()) {
    System.out.println("Yeaaah! You won!");

    return;
}
```

However, when you try to run their game, you discover a bug: you found all the right letters for the word `LONDON`, but the game doesn't say you've won!

```
Welcome! Today the word to guess is:
L_____
Enter one letter to guess:
O
Right!
LO__O_
Enter one letter to guess:
N
Right!
LON_ON
Enter one letter to guess:
D
Right!
LONDON
Enter one letter to guess:
```

1. Can you see what the problem is? Even if you can't find it right away, intuitively, what is a special feature of the word "LONDON"?
2. Write a test that verifies the `isGameWon` method is working correctly when the word to guess contains more than one occurrence of the same letter (you can use "DEVELOPER" or "COOL").
3. Implement `isGameWon` so it passes this test as well — maybe your first solution was already working fine for this – in that case, well done!

<details>
<summary>Reveal suggested solution</summary>

```java
// GameTest.java

@Test public void testIsWon() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("TEA");

    Game game = new Game(mockedChoser);
    game.guessLetter('T');
    game.guessLetter('E');
    game.guessLetter('A');

    assertEquals(game.isGameWon(), true);
}

@Test public void testIsWonWithSpecialWord() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("COOL");

    Game game = new Game(mockedChoser);
    game.guessLetter('C');
    game.guessLetter('O');
    game.guessLetter('L');

    assertEquals(game.isGameWon(), true);
}
```

```java
// Game.java

public Boolean isGameWon() {
    // we start to scan the word at index 1,
    // as we want to omit the first letter 
    // (it's never guessed by the player!)
    for (int i = 1 ; i < word.length() ; i++) {
        Character letter = word.charAt(i);
        if (guessedLetters.indexOf(letter) == -1) {
            return false;
        }
    }

    return true;
}
```

</details>

Attempt the exercise by yourself before watching the following video:
[Example Solution](https://www.youtube.com/watch?v=zy3B6wsFnGc)


[Next Challenge](10_challenge_view.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/09_challenge_game_over.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/09_challenge_game_over.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/09_challenge_game_over.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/09_challenge_game_over.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/09_challenge_game_over.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
