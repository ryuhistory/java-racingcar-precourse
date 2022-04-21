package racingcar.model.car;

import racingcar.model.GameRule;

public class Car {

    private CarName carName;
    private Position position;

    public Car(String inputCarName) {
        this.carName = new CarName(inputCarName);
    }

    public void moveCar(TryCount tryCount, GameRule gameRule) {
        for (int i = 0; i < tryCount.getTryCount(); i++) {
            gameRule.canGoForward();
        }
    }

}
