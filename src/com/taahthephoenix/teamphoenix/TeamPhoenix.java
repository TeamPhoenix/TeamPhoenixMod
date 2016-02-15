package com.taahthephoenix.teamphoenix;

import com.taahthephoenix.teamphoenix.commands.Command_tpm;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class TeamPhoenix extends BukkitPlugin {
    
    public TeamPhoenix plugin;
    public BukkitCommandHandler handler;
    public YamlConfig config;
    
    @Override
    public void onLoad() {
        this.plugin = this;
        this.handler = new BukkitCommandHandler(plugin);
        
    }
    
    @Override
    public void onEnable() {
        BukkitLib.init(plugin);
        config = new YamlConfig(plugin, "config.yml", true);
        config.load();
        LoggerUtils.info(plugin, "Developed by " + plugin.getAuthors() + " version: " + plugin.getVersion() + "enabled!");
        
        handler.setCommandLocation(Command_tpm.class.getPackage());
        
    }
    
    @Override
    public void onDisable(){
        config.save();
        LoggerUtils.info(plugin, "Developed by " + plugin.getAuthors() + " version: " + plugin.getVersion() + "disabled!");
        
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        return handler.handleCommand(sender, cmd, commandLabel, args);
    }

    
}
