package me.zaochen.helloworld;

import me.zaochen.helloworld.commands.*;
import me.zaochen.helloworld.events.fish;
import me.zaochen.helloworld.gui.gui;
import me.zaochen.helloworld.gui.guicheck;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
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
        getCommand("cd").setExecutor(new gui());
        getServer().getPluginManager().registerEvents(new fish(),this);
        getServer().getPluginManager().registerEvents(new guicheck(),this);
        new Papi().register();
        saveDefaultConfig();
        ShapedRecipe craft = new ShapedRecipe(new ItemStack(Material.EGG))
                .shape("xxx","xyx","x x")
                .setIngredient('x',Material.GOLD_INGOT)
                .setIngredient('y',Material.IRON_INGOT);
        getServer().addRecipe(craft);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[HelloWorld] 插件已卸载");
    }
}