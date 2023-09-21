package chp3;

public class HeartRate {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int day;
    private int month;
    private int year;

    public HeartRate(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  int getDay(){
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDateOfBirth () {
        return dateOfBirth;
    }

    public void setDateOfBirth(int day, int month, int year) {
        dateOfBirth = day + "/" + month + "/" + year;
    }

    public int getCalculateAge() {
        int yearBefore = 2000;
        int yearNow = 2023;
        int userAge = yearNow - yearBefore;
        return userAge;
    }

    public int MaximumHRT() {
        int userAge = 23;
        int maximumHeartRate = 220 - userAge;
        return maximumHeartRate;
    }

    public double TargetHRT() {
        int maximumHeartRate = 197;
        double targetHeartRate = maximumHeartRate * 0.5;
        return  targetHeartRate;
    }

    public double TargetHRT1() {
        int maximumHeartRate = 197;
        double targetHeartRate = maximumHeartRate * 0.85;
        return  targetHeartRate;
    }


}
