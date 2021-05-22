package me.zaochen.helloworld;

import me.zaochen.helloworld.commands.*;
import me.zaochen.helloworld.events.fish;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[HelloWorld] 插件已加载");
        getCommand("helloworld").setExecutor(new maincommand());
        getCommand("helloworld").setTabCompleter(new maincommand());
        getCommand("add").setExecutor(new add());
        getCommand("gonggao").setExecutor(new gonggao());
        getCommand("config").setExecutor(new config());
        getCommand("change").setExecutor(new change());
        getCommand("health").setExecutor(new health());
        new Papi().register();
        getServer().getPluginManager().registerEvents(new fish(),this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[HelloWorld] 插件已卸载");
    }
}