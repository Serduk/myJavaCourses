package core.browsers;

/***
 * Constructor
 * @param driver
 */

public class Page (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        }



//public class WebPage {
//
//    /**
//     * Wait for element with default delay
//     * @param element
//     */
//    public void waitForElement(WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, 120);
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    /**
//     * Wait for element with custom delay
//     * @param element
//     * @param timeout
//     */
//    public void waitForElement(WebElement element, int timeout) {
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        element = wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    /**
//     * Define WebDriver
//     */
//    public WebDriver driver;
//
//    public  WebPage (WebDriver driver) {
//        PageFactory.initElements(driver, this);
//        this.driver = driver;
//    }
//
//    /**
//     * Get driver
//     * @return
//     */
//    public WebDriver getDriver() {
//        return driver;
//    }
//
//    /**
//     * Get current URL of the page
//     * @return
//     */
//    public String pageUrl(){
//        return driver.getCurrentUrl();
//    }
//
//    /**
//     * Check if some element presents on the page
//     * @param by
//     * @return
//     */
//    public Boolean isElementPresent(By by) {
//        List<WebElement> elements = driver.findElements(by);
//        return elements.size() > 0;
//    }
//
//    /**
//     * Navigate to some location
//     * @param url
//     */
//    public void navigateTo(String url){
//        driver.get(url);
//    }
//
//    /**
//     * Sleep for thread
//     * @param i
//     */
//    public static void timeout(int i) {
//        try {
//            Thread.sleep(i);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Click and switch
//     * @param driver
//     * @param element
//     */
//    public static void clickOnElementAndSwitchToNewDriverWindow(WebDriver driver, WebElement element){
//        // Perform the click operation that opens new window
//        element.click();
//        WebPage.timeout(1000);
//
//        // Switch to new window opened
//        for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//            WebPage.timeout(1000);
//        }
//    }
//
//    /**
//     * Chek element exists and clik on it
//     * @param driver
//     * @param by
//     */
//    public static void clickOnElementIfExists(WebDriver driver, By by){
//        if(driver.findElements(by).size() != 0){
//            driver.findElement(by).click();
//        }
//
//    }
//
//
//    /**
//     * Click on el by JavaScript
//     * @param driver
//     * @param id
//     */
//    public static void JSclickOnElementById(WebDriver driver, String id){
//
//        ((JavascriptExecutor) driver)
//                .executeScript("document.getElementById('" + id + "').click();");
//    }
//
//    /**
//     * Swith to last driver window
//     * @param driver
//     */
//    public static void swithToLastDriverWindow(WebDriver driver){
//        WebPage.timeout(1000);
//        for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//        }
//    }
//}