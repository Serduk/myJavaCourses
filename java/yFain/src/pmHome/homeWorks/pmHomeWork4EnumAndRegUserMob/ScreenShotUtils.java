package pmHome.homeWorks.pmHomeWork4EnumAndRegUserMob;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by serega on 08/12/15.
 */
public class ScreenShotUtils {

    UserData ud = new UserData();

    public void takeScreenShot(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/serega/Pictures/ScreenShots/screenshot" + ud.getUniqTime() + ".png"));
    }
}
