package pmHome.homeWorks.pmHomeWork4EnumAndRegUserMob;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by serega on 08/12/15.
 */
public class UserData {
    char chooseGender;
    int setGender;
    int setDatareg = 5;
    String userEmail;
    String userPassword = "123a123a";

    String site = "http://m.naughtyavenue.com";
    String sourceAff = "/?utm_source=int";
    String toSetCookie = "/admin2";

    public void setChooseGender(char i) {
        chooseGender = i;
    }

    public int getSetGender() {
        if (chooseGender == 'M') {
            setGender = 0;
        } else {
            setGender = 1;
        }

        return setGender;
    }

    public String getUniqTime(){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }

    public String getUserEmail() {
        userEmail = "ghjcnjvtqk01+" + getUniqTime() + "@gmail.com";
        return userEmail;
    }



}
