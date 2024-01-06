package dev.omel.name.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        registerCommands();
        registerListener();

    }

    public void onDisable(){}

    private void registerCommands(){
    }

    private void registerListener() {

    }

}