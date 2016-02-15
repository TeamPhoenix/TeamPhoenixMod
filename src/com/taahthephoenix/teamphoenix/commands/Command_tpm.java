package com.taahthephoenix.teamphoenix.commands;

import com.taahthephoenix.teamphoenix.TeamPhoenix;
import net.md_5.bungee.api.ChatColor;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_tpm extends BukkitCommand<TeamPhoenix> {
    
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args){
        
        sender.sendMessage(ChatColor.GOLD + "Plugin: TeamPhoenix");
        sender.sendMessage(ChatColor.RED + "Server running on: " + plugin.getConfig().getString("server-name"));
        sender.sendMessage(ChatColor.RED + "Forums: " + plugin.getConfig().getString("server-forums"));
        sender.sendMessage(ChatColor.GOLD + "Plugin Description: " + plugin.getDescription());
        
        return true;
    }
    
}
