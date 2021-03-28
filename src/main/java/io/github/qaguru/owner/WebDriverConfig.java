package io.github.qaguru.owner;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("webDriverBrowser")
    String getWebDriverBrowser();

    @Key("webDriverBrowserVersion")
    String getWebDriverBrowserVersion();

    @Key("remoteWebDriver")
    String getRemoteWebDriverUrl();

    @Key("videoStorage")
    String getVideoStorage();
}
