package me.zaochen.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class aconfig implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command, String label,String[] args) {
        File config = new File(me.zaochen.helloworld.HelloWorld.getPlugin(me.zaochen.helloworld.HelloWorld.class).getDataFolder(),"aconfig.yml");
        FileConfiguration cconfig = YamlConfiguration.loadConfiguration(config);
        sender.sendMessage(cconfig.getString("test")+"");
        return false;
    }
}
