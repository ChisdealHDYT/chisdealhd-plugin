package co.uk.chisdealhd.customplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import co.uk.chisdealhd.customplugin.ChisdealHDPlugin;

public class reload implements CommandExecutor {
    ChisdealHDPlugin plugin;
    public reload(ChisdealHDPlugin instance)
    {
        plugin = instance;
    }
 
    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args){
        if (command.getName().equalsIgnoreCase("reload-chisdealhdyt")) {
            if (args.length > 0) {
                sender.sendMessage(ChatColor.RED + "To many arguments.");
                return false;
            }
            if (sender instanceof Player) {
                Player player = (Player)sender;
                if (hasReload(player)) {
                	this.plugin.reloadConfig();
                    sender.sendMessage(ChatColor.YELLOW + "Reloaded "+ ChatColor.GRAY + plugin.getDescription().getFullName());
                } else {
                    sender.sendMessage(ChatColor.RED + "You do not have access to that.");
                }
            } else {
            	this.plugin.reloadConfig();
                sender.sendMessage(ChatColor.YELLOW + "Reloaded "+ ChatColor.GRAY + plugin.getDescription().getFullName());
            }
            return true;
        }
        return false;
    }
 
    public boolean hasReload(Player player) {
        if (player.hasPermission("chisdealhdyt.reload")) {
            return true;
        } else if  (player.hasPermission("chisdealhdyt.*")) {
            return true;
        }
        return false;
    }
}