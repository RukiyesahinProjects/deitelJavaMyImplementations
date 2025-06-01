public class Time {
    private int hour;
    private int minute;
    private int second;

    // Default constructor
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Constructor with all fields
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor with hour and minute
    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Constructor with only hour
    public Time(int hour) {
        this(hour, 0, 0);
    }

    // Copy constructor
    public Time(Time other) {
        this.hour = other.hour;
        this.minute = other.minute;
        this.second = other.second;
    }

    // Method to display time in HH:MM:SS format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Time time1=new Time(1,2,45);
        Time time2=new Time(time1);

        System.out.println(time1);
        System.out.println(time2);


    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
