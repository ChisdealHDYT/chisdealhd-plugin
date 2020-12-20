package co.uk.chisdealhd.customplugin.commands;

import co.uk.chisdealhd.customplugin.ChisdealHDPlugin;
import me.clip.placeholderapi.PlaceholderAPI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@SuppressWarnings("unused")
public class discord implements CommandExecutor {
    ChisdealHDPlugin plugin;
    public discord(ChisdealHDPlugin instance)
    {
        plugin = instance;
    }
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		if (command.getName().equalsIgnoreCase("discord")) {
		    if (sender instanceof Player) {
		    	Player player = (Player)sender;
		    	for (String messages : this.plugin.getConfig().getStringList("discord")) {
					  String replaced=messages.replace("{PLAYER}", player.getName());
					  String discord = PlaceholderAPI.setPlaceholders(player, ChatColor.translateAlternateColorCodes('&', replaced));
			          sender.sendMessage(discord);
			    } 
		    }
		}
	return true;
	}
}