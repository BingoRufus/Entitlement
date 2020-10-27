package com.github.bingorufus.entitlement;

import org.bukkit.plugin.java.JavaPlugin;

public final class Entitlement extends JavaPlugin {

    @Override
    public void onEnable() {
        throw new EntitlementError("Plugins take time to develop, I'm not going to code you a plugin for free if I don't want to create it.");
        //if the help of another dev has been enlisted to try and "fix" this plugin, there is no plugin
        // I have added the bee movie script as a resource to increase the jar size
    }

    @Override
    public void onDisable() {
    }
}
