package com.example.limitsservicespringboot.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("limits-service")
public class LimitsProperties {
    private int minimum;
    private int maximum;
}
