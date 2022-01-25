package io.dmitrikonnov.mushroomsapp.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "custom")
@Component
public class CustomActuatorEndpoint {

    /**
     * If we'd like to pass a parameter to the endpoint (within our request), we should mention it in method's
     * args. The endpoint then would look like /actuator/custom?username=... . Else just no args needed.
     * It's supposed to provide some session infos etc.
     * */
    @ReadOperation
    public Object customEndpoint (String username) {
        Map<String, String> map = new HashMap<>();
        map.put("Key", username);
        return map;
    }
}
