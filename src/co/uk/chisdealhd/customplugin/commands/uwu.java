package co.uk.chisdealhd.customplugin.commands;

import co.uk.chisdealhd.customplugin.ChisdealHDPlugin;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import co.uk.chisdealhd.customplugin.apis.TitleAPI;

public class uwu implements CommandExecutor {
    ChisdealHDPlugin plugin;
    public uwu(ChisdealHDPlugin instance)
    {
        plugin = instance;
    }
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		if (command.getName().equalsIgnoreCase("uwu")) {
		    if (sender instanceof Player) {
	        if (args.length == 0) {
		        Player player = (Player)sender;
			      TitleAPI.sendTitle(player, Integer.valueOf(30), Integer.valueOf(20), Integer.valueOf(40), "UwU");
			      TitleAPI.sendSubtitle(player, Integer.valueOf(30), Integer.valueOf(20), Integer.valueOf(40), "§aSent by " + sender.getName());
		          sender.sendMessage("UwU sent to " + player.getName());
		      } else if (args.length > 0) {
		    	  if (Bukkit.getServer().getPlayer(args[0])!= null) {
		    	  Player player = Bukkit.getServer().getPlayer(args[0]);
			      TitleAPI.sendTitle(player, Integer.valueOf(30), Integer.valueOf(20), Integer.valueOf(40), "UwU");
			      TitleAPI.sendSubtitle(player, Integer.valueOf(30), Integer.valueOf(20), Integer.valueOf(40), "§aSent by " + sender.getName());
		          sender.sendMessage("UwU sent to " + player.getName());
			    } else sender.sendMessage("Player not found");
		      }
		    }
		}
	return true;
	}
}
