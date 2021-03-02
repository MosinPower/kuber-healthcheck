package com.github.mosinpower.actuatorservice.actuator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "spec")
public class CustomActuatorEndpoint {

    @Value(value = "${mp.custom.flag:true}")
    private String flag;

    @ReadOperation
    public String getFlag() {
        return flag;
    }

    @WriteOperation
    public String setNewFlag(String newFlag) {
        flag = newFlag;
        return flag;
    }

}
