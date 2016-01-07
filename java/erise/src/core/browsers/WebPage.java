/***
 * Constructor
 * @param driver
 */

public WebPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        }