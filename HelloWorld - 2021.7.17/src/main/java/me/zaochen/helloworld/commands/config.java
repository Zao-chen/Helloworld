package me.zaochen.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class config implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        Plugin config = me.zaochen.helloworld.HelloWorld.getProvidingPlugin(me.zaochen.helloworld.HelloWorld.class);
        String head = "§e[Helloworld]§r ";
        sender.sendMessage(head+config.getConfig().getString("string"));
        sender.sendMessage(head+config.getConfig().getInt("int"));
        List<String> list = config.getConfig().getStringList("list");
        for(String list_to_string : list)
        {
            sender.sendMessage(head+list_to_string);
        }
        return false;
    }
}
