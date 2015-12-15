package fain.carTT;

public class CarOwner {
    public static void main(String[] args) {
//		Car myCar = new Car();
        fain.carTT.JamesBondCar bondCar = new JamesBondCar();
//		myCar.drive(2);
//		myCar.drive(4);

        bondCar.drive(2);
    }

    private static class JamesBondCar extends fain.carTT.JamesBondCar {
    }
}
