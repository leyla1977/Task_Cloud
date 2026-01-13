package ru.netology.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConfigController {

    
    @Value("${my.custom.property:Default Property Value}")
    private String customProperty;

    @Value("${my.custom.version:0.0.0}")
    private String version;

    @Value("${custom.message:Default Message}")
    private String customMessage;

    @GetMapping("/config")
    public String getConfig() {
        return String.format("""
            Configuration from Config Server:
            Property: %s
            Version: %s
            Message: %s
            """, customProperty, version, customMessage);
    }

    @GetMapping("/property")
    public String getProperty() {
        return customProperty;
    }

    @GetMapping("/message")
    public String getMessage() {
        return customMessage;
    }
}
