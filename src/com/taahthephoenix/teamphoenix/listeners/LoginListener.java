package com.taahthephoenix.teamphoenix.listeners;

import com.taahthephoenix.teamphoenix.TeamPhoenix;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {
    
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String name = player.getName();
        
        if (player.getName().equalsIgnoreCase("falceso")) {
            event.setJoinMessage(ChatColor.RED + player.getName() + " is a TeamPhoenix Developer!");
            player.setPlayerListName(ChatColor.RED + name);
        }
        if (player.getName().equalsIgnoreCase("TaahThePhoenix")) {
            event.setJoinMessage(ChatColor.RED + player.getName() + " is a TeamPhoenix Developer!");
            player.setPlayerListName(ChatColor.RED + name);
        }
    }
    
}
