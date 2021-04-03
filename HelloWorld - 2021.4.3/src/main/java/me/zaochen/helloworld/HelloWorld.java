package me.zaochen.helloworld;

import com.google.common.util.concurrent.SettableFuture;
import me.zaochen.helloworld.commands.add;
import me.zaochen.helloworld.commands.gonggao;
import me.zaochen.helloworld.events.fish;
import org.bukkit.plugin.java.JavaPlugin;
import me.zaochen.helloworld.commands.maincommand;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[HelloWorld] 插件已加载");
        getCommand("helloworld").setExecutor(new maincommand());
        getCommand("helloworld").setTabCompleter(new maincommand());
        getCommand("add").setExecutor(new add());
        getCommand("gonggao").setExecutor(new gonggao());
        getServer().getPluginManager().registerEvents(new fish(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[HelloWorld] 插件已卸载");
    }
}