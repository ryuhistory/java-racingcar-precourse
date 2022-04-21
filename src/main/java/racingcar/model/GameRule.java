package racingcar.model;

public class GameRule {

    private static final int BASE_VALE_FOR_FORWARD = 4;
    private RandomNumber randomNumber;

    public GameRule() {
        randomNumber = new RandomNumber();
    }

    public boolean canGoForward() {
        return randomNumber.getRandomNumber() >= BASE_VALE_FOR_FORWARD;
    }

}
