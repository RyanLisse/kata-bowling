import java.util.List;

public class OpenFrame implements Frames{

    int firstThrow;
    int secondThrow;
    List<Integer> throwsPins;
    int length;

    public OpenFrame(List<Integer> throwsPins, int length, int firstThrow, int secondThrow) {
        this.throwsPins = throwsPins;
        this.length = length;
        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
    }

    @Override
    public int score() {
        return firstThrow + secondThrow;
    }
}
