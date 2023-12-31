package chp3;

public class Clock {

    private int hour;
    private int minutes;
    private int second;

    public Clock(int hour, int minutes, int second){
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {

        if(hour > 23){
            hour = 0;
        }
        this.hour = hour;

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        if (minutes > 59){
           minutes = 0;
        }
        this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {

        if (second > 59) {
            second = 0;
        }
        this.second = second;
    }

    public String getDisplayTime(int hour, int minutes, int second) {
        String displayTime;
        displayTime = String.format("%02d:%02d:%02d", hour, minutes, second);
        return displayTime;
    }
}
