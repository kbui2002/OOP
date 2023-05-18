package lab6.mydate;

import java.util.Arrays;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private final String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };
	private final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	private final int[] DayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LeapDayInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private static final int[] nonLeapYearMonthNumbers = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
	private static final int[] leapYearMonthNumbers = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

	public boolean isLeapYear(int year) {
		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
			return true;
		}
		return false;
	}

	public boolean isValidDate(int day, int month, int year) {
		if (year < 1 || year > 9999) {
			return false;
		}
		if (year < 1 || year > 12) {
			return false;
		}
		if (day > DayInMonth[month - 1]) {
			return false;
		}
		return true;
	}

	public int getDayOfWeek(int day, int month, int year) {
		int century = 6 - 2 * ((year / 100) % 4); // tìm thế kỉ
		int lastDigitYear = year % 100;
		int yearNumber = lastDigitYear / 4;
		int monthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
		int dayNumber = day;
		return (century + lastDigitYear + yearNumber + monthNumber + dayNumber) % 7;
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("%s %d %s %s", DAYS[getDayOfWeek(day, month, year)], day, MONTHS[month - 1], year);
	}

	public MyDate nextDay() {
		day++;
		if (isLeapYear(year)) {
			if (day > LeapDayInMonth[month - 1]) {
				day = 1;
				month++;
				if (month > 12) {
					month = 1;
					year++;
				}
			}
		} else {
			if (day > DayInMonth[month - 1]) {
				day = 1;
				month++;
				if (month > 12) {
					month = 1;
					year++;
				}
			}
		}
		return this;
	}

	public MyDate nextMonth() {
		if (month == 12 && year == 9999) {
			return this;
		}
		int maxDay;
		if (isLeapYear(year)) {
			if (month == 12) {
				maxDay = DayInMonth[0];
			} else {
				maxDay = DayInMonth[month];
			}

			if (day == DayInMonth[month - 1]) {
				maxDay = maxDay;
			} else if (day > maxDay) {
				maxDay = maxDay;
			} else if (day < maxDay) {
				maxDay = day;
			}

		} else {
			if (month == 12) {
				maxDay = LeapDayInMonth[0];
			} else {
				maxDay = LeapDayInMonth[month];
			}

			if (day == LeapDayInMonth[month - 1]) {
				maxDay = maxDay;
			} else if (day > maxDay) {
				maxDay = maxDay;
			} else if (day < maxDay) {
				maxDay = day;
			}
		}
		if (month == 12) {
			year++;
			month = 1;
			day = maxDay;
			return this;
		}
		day = maxDay;
		month++;
		return this;
	}

	public MyDate nextYear() {
		int maxDay;
		if (year == 9999) {
			return this;
		}
		if (isLeapYear(year + 1)) {
			maxDay = LeapDayInMonth[month - 1];
			if (day == LeapDayInMonth[month - 1]) {
				maxDay = maxDay;
			} else if (day > maxDay) {
				maxDay = maxDay;
			} else if (day < maxDay) {
				maxDay = day;
			}
		} else {
			maxDay = DayInMonth[month - 1];
			if (day == DayInMonth[month - 1]) {
				maxDay = maxDay;
			} else if (day > maxDay) {
				maxDay = maxDay;
			} else if (day < maxDay) {
				maxDay = day;
			}
		}
		year++;
		day = maxDay;
		return this;
	}

	public MyDate previousDay() {
		if (day == 1 && month == 1 && year == 1) {
			return this;
		}
		if (day == 1 && month == 1) {
			if (isLeapYear(year)) {
				year--;
				day = LeapDayInMonth[11];
				month = 12;
				return this;
			} else {
				year--;
				day = DayInMonth[11];
				month = 12;
				return this;
			}
		}
		if (day == 1) {
			if (isLeapYear(year)) {
				day = LeapDayInMonth[month - 2];
				month--;
				return this;
			} else {
				day = DayInMonth[month - 2];
				month--;
				return this;
			}
		}
		day--;
		return this;
	}

	public MyDate previousMonth() {
		if (month == 1 && year == 1) {
			return this;
		}
		int maxDay = 0;
		if (isLeapYear(year)) {
			if (month == 1) {
				maxDay = DayInMonth[11];
			} else {
				day = LeapDayInMonth[month - 2];
			}

			if (day == DayInMonth[month - 1]) {
				maxDay = maxDay;
			} else if (day > maxDay) {
				maxDay = maxDay;
			} else if (day < maxDay) {
				maxDay = day;
			}

		} else {
			if (month == 1) {
				maxDay = LeapDayInMonth[11];
			} else {
				day = LeapDayInMonth[month - 2];
			}

			if (day == LeapDayInMonth[month - 1]) {
				maxDay = maxDay;
			} else if (day > maxDay) {
				maxDay = maxDay;
			} else if (day < maxDay) {
				maxDay = day;
			}
		}
		if (month == 1) {
			year = year - 1;
			month = 12;
			day = maxDay;
			return this;
		}
		month--;
		return this;
	}

	public MyDate previousYear() {
		if (year == 1) {
			return this;
		}
		int maxDay;
		if (isLeapYear(year - 1)) {
			maxDay = LeapDayInMonth[month - 1];
		} else {
			maxDay = DayInMonth[month - 1];
		}
		if (day > maxDay) {
			maxDay = maxDay;
		} else if (day < maxDay) {
			maxDay = day;
		} else {
			maxDay = maxDay;
		}
		year--;
		day = maxDay;
		return this;
	}
}
