




public class WebPage {
    public WebPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}