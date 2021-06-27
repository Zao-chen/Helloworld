package me.zaochen.helloworld.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class health implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        Player player = (Player)sender;
        String message = "%player_health%";
        message = PlaceholderAPI.setPlaceholders(player,message);
        sender.sendMessage("[Helloworld]你现在有 "+message + " 滴血!");
        return false;
    }
}
