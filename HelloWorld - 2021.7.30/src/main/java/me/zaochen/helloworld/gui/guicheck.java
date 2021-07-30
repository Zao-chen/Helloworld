package me.zaochen.helloworld.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class guicheck implements Listener {
    @EventHandler
    public void check(InventoryClickEvent ch)
    {
        Player p = (Player) ch.getWhoClicked();
        if(ch.getWhoClicked().getOpenInventory().getTitle().equals("§l一个简易界面"))
        {
            p.sendMessage("你点击了菜单");
            ch.setCancelled(true);
        }
        if(ch.getRawSlot()>ch.getInventory().getSize())
        {
            p.sendMessage("你点击了你的背包");
            return;
        }
        if(ch.getRawSlot()<0)
        {
            p.sendMessage("你点击了空白部分");
            return;
        }
        if(ch.getRawSlot()==22)
        {
            p.sendMessage("你点击了钻石");
        }
        else if(ch.getRawSlot()==23)
        {
            p.sendMessage("你点击了金子");
        }
    }
}
