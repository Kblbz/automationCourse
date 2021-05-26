package com.customertimes.framework.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("file:config.properties")

public interface TestConfig extends Config {

    TestConfig CONFIG = ConfigFactory.create(TestConfig.class);

    @DefaultValue("chrome")
    String browser();

    /*
    We may point here any desirable properties and then specify them in config.properties file the same way we did with browser? for example:
    String browserVersion();
    String admin(); -> under which user tests will run
    */

}
