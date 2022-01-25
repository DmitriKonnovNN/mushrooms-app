package io.dmitrikonnov.mushroomsapp.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {
    private final String LOGGER_SERVICE = "LoggerService";
    @Override
    public Health health() {
        if (isLoggerServiceOperable()){
            return Health.up().withDetail(LOGGER_SERVICE, "Service is running").build();
        }
        return Health.down().withDetail(LOGGER_SERVICE, "Service is not available").build();
    }

    private boolean isLoggerServiceOperable(){
        // some logic
        return true;
    }
}
