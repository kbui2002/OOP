package lab6.mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Not valid hour's value");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Not valid minute's value");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Not valid second's value");
        }
        this.second = second;
    }

    public String toString() {
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public MyTime nextSecond() {
        try {
            setTime(hour, minute, ++second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        second = 0;
        return nextMinute();
    }

    public MyTime nextMinute() {
        try {
            setTime(hour, ++minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        minute = 0;
        return nextHour();
    }

    public MyTime nextHour() {
        try {
            setTime(++hour, minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        hour = 0;
        return this;
    }

    public MyTime previousSecond() {
        try {
            setTime(hour, minute, --second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute() {
        try {
            setTime(hour, --minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        minute = 59;
        return previousHour();
    }

    public MyTime previousHour() {
        try {
            setTime(--hour, minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        hour = 23;
        return this;
    }
}
