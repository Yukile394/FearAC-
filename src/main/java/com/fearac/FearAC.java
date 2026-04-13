package com.fearac;

import com.fearac.checks.CombatCheck;
import com.fearac.checks.MovementCheck;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FearAC extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("====================================");
        getLogger().info("FearAC Basariyla Aktif Edildi!");
        getLogger().info("Surum: 1.20.1+");
        getLogger().info("====================================");

        // Korumaları (Dinleyicileri) Kaydet
        getServer().getPluginManager().registerEvents(new MovementCheck(), this);
        getServer().getPluginManager().registerEvents(new CombatCheck(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("FearAC Devre Disi Birakildi.");
    }
}

