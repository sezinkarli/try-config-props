package com.sezinkarli.tryconfigprops;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "jdbc")
public class JdbcConfig
{
    private String user;
    private String password;
    private String url;
    private String driver;

    private Map<String, String> propertyMap;

    @PostConstruct
    public void init()
    {
        propertyMap = new HashMap<>();
        propertyMap.put("user", user);
        propertyMap.put("password", password);
        propertyMap.put("url", url);
        propertyMap.put("driver", driver);
    }


    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getDriver()
    {
        return driver;
    }

    public void setDriver(String driver)
    {
        this.driver = driver;
    }

    public String getProperty(String key)
    {
        return propertyMap.get(key);
    }
}
