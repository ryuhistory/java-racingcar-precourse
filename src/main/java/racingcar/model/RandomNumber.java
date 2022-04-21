package racingcar.model;


import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    private static final int MINIMUM_RANGE = 0;
    private static final int MAXIMUM_RANGE = 9;
    private int randomNumber;

    protected RandomNumber() {
        randomNumber = Randoms.pickNumberInRange(MINIMUM_RANGE, MAXIMUM_RANGE);
    }

    public int getRandomNumber() {
        return randomNumber;
    }


}
