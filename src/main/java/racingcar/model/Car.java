package racingcar.model;

public class Car {

    private String carName;
    private int moveCount;

    public Car(String inputCarName) {
        lengthValidation(inputCarName);
        this.carName = inputCarName;
    }

    private void lengthValidation(String inputCarName) {
        if (inputCarName.length() > 5) {
            throw new IllegalArgumentException();
        }
    }
}
