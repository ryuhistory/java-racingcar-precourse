package racingcar.global.errorcode;

public enum ErrorCode {

    ILLEGAL_SEPARATOR("이름은 쉼표(,) 기준으로 구분 해야함"),
    ILLEGAL_TEXT_TYPE("이름은 영문만 가능합니다."),
    ILLEGAL_CAR_NAME_LENGTH("이름은 5자 이하만 가능하다.");

    private static final String ERROR_MESSAGE_PREFIX = "[ERROR] ";

    private final String description;

    ErrorCode(String description) {
        this.description = description;
    }

    public String getMessage() {
        return String.format("%s%s", ERROR_MESSAGE_PREFIX, this.description);
    }
}
