import java.util.List;

public class SpareFrame implements Frames{

    int firstThrow;
    int secondThrow;
    List<Integer> throwsPins;
    int length;

    public SpareFrame(List<Integer> throwsPins, int length, int firstThrow, int secondThrow) {
        this.throwsPins = throwsPins;
        this.length = length;
        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
    }

    private int nextBall() {
        return throwsPins.get(length + 2);
    }

    @Override
    public int score() {
        return 10 + nextBall();
    }
}
