package pmHome.homeWorks.pmHomeWork5TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by serega on 23/12/15.
 */
public class ScreenShotUtils {

    pmHome.homeWorks.pmHomeWork4EnumAndRegUserMob.UserData ud = new pmHome.homeWorks.pmHomeWork4EnumAndRegUserMob.UserData();

    public void takeScreenShot(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/serega/Pictures/ScreenShots/screenshot" + ud.getUniqTime() + ".png"));
    }
}
