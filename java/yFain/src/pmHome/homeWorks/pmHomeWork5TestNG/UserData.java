package pmHome.homeWorks.pmHomeWork5TestNG;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by serega on 23/12/15.
 */
public class UserData {
    int age = 5;
    String userEmail;
    String userPassword = "123a123a";

    String site = "http://m.naughtyavenue.com";
    String sourceAff = "/?utm_source=int";
    String toSetCookie = "/admin2";

    String UserLocationGBR = "213.171.197.181";

    public String getUniqTime(){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }

    public String getUserEmail() {
        userEmail = "ghjcnjvtqk01+" + getUniqTime() + "@gmail.com";
        return userEmail;
    }
}
