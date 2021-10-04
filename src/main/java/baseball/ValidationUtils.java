package baseball;

public class ValidationUtils {

    private static final int MIN_NO = 1;
    private static final int MAX_NO = 9;

    public static boolean validNo(int no) {
        return no >= MIN_NO && no <= MAX_NO;
    }

}
