package fain.tempConvTT;

public class TemperatureCalc {
    int currentTemp = 0;
    char tempType;
    String result;


    public String convertTemp(int temp, char type) {
        currentTemp = temp;
        tempType = type;

        if (tempType == 'F') {
            currentTemp = currentTemp * (9 / 5) + 32;
            System.out.println("Current user temp is " + currentTemp + "C");
        } else if (tempType == 'C') {
            currentTemp = currentTemp * (5 / 9) - 32;
            System.out.println("Current user temp is " + currentTemp + "F");
        } else {
            System.out.println("Whrong Answer");
        }

        return result;
    }
}
