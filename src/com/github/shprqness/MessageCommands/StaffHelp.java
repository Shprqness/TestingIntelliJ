package com.github.shprqness.MessageCommands;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffHelp implements CommandExecutor {



    //options (idfk why i always add a options comment lol
    public static String help = "help";



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            if(cmd.getName().equalsIgnoreCase(help)){
                Player p = (Player) sender;
                if(p.hasPermission("staff.jmod")){
                    p.sendMessage(ChatColor.STRIKETHROUGH + "                            ");
                    p.sendMessage(ChatColor.GOLD + "/ban - Bans user from server");
                    p.sendMessage(ChatColor.GOLD + "/mute - Stops user from talking in server");
                    p.sendMessage(ChatColor.GOLD + "/whois - Gathers information on user");
                    p.sendMessage(ChatColor.GOLD + "/Unban - Unbans user from the server");
                    p.sendMessage("Executor - " + p.getDisplayName());
                    p.sendMessage(ChatColor.STRIKETHROUGH + "                            ");
                }
            }

        }else{
            sender.sendMessage(ChatColor.RED + "Only Humans can execute this cool command");
        }

        return true;
    }
}
