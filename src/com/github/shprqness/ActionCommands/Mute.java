package com.github.shprqness.ActionCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;
import java.util.List;

public class Mute implements CommandExecutor, Listener {

    //options (FUCK OFFFFFF)
    public static String mute = "mute";


    //event for mute
    List<String> bannedFromChat = new ArrayList<String>();
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player p = event.getPlayer();
        for (String s : bannedFromChat) {
            if (bannedFromChat.contains(p.getName())) {
                event.setCancelled(true);
                p.sendMessage(ChatColor.RED + "IS IT A CAT, A DOG, no its just you getting muted...");
            }
        }
    }

    //command for mute

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("mute")) {
            if (sender.hasPermission("ce.command.mute")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "Incorrect usage! /mute (name)");
                } else if (args.length == 1) {
                    bannedFromChat.add(args[0]);
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You do not have the required permissions to perform this command!");
            }
        }
        if (cmd.getName().equalsIgnoreCase("unmute")) {
            if (sender.hasPermission("ce.command.mute")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "Incorrect usage. /unmute (name)");
                } else if (args.length == 1) {
                    bannedFromChat.remove(args[0]);
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You do not have the required permissions to perform this command!");
            }
        }

        return true;
    }

}
