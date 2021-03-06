package com.github.vanroy.springboot.urlshortener.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Julien Roy
 */
@Component
@ConfigurationProperties(prefix = "app")
public class Configuration {

    private String backgroundColor = "#00a5ba";

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
