package me.zaochen.helloworld.commands;

import me.zaochen.helloworld.HelloWorld;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

public class runnable implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        new BukkitRunnable()
        {
            int i=5;
            public void run()
            {
                if(i==0)
                {
                    sender.sendMessage("倒计时结束");
                    this.cancel();
                }
                else
                {
                    sender.sendMessage(""+i);
                    i--;
                }
            }
        }.runTaskTimer(HelloWorld.getPlugin(HelloWorld.class),0,20);
        //.runTask(plugin)  在主线程运行一个任务
        //.runTaskAsynchronously(plugin)    新建一个线程运行任务
        //.runTaskLayer(plugin,delay)   在delay刻之后在主线程运行一个任务-20刻=1秒
        //.runTaskLayerAsynchronously(plugin,delay) 在delay之后新建线程运行任务
        //.runTaskTimer(plugin,delay,period)    在delay之后每period后在主线程运行一个任务（重复）
        //.runTaskTimerAsynchronously(plugin,delay,period)
        return false;
    }
}
