package chp3;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private String dateOfBirth;
    private int heightInInches;
    private double weightInPound;

    public HealthProfile(String firstName, String lastName, String gender, int day, int month, int year, int heightInInches, double weightInPound) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year =year;
        this.heightInInches = heightInInches;
        this.weightInPound = weightInPound;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

   public String getDateOfBirth(){
       return dateOfBirth;
   }

    public void setDateOfBirth(int day, int month, int year) {

        dateOfBirth = day + "/" + month + "/" + year;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getWeightInPound() {
        return weightInPound;
    }

    public void setWeightInPound(double weightInPound) {
        this.weightInPound = weightInPound;
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

    public double CalculatedBmi(double weightInPound, int heightInInches) {
        double calculatedWeight = weightInPound * 703;
        int calculatedHeight = heightInInches * heightInInches;
        double bmi = calculatedWeight / calculatedHeight;
        return bmi;
    }
}
