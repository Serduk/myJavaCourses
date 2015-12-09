package pmHome.homeWorks.pmHomeWork3RegSokol;

/**
 * Created by serega on 21/11/15.
 */
public class UserData {
    GenerateRandom gr = new GenerateRandom();

    String email = "" + gr.getRandom() + "@gmail.com";
    String password = "123123";

    String name = "" + gr.getRandom();
    String surname = "" + gr.getRandom();
    String phone = "" + gr.phoneGenerator();
    String dayBirth = "02";
    String yearBirth = "1990";

}
