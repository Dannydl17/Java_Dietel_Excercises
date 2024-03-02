package AssigmentNdClassWork;

public class AirConditional {

    private boolean isOn;
    private int temperature;


    public boolean getIsOn(){
        return isOn;
    }
    public void turnOn(boolean isOn) {

        if (isOn != isOn) {
            this.isOn = ! isOn;
        }
        else {
            this.isOn = isOn;
        }
    }

    public int getTemperature() {
        return temperature;
    }


    public void increaseTemperature() {
         temperature++;
    }

    public void decreaseTemperature() {
        temperature --;

    }
}
