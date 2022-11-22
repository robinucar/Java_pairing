# Building a word-guessing game - Part VII

Let's make this game a multiplayer game! The new specs are:
 * Each player has to guess their own word, and has their own counter of remaining attempts.

In order to complete this exercise, you'll need to:
* create two separate instances of the `Game` class (and perhaps hold them in an array). 
* decide, at random, which player will start.
* in turn, ask each player to guess a letter.
* the game finishes as soon as one of the players wins, or loses.
* Use `System.out.printf` or `String.format` to format string with values.

Note that the order in which players are asked to enter their guess might be different for you — since it should be decided at random.

```
Welcome! Today the word to guess is:
Player 1: L_____
Player 2: D________

Player 1: Enter one letter to guess (10 attempts remaining):
N
Right!
L_N__N

Player 2: Enter one letter to guess (10 attempts remaining):
V
Right!
D_V______

Player 1: Enter one letter to guess (10 attempts remaining):
D
Right!
L_ND_N

Player 2: Enter one letter to guess (10 attempts remaining):
O
Right!
D_V__O___

(...)
```

## Exercise - entering player names

To complete this exercise, you'll have to:
 * read a string from the terminal with the `Scanner` class.
 * declare a new attribute for the `Game` class and a getter method for this attribute.
 * use the constructor to set this attribute.

```
Enter name for player 1: 
Tara
Enter name for player 2:
Will

Welcome! Today the word to guess is:
Tara: L_____
Will: D________

Tara: Enter one letter to guess (10 attempts remaining):
N
Right!
L_N__N

Will: Enter one letter to guess (10 attempts remaining):
V
Right!
D_V______

Tara: Enter one letter to guess (10 attempts remaining):
D
Right!
L_ND_N

Will: Enter one letter to guess (10 attempts remaining):
O
Right!
D_V__O___

(...)
```

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/11_challenge_multiplayer.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/11_challenge_multiplayer.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/11_challenge_multiplayer.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/11_challenge_multiplayer.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy/java-apprenticeship-module&prefill_File=main/11_challenge_multiplayer.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
