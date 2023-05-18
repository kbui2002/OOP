package lab5.classes.time;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public Time nextSecond() {
		if (hour == 23 && minute == 59 && second == 59) {
			hour = 0;
			minute = 0;
			second = 0;
		} else if (minute == 59 && second == 59) {
			hour++;
			minute = 0;
			second = 0;
		} else if (second == 59) {
			minute++;
			second = 0;
		} else {
			second++;
		}
		Time newTime = new Time(hour, minute, second);
		return newTime;
	}

	public Time previousSecond() {
		if (hour == 0 && minute == 0 && second == 0) {
			hour = 23;
			minute = 59;
			second = 59;
		} else if (minute == 0 && second == 0) {
			hour--;
			minute = 59;
			second = 59;
		} else if (second == 0) {
			minute--;
			second = 59;
		} else {
			second--;
		}
		Time newTime = new Time(hour, minute, second);
		return newTime;
	}

	public String toString() {
		String hour = this.hour + "";
		String minute = this.minute + "";
		String second = this.second + "";
		if (hour.length() == 1)
			hour = "0" + hour;
		if (minute.length() == 1)
			minute = "0" + minute;
		if (second.length() == 1)
			second = "0" + second;
		return (hour + ":" + minute + ":" + second);
	}
}