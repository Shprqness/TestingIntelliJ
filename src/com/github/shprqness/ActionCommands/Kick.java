package com.github.shprqness.ActionCommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kick implements CommandExecutor {

    //options
    public static String kick = "kick";


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase(kick)){
            if(args.length == 0){
                sender.sendMessage(ChatColor.GREEN + "Correct Usage" + ChatColor.GRAY + ": " + ChatColor.WHITE + "/kick <user>");
                return true;
            }
            Player offender = Bukkit.getServer().getPlayer(args[0]);
            if(offender == null){
                sender.sendMessage(ChatColor.RED + "Well.... This is a little weired... Turns out " + args[0] + "is not a real player or is offline.. Big Fat L =(");
                return true;
            }
            offender.kickPlayer("YOU JUST GOT KICKEDDDDD AHAHAHAHAHAHAAAAHAHAHA L L L L L  L L L");
            //cba broadcasting it

        }

        return true;
    }
}
