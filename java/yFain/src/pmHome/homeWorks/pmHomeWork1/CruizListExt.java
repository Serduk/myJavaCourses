package pmHome.homeWorks.pmHomeWork1;

public class CruizListExt {
    protected int capacity;//вместимость
    protected int longway;//дальность
    protected int speed;//скорость
    protected double traffic;

    public void setCapacity(int i) {
        if (0 == i) {
            i++;
        }
        capacity = i;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setLongway(int i) {
        longway = i;
    }

    public int getLongway() {
        return longway;
    }

    public void setSpeed(int i) {
        speed = i;
    }

    public int getSpeed() {
        return speed;
    }


    public void setTraffic() {
        this.traffic = (double) capacity / ((double)longway / (double)speed);
    }

    public double getTraffic() {
        return traffic;
    }

}
