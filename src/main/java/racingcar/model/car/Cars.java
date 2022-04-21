package racingcar.model.car;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.CarNameSplit;
import racingcar.model.GameRule;

public class Cars {

    private static final int NUMBER_FOR_MOVE = 4;
    private List<Car> values;
    private TryCount tryCount;

    public Cars(CarNameSplit carNameSplit) {
        values = new ArrayList<>();
        nullValidation(carNameSplit);

        for (String car : carNameSplit.getCarNames()) {
            values.add(new Car(car));
        }
    }

    public Cars(Cars cars, TryCount tryCount) {
        this.values = cars.values;
        this.tryCount = tryCount;
    }

    private void nullValidation(CarNameSplit carNameSplit) {
        if (carNameSplit == null) {
            throw new IllegalArgumentException();
        }

        if (carNameSplit.getCarNames() == null) {
            throw new IllegalArgumentException();
        }

        if (carNameSplit.getCarNames().size() <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public void runGame(GameRule gameRule) {
        values.forEach(car -> car.moveCar(tryCount, gameRule));
    }


}
