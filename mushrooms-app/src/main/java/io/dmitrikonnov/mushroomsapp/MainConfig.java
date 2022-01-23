package io.dmitrikonnov.mushroomsapp;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties
@PropertySource("classpath:application.yml")
public class MainConfig {
}
