package chp6;

public class TemperatureConversion {
    public static double CalculateKelvinTemperature(double number) {
        double celsiusTemperature = 273.15;
        double kelvinTemperature = celsiusTemperature + number;
        return  kelvinTemperature;
    }

    public static int  CalculateCelsiusTemperature(double number) {
        double kelvinTemperature = 273.15;
        int celsiusTemperature = (int) (number - kelvinTemperature);
        return  celsiusTemperature;
    }
}
