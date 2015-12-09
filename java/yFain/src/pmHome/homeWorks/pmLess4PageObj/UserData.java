package pmHome.homeWorks.pmLess4PageObj;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by serega on 02/12/15.
 */
public class UserData {
//    String email = "ghjcnjvtqk01" + rand + "gmail.com";


    public String getUniqTime(){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }
}
