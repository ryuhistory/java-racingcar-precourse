package racingcar.model.car;

public class TryCount {

    private static final int MINIMUM_VALUE = 1;
    private int tryCount;

    public TryCount(String inputCount) {
        integerValidation(inputCount);
        rangeValidation(inputCount);
        tryCount = Integer.parseInt(inputCount);

    }

    public int getTryCount() {
        return tryCount;
    }

    private void integerValidation(String inputCount) {
        if (!inputCount.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException();
        }
    }

    private void rangeValidation(String inputCount) {
        if (Integer.parseInt(inputCount) < MINIMUM_VALUE) {
            throw new IllegalArgumentException();
        }
    }
}
