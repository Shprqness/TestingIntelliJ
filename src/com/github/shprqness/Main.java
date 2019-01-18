package com.github.shprqness;

import com.github.shprqness.ActionCommands.Kick;
import com.github.shprqness.ActionCommands.Mute;
import com.github.shprqness.MessageCommands.StaffHelp;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    /*
    I am just messing around in this plugin do not take any of my code seriously,
    i am just getting used to this IDE =)
     */

    private StaffHelp commands = new StaffHelp();
    private Kick commands1 = new Kick();
    private Mute commands2 = new Mute();

    public void onEnable(){
        Bukkit.getServer().getConsoleSender().sendMessage("-------------------");
        getCommand(StaffHelp.help).setExecutor(commands);
        getCommand(Kick.kick).setExecutor(commands1);
        getCommand(Mute.mute).setExecutor(commands2);
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "Test Plugin for IntelliJ");
        Bukkit.getServer().getConsoleSender().sendMessage("By Shprqness");

        Bukkit.getServer().getConsoleSender().sendMessage("-------------------");
    }

}
