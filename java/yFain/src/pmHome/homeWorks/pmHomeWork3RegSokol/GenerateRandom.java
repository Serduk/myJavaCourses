package pmHome.homeWorks.pmHomeWork3RegSokol;

/**
 * Created by serega on 21/11/15.
 */
public class GenerateRandom {
    int random = (int) (Math.random() * 999999999);
    String phoneRandom = "";

    public int getRandom(){
        int rand = (int) (Math.random() * 999999999);
        return rand;
    }



    public String phoneGenerator() {
        for (int i = 0; i < 12; i++) {
            int randomPhone = (int) (Math.random() * 10);
            phoneRandom += randomPhone;
        }
        return phoneRandom;
    }
}
