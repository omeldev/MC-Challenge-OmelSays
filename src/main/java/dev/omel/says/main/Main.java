package dev.omel.says.main;

import dev.omel.says.command.GetTask;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        registerCommands();
        registerListener();

    }

    public void onDisable(){}

    private void registerCommands(){
        getCommand("gettask").setExecutor(new GetTask());
    }

    private void registerListener() {

    }

    public static Main getInstance() {
        return getPlugin(Main.class);
    }

}