import java.util.Date;

public class TimeTest {
    private int day;
    private int minute;
    private int hour;



    public TimeTest(int day, int minute, int hour) {
        this.day = checkDay(day);
        this.minute = minute;
        this.hour = hour;
    }

    public int checkDay(int testDay){
        int daysPerMonth[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (testDay > 0 && testDay <= 31)
            return testDay;
        return 1;
    }

    public void setTime(int d, int h, int m){
        day = ((d > 0 && d <= 31)) ? d : 0;
        hour = ((h >= 0 && h < 24)) ? h : 0;
        minute = ((m >= 0 && m < 60)) ? m : 0;
    }
    public int nextDay(){
        int testDay = day + 1;
        if (checkDay(testDay) == testDay){
            day = testDay;
        }else {
            day = 1;
        }
        return day;
    }
    public int nextHour(){
        hour = (hour + 1) % 24;
        if (hour == 0) {
            nextDay();
        }
        return hour;
    }

    public int nextMinute(){
        minute = (minute + 1) % 60;
        if (minute == 0) {
            nextHour();
        }
        return minute;
    }
    @Override
    public String toString() {
        return String.format("Day %02d, %02d:%02d", day, hour, minute);
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
