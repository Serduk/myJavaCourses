package pmHome.homeWorks.pmHomeWork1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by serdyuk on 11/16/15.
 */
public class MainCruiz {
    public static void main(String [] args) {
        CruizList[] arr = new CruizList[100];

        for (int i = 0; i < 100; i++) {
            CruizList cl = new CruizList();

            cl.setType(i);
            cl.setName(i);
            cl.setLongway((int) (Math.random() * 100));
            cl.setCapacity((int) (Math.random() * 100));
            cl.setSpeed((int) (Math.random() * 100));
            cl.setPrice((Math.random() * 100));
            cl.setTraffic();

            arr[i] = cl;
        }

        Arrays.sort(arr, new Comparator<CruizList>() {
            @Override
            public int compare(final CruizList lhs, final CruizList rhs) {
                return Double.compare(lhs.getTraffic(), rhs.getTraffic());
            }
        });
        //now your array is sorted

        for (int i = 0; i < arr.length; i++) {

            System.out.println(i + " | " + arr[i].getType() + " | " + arr[i].getName()
                                + " | " + arr[i].getLongway() + " | " + arr[i].getCapacity()
                                + " | " + arr[i].getSpeed() + " | " + arr[i].getPrice()
                                + " | " + arr[i].getResult() + " | " + arr[i].getTraffic());
        }
    }
}