package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.view.UserInputView;

public class Application {

    public static void main(String[] args) {

        RacingCarController racingCarController = new RacingCarController(new UserInputView());
        racingCarController.startRacingGame();


    }

}
