package racingcar.model.car;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.model.GameRule;
import racingcar.model.TryCount;

public class CarTest {

    private static final String INPUT_TRY_COUNT = "3";
    private static final String CAR_NAME = "TeCar";
    private GameRule gameRule;
    private Car car;

    @BeforeEach
    void setUP() {
        gameRule = new GameRule(new TryCount(INPUT_TRY_COUNT));
        car = new Car(CAR_NAME);
        car.moveCar(gameRule);
    }

    @Test
    void 자동차_이동_회수_정상() {
        assertEquals(car.getPosition().size(), Integer.valueOf(INPUT_TRY_COUNT));
    }

    @Test
    void 자동차_위치_라운드기준() {
        assertEquals(car.getPosition().size(), Integer.valueOf(INPUT_TRY_COUNT));
    }
}
