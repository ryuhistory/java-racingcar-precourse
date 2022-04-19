package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CarNameSplit {

    private static final String NAME_SEPARATOR = ",";
    private static final String REGULAR_EXPRESSION_OF_ENGLISH = "^[a-zA-Z]*$";

    private List<String> carNames;

    public CarNameSplit(String inputCarNames) {
        carNames = new ArrayList<>();
        separatorExistsValidation(inputCarNames);
        separateCarNames(inputCarNames);
    }

    private void separatorExistsValidation(String inputCarNames) {
        if (!inputCarNames.contains(NAME_SEPARATOR)) {
            throw new IllegalArgumentException();
        }
    }

    private void englishInputValidation(String inputCarNames) {
        if (!Pattern.matches(REGULAR_EXPRESSION_OF_ENGLISH, inputCarNames)) {
            throw new IllegalArgumentException();
        }
    }

    private void separateCarNames(String inputCarNames) {
        String[] splitCarNames = inputCarNames.split(NAME_SEPARATOR);
        for (int carIndex = 0; carIndex < splitCarNames.length; carIndex++) {
            englishInputValidation(splitCarNames[carIndex]);
            carNames.add(splitCarNames[carIndex]);
        }
    }
}
