package me.zaochen.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class change implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        Plugin config = me.zaochen.helloworld.HelloWorld.getProvidingPlugin(me.zaochen.helloworld.HelloWorld.class);
        if(args[0].equals("string")) {
            config.getConfig().set("string", args[1]);
        }
        else if(args[0].equals("list"))
        {
            List<String> list = config.getConfig().getStringList("list");
            list.add(args[1]);
            config.getConfig().set("list",list);
        }
        config.saveConfig();
        config.reloadConfig();
        return false;
    }
}
