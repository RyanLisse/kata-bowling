import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    List<Frames> frames;
    List<Integer> throwsPins;


    public BowlingGame() {
        frames = new ArrayList<>();
        throwsPins = new ArrayList<>();
    }

    public void openFrame( int firstThrow, int secondThrow) {
        throwsPins.add(firstThrow);
        throwsPins.add(secondThrow);
        frames.add(new OpenFrame(throwsPins, throwsPins.size(), firstThrow, secondThrow));
    }

    public int totalScoreCalculator() {
        int total = 0;
        for (Frames frame: frames) {
            total += frame.score();
        }
        return total;
    }

    public void spareFrame(int firstThrow, int secondThrow) {
        throwsPins.add(firstThrow);
        throwsPins.add(secondThrow);
        frames.add(new SpareFrame(throwsPins, throwsPins.size(), firstThrow, secondThrow));
    }
}
