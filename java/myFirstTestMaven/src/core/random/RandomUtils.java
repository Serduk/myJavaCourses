package core.random;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by sergey on 1/13/16.
 */
public class RandomUtils {
    public String getUiqTime(){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }

    public int getUniqNumWithMaxParam(int max) {
        int randomWithMax =(int) (Math.random() * max);
        return randomWithMax;
    }
}
