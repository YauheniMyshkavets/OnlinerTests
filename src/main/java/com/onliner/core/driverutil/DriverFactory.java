package com.onliner.core.driverutil;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory implements DriverSource {

    @Override
    public WebDriver newDriver() {
        WebDriver _driver = null;
        String _browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase();
        DriverType _driverType = DriverType.valueOf(_browserName);

        switch (_driverType) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("use-fake-device-for-media-stream");
                options.addArguments("use-fake-ui-for-media-stream");
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                //options.addArguments("window-size=1260,1080");
                _driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                _driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                _driver = new EdgeDriver();
                break;
            case IE:
                DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
                cap.setCapability("nativeEvents", true);
                cap.setCapability("unexpectedAlertBehaviour", "accept");
                cap.setCapability("ignoreProtectedModeSettings", true);
                cap.setCapability("disable-popup-blocking", true);
                cap.setCapability("enablePersistentHover", true);
                cap.setCapability("requireWindowFocus", true);
                cap.setCapability("ignoreZoomSetting", true);

                cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
                cap.setCapability("ie.ensureCleanSession", true);
                cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
                InternetExplorerOptions optionsIE = new InternetExplorerOptions();
                optionsIE.merge(cap);

                WebDriverManager.iedriver().setup();
                optionsIE.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
                _driver = new InternetExplorerDriver(optionsIE);
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                _driver = new OperaDriver();
                break;
            default:
                break;
        }
        _driver.manage().window().maximize();
        return _driver;

    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
