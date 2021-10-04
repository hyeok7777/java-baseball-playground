package baseball;

public class BallNumber {
    private int no;
    private static final int MIN_NO = 1;
    private static final int MAX_NO = 9;


    public BallNumber(int no) {
        if(no >= MIN_NO && no <= MAX_NO) {
            throw new IllegalArgumentException("볼 숫자는 1부터 9의 값이여야 합니다.");
        }
        this.no = no;
    }
}
