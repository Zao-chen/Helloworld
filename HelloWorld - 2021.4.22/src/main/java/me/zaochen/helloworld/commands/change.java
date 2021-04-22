package me.zaochen.helloworld.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class change implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        Plugin config = me.zaochen.helloworld.HelloWorld.getProvidingPlugin(me.zaochen.helloworld.HelloWorld.class);
        config.getConfig().set(args[0],args[1]);
        config.saveConfig();
        config.reloadConfig();
        sender.sendMessage("[HelloWorld]"+ ChatColor.GREEN+" 插件重载成功");
        return false;
    }
}
