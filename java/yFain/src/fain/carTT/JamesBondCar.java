package fain.carTT;

public class JamesBondCar extends Car {
    public int drive(int howLong) {
        distance = distance + howLong * 180;
        System.out.println("Total driving " + distance + " killometers");
        return distance;
    }
}
