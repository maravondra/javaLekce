package com.maravondra.smart_city_traffic_control_system.model;

public class SystemConfig {

    private boolean manualControlLocked;
    // Zde můžeš v budoucnu přidat další globální nastavení (např. noční režim)

    public SystemConfig() {}
    public SystemConfig(boolean manualControlLocked) { this.manualControlLocked = manualControlLocked; }
    public boolean isManualControlLocked() { return manualControlLocked; }
    public void setManualControlLocked(boolean manualControlLocked) { this.manualControlLocked = manualControlLocked; }
}
