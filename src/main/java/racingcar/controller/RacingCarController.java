package racingcar.controller;

import racingcar.model.CarNameSplit;
import racingcar.model.GameRule;
import racingcar.model.car.Cars;
import racingcar.model.car.TryCount;
import racingcar.view.UserInputView;

public class RacingCarController {

    private UserInputView userInputView;

    public RacingCarController(UserInputView input) {
        this.userInputView = input;
    }

    public void startRacingGame() {
        Cars cars = new Cars(generateCar(), generateCount());
        cars.runGame(new GameRule());
    }

    private Cars generateCar() {
        try {
            return new Cars(new CarNameSplit(userInputView.inputCarNameMessage()));
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return generateCar();
        }
    }

    private TryCount generateCount() {
        try {
            return new TryCount(userInputView.inputCountMessage());
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return generateCount();
        }
    }

}
