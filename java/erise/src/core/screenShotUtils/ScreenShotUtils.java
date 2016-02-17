package core.screenShotUtils;

import core.random.RandomUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by sergey on 1/18/16.
 */
public class ScreenShotUtils {

    RandomUtils random = new RandomUtils();

    String userHome = System.getProperty("user.home");
    String saveScreenTo = userHome + "/Pictures/testScreenShots/screenshot";
    String formatFoScreen = ".png";

    public void getScreenShot(WebDriver driver) throws IOException {
        File screenShotsaveTo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShotsaveTo, new File(saveScreenTo + random.getUiqTime() + formatFoScreen));
    }
}
