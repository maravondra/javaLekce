package com.maravondra.smart_city_traffic_control_system.service;

import com.maravondra.smart_city_traffic_control_system.model.SystemConfig;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class SystemConfigService {

    private final Path configPath = Paths.get("system_config.json");
    private final ObjectMapper objectMapper = new ObjectMapper();

    public boolean isLocked() {
        if (!Files.exists(configPath)) return false;
        SystemConfig config = objectMapper.readValue(configPath.toFile(), SystemConfig.class);
        return config.isManualControlLocked();
    }

    public void setLock(boolean locked) {
        objectMapper.writeValue(configPath.toFile(), new SystemConfig(locked));
    }
}
