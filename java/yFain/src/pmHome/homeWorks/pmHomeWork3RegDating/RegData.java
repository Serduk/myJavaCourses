package pmHome.homeWorks.pmHomeWork3RegDating;

/**
 * Created by serega on 21/11/15.
 */
public class RegData {


    String genderMan = ".//*[@class = 'gender_m']";
    String genderWoman = ".//*[@class = 'gender_w selected']";
    String selectedGender = "";

    public void setGender(String i) {
        selectedGender = i;
    }

    public String getGender() {
        if (selectedGender.equals("W")) {
            return genderWoman;
        } else {
            return genderMan;
        }
    }



    String monthOfBirth = ".//*[@id='UserForm_month']";
    String dayBirth = ".//*[@id='UserForm_day']";
    String yearBirth = ".//*[@id='UserForm_year']";
    String email = ".//*[@class='frm-email ac_input']";
    String password = ".//*[@class='frm-password']";
    String location = ".//*[@class='frm-location ac_input']";
    String submitBuuton = ".//*[@id='submit_button']";   //".//*[@class='submit_button']";
    String chooseIndropBox = "/option[1]";
    String wrongEmail = ".//*[@id='UserForm_email_em_']";
    String finalCheckMail = ".//*[@class='email userMail']";

//    WebElement gender = data.findElement(By.xpath(getGender()));
//    WebElement setMonthBirth = data.findElement(By.xpath(monthOfBirth + chooseIndropBox));
//    WebElement setYearBirth = data.findElement(By.xpath(yearBirth + chooseIndropBox));
//    WebElement setDayBirth = data.findElement(By.xpath(dayBirth + chooseIndropBox));
//    WebElement setEmail = data.findElement(By.xpath(email));
//    WebElement setPass = data.findElement(By.xpath(password));
//    WebElement setLocation = data.findElement(By.xpath(location));
//    WebElement sendData = data.findElement(By.xpath(submitBuuton));




//    Select sl = new Select(setYearBirth);
//    sl.selectByIndex(1);




}
