package co.uk.chisdealhd.customplugin.commands;

import co.uk.chisdealhd.customplugin.ChisdealHDPlugin;
import me.clip.placeholderapi.PlaceholderAPI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class perks implements CommandExecutor {
    ChisdealHDPlugin plugin;
    public perks(ChisdealHDPlugin instance)
    {
        plugin = instance;
    }
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
	if (command.getName().equalsIgnoreCase("perks")) {
	    if (sender instanceof Player) {
        if (args.length == 0) {
	        Player player = (Player)sender;
	        for (String messages : this.plugin.getConfig().getStringList("perks")) {
			  String replaced=messages.replace("{PLAYER}", player.getName());
			  String perks = PlaceholderAPI.setPlaceholders(player, ChatColor.translateAlternateColorCodes('&', replaced));
	          sender.sendMessage(perks);
	        } 
	      } else if (args.length > 0) {
	    	  if (Bukkit.getServer().getPlayer(args[0])!= null) {
	    	  Player player = Bukkit.getServer().getPlayer(args[0]);
		      for (String messages : this.plugin.getConfig().getStringList("perks")) {
				  String replaced=messages.replace("{PLAYER}", player.getName());
			  String perks = PlaceholderAPI.setPlaceholders(player, ChatColor.translateAlternateColorCodes('&', replaced));
			  sender.sendMessage(perks);
		      }
		    } else sender.sendMessage("Player not found");
	      }
	    }
	}
	return true;
	}
}