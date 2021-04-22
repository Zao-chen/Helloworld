package me.zaochen.helloworld.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class fish implements Listener {
    @EventHandler
    public void PlayerFishEvent(PlayerFishEvent fish){
        fish.getPlayer().sendMessage(ChatColor.YELLOW+"[Helloworld]"+ChatColor.GREEN+"你扔出了鱼竿");
        fish.setCancelled(true);
        fish.getPlayer().sendMessage(ChatColor.YELLOW+"[Helloworld]"+ChatColor.RED+"无法钓鱼，已为您取消钓鱼");
    }
}
