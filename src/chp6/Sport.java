package chp6;

public class Sport {
    public static void main(String[] args) {
        testSportsRecommender(25);
        testSportsRecommender(5);
        testSportsRecommender(35);
    }

            public static void testSportsRecommender(int temperatureCelsius) {
                String recommendation = sportsRecommender(temperatureCelsius);
                System.out.println("Temperature: " + recommendation);
            }

            public static String sportsRecommender(int temperatureCelsius) {
                if (temperatureCelsius >= 20 && temperatureCelsius <= 30) {
                    return "It’s lovely weather for sports today!";
                }
                else if (temperatureCelsius >= 10 && temperatureCelsius <= 40) {
                    return "It’s reasonable weather for sports today.";
                }
                else {
                    return "Please exercise with care today, watch out for the weather!";
                }
            }
        }

