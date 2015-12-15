package fain.carTT;

public class Car {

    int distance;

    public void start() {
        System.out.println("I'm start Driving");
    }

    public void stop() {
        System.out.println("I'm stop Driving");
    }

    public int drive(int howLong) {
        distance = distance + howLong * 60;
        System.out.println("Total driving " + distance + " killometers");
        return distance;
    }

}
