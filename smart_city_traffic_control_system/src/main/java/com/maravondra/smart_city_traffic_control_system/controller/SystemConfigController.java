package com.maravondra.smart_city_traffic_control_system.controller;

import com.maravondra.smart_city_traffic_control_system.service.SystemConfigService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/system")
public class SystemConfigController {

    private final SystemConfigService configService;

    public SystemConfigController(SystemConfigService configService) {
        this.configService = configService;
    }

    /**
     * Zjistí aktuální stav zámku systému.
     * GET /api/v1/system/status
     */
    @GetMapping("/status")
    public Map<String, Boolean> getStatus() {
        return Map.of("manualControlLocked", configService.isLocked());
    }

    /**
     * Manuálně zamkne nebo odemkne systém.
     * POST /api/v1/system/lock?value=true
     */
    @PostMapping("/lock")
    public void setLock(@RequestParam boolean value) {
        configService.setLock(value);
        System.out.println(value ? "🔒 SYSTEM MANUALLY LOCKED" : "🔓 SYSTEM MANUALLY UNLOCKED");
    }
}
