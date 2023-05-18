import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {
    BowlingGame bowlingGame = new BowlingGame();


    @Test
    void shouldReturn21ForOneSpareAnd9OpenFrames() {
        bowlingGame.spareFrame(4,6);
        bowlingGame.openFrame(3,5);
        manyOpenFrames(8,0,0);
        assertEquals( 21, bowlingGame.totalScoreCalculator());
    }

    @Test
    void shouldReturn23ForOneSpareAnd9OpenFrames() {
        bowlingGame.spareFrame(4,6);
        bowlingGame.openFrame(5,3);
        manyOpenFrames(8,0,0);
        assertEquals( 23, bowlingGame.totalScoreCalculator());
    }


    @Test
    void missedAllThrowsGutter() {
        manyOpenFrames(10, 0, 0);
        assertEquals(0, bowlingGame.totalScoreCalculator());
    }

    @Test
    public void shouldReturn60WhenThrewThreesAtEveryThrow() {
        manyOpenFrames(10, 3, 3);
        assertEquals(60, bowlingGame.totalScoreCalculator());
    }


    private void manyOpenFrames(int count, int firstThrow, int secondThrow) {
        for (int frameNumber = 0; frameNumber < count; frameNumber++)
            bowlingGame.openFrame(firstThrow, secondThrow);
    }
}