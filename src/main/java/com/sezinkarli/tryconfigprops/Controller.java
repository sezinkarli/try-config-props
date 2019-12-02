package com.sezinkarli.tryconfigprops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @Autowired
    private JdbcConfig jdbcConfig;

    @GetMapping(path = "/{propertyName}")
    public String getProperty(@PathVariable("propertyName") String propertyName)
    {
        return jdbcConfig.getProperty(propertyName);
    }
}
