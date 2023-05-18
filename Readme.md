# Salt Kata Series

## <The kata name>

### A. Scenario

Being a software developer involves a lot of logical problem-solving and being able to do that in a readable and well-structured manner. You should also be able to test your logic to make sure it runs as expected even if you were to refactor your code or make additions to it.

### B. What you will be working on

Today you will be completing <a kata> exercise and at the end of it you will

- Have gained even more understanding of `Java` syntax and structure
- Have gotten better at unit testing and be comfortable with using `jUnit`
- You will also learn about different ways to model objects & classes
- Get better at solving problems as a team.
### B. What you will be working on




### C. Setup

1. Open intellij and create a new project by
    1. choosing maven project optionally set your group and artifact id's
    2. opening this directory and add framework support -> maven
2. Create a new java class ( cmd + N ) called `se.salt.jfs.kata.bowling`
3. Generate a new Test ( cmd + N )for the class and choose jUnit5 as the option
4. Add the Junit jar as a maven dependency (option + enter) and also add the `junit-jupiter-engine` dependency
5. Add a test method ( cmd + N ) and make sure you can run it ( ctrl + shift + R )
6. Add the surefire plugin to the `pom.xml`
7. open a terminal and run `mvn clean test`


### D. Lab instructions

Overview of exercise goes here




#### The Kata


Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Here are some things that the program will not do:

- We will not check for valid rolls.
- We will not check for correct number of rolls and frames.
- We will not provide scores for intermediate frames.

Depending on the application, this might or might not be a valid way to define a complete story, but we do it here for purposes of keeping the kata light. I think you’ll see that improvements like those above would go in readily if they were needed for real.

We can briefly summarize the scoring for this form of bowling:

- Each game, or series, of bowling, includes ten turns, or “frames” for the bowler.
- In each frame, the bowler gets two tries to knock down all the pins.
- If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
- If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
- If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the total of the pins knocked down in his next two rolls. (could be 2 turns if there's another strike)
- In the last (tenth) frame, the bowler gets extra rolls to be able to complete the bonus in case of a Strike or Spare.  These bonus throws, up to a maximum of 3 rolls, are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
- The game score is the total of all frame scores.

More info on the rules at: [How to Score for Bowling](http://www.topendsports.com/sport/tenpin/scoring.htm)

### Clues

What makes this game interesting to score is the lookahead in the scoring for strike and spare. At the time we throw a strike or spare, we cannot calculate the frame score: we have to wait one or two frames to find out what the bonus is.

Suggested Test Cases
(When scoring `X` indicates a strike, `/` indicates a spare, `-` indicates a miss/gutter ball)

- `X X X X X X X X X X X X` (12 rolls: 12 strikes) = 10 frames \* 30 points = 300
- `9- 9- 9- 9- 9- 9- 9- 9- 9- 9-` (20 rolls: 10 pairs of 9 and miss) = 10 frames \* 9 points = 90
- `5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5` (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames \* 15 points = 150

## Some starting points and tips

This [amazing article](https://ronjeffries.com/xprog/articles/acsbowling/) was really a turning point for me in understanding the TDD process properly. I urge you to follow along, although there are better ways to write code now (an `ArrayList` could be `List<T>` for example)

Let's steal from this master TDD:er and use the following plan:

- Have a class for the Game itself
- Define classes for each particular case; OpenFrame, SpareFrame and StrikeFrame... and more?
    -  Will Records be a good fit?
- Use strict TDD Rules:
    - You are not allowed to write any production code unless it is to make a failing unit test pass
    - You are not allowed to write any more of a unit test that is sufficient to fail, and compilation failures are failures

#### TDD

Here's a quick refresher on how we write tests:

- Red

    - Write a trivial test and make sure it fails.

- Green

    - Write the simplest possible implementation to make the test pass.

- Refactor

    - Refactor the implementation until you're satisfied with the code.

- Go back to red
    - Write a new test

---

Good luck and have fun!