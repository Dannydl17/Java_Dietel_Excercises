package AssigmentNdClassWork;

public class Time {
    private int hour;
    private int minutes;
    private int second;

    public Time(int hour, int minutes, int second){
        validate(hour, minutes, second);
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    private static void validate(int hour, int minutes, int second) {
        validateHour(hour);
        validateMinutes(minutes);
        validateSecond(second);
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    private static void validateSecond(int second) {
        boolean secondInvalid = second > 59 || second < 0;
        if (secondInvalid) throw new IllegalArgumentException("Second is invalid");
    }

    private static void validateMinutes(int minutes) {
        boolean minutesInvalid = minutes > 59 || minutes < 0;
        if (minutesInvalid) throw new IllegalArgumentException("Minutes is invalid");
    }

    private static void validateHour(int hour) {

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }

}
