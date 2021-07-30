package me.zaochen.helloworld;

import me.zaochen.helloworld.commands.*;
import me.zaochen.helloworld.events.fish;
import me.zaochen.helloworld.gui.gui;
import me.zaochen.helloworld.gui.guicheck;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;


public final class HelloWorld extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveResource("aconfig.yml",false);
        System.out.println("[HelloWorld] 插件已加载");
        Objects.requireNonNull(getCommand("helloworld")).setExecutor(new maincommand());
        Objects.requireNonNull(getCommand("helloworld")).setTabCompleter(new maincommand());
        Objects.requireNonNull(getCommand("add")).setExecutor(new add());
        Objects.requireNonNull(getCommand("gonggao")).setExecutor(new gonggao());
        Objects.requireNonNull(getCommand("config")).setExecutor(new config());
        Objects.requireNonNull(getCommand("change")).setExecutor(new change());
        Objects.requireNonNull(getCommand("health")).setExecutor(new health());
        Objects.requireNonNull(getCommand("cd")).setExecutor(new gui());
        Objects.requireNonNull(getCommand("aconfig")).setExecutor(new aconfig());
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