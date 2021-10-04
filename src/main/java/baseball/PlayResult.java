package baseball;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public boolean isGameEnd() {
        return strike == 3;
    }

    public void report(BallStatus ballStatus) {
        if (ballStatus.isStrike()) {
            this.strike += 1;
        }

        if(ballStatus.isBall()) {
            this.ball += 1;
        }
    }


}
