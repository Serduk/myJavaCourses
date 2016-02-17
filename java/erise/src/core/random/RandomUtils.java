package core.random;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by sergey on 1/13/16.
 */
public class RandomUtils {
    Random randomGenerator = new Random();
    public String getUiqTime(){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }

    public int getUniqNumWithMaxParam(int max) {
        int randomWithMax = randomGenerator.nextInt(max);
        return randomWithMax;
    }
}
