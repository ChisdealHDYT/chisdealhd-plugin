package co.uk.chisdealhd.customplugin.commands;

import co.uk.chisdealhd.customplugin.ChisdealHDPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rawr implements CommandExecutor {
    ChisdealHDPlugin plugin;
    public rawr(ChisdealHDPlugin instance)
    {
        plugin = instance;
    }
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		if (command.getName().equalsIgnoreCase("rawr")) {
		    if (sender instanceof Player) {
	        if (args.length == 0) {
		        Player player = (Player)sender;
		        player.playSound(player.getLocation(), Sound.ENTITY_CAT_PURR, 1.0F, 1.0F);
			      player.sendMessage(ChatColor.AQUA + "[CHISPlugin] " + ChatColor.GREEN + sender.getName() + " just RAWR YOU!");
		          sender.sendMessage("Rawr sent to " + player.getName());
		      } else if (args.length > 0) {
		    	  if (Bukkit.getServer().getPlayer(args[0])!= null) {
		    	  Player player = Bukkit.getServer().getPlayer(args[0]);
			      player.playSound(player.getLocation(), Sound.ENTITY_CAT_PURR, 1.0F, 1.0F);
			      player.sendMessage(ChatColor.AQUA + "[CHISPlugin] " + ChatColor.GREEN + sender.getName() + " just RAWR YOU!");
		          sender.sendMessage("Rawr sent to " + player.getName());
			    } else sender.sendMessage("Player not found");
		      }
		    }
		}
	return true;
	}
}
