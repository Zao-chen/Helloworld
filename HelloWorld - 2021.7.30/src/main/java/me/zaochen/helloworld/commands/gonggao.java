package me.zaochen.helloworld.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class gonggao implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        if(sender.hasPermission("helloworld.commands.gonggao"))
        {
            Bukkit.getServer().broadcastMessage("[服务器公告]"+args[0]);
        }
        else
        {
            sender.sendMessage(ChatColor.RED+"你没有权限来发送公告");
        }
        return false;
    }
}
