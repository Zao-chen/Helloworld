package me.zaochen.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class add implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        int a=3,b=4;
        sender.sendMessage(a+b+"");//4+3=7 所以这里会输出7
        double a1=1.1,b1=1.2;
        sender.sendMessage(a1+b1+"");//1.1+1.2=2.3 所以这里会输出2.3
        char a2='a',b2='b';
        sender.sendMessage(a2+b2+"");//字符不能相加，所以这里是将他们的ascll码相加
        String a3="巴卡",b3="ばか";
        sender.sendMessage(a3+b3);//字符串相加会直接把他们拼接，也就是 巴卡+ばか＝巴卡ばｋ;
        /*
        int - 整数型 e.g：1，2，3，4
        double - 浮点型 e.g：1.1，2.23，3.2
        char - 字符型 e.g：a,b,c,d,e
        String - 字符串 e.g：esdbfvhj,egjfvcs,eshfb,啊啊啊，すごい
        boolean - 布尔型 e.g：true,false
         */
        return false;
    }
}
