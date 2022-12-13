package main;

import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftHistory extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("menu").setExecutor(new MenuCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
