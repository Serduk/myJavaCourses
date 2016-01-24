package core.data;

import core.random.RandomUtils;

/**
 * Created by sergey on 1/13/16.
 */
public class UserData {
    RandomUtils randomUtils = new RandomUtils();
    String emailConstr = "ghjcnjvtqk01";
    String emaildomainGmail = "@gmail.com";
    public int numForDataBornDrop;

    public String getUiniqueUserEmail(){
        String uniqUserEmail = emailConstr + "+" + randomUtils.getUiqTime() + emaildomainGmail;
        return uniqUserEmail;
    }
}
