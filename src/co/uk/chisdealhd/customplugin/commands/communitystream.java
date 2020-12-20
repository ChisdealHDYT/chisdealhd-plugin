package co.uk.chisdealhd.customplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import co.uk.chisdealhd.customplugin.apis.StreamTwitchAPI;
import co.uk.chisdealhd.customplugin.apis.StreamTrovoAPI;
import co.uk.chisdealhd.customplugin.apis.StreamDliveAPI;
import co.uk.chisdealhd.customplugin.apis.StreamVimmTVAPI;


public class communitystream implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
	if (command.getName().equalsIgnoreCase("communitystream")) {
	      StreamTwitchAPI streamtwitch = new StreamTwitchAPI("alloyxuast", args);
	      if (streamtwitch.isOnline()) {
	        sender.sendMessage(ChatColor.DARK_PURPLE + "[Twitch] " + ChatColor.GREEN + "AlloyXuast now ONLINE!");
	      } else {
	        sender.sendMessage(ChatColor.DARK_PURPLE + "[Twitch] " + ChatColor.RED + "AlloyXuast Offline!");
	      } 
	      StreamDliveAPI streamdlive = new StreamDliveAPI("ChisdealHDYT", args);
	      if (streamdlive.isOnline()) {
	        sender.sendMessage(ChatColor.YELLOW + "[Dlive] " + ChatColor.GREEN + "ChisdealHDYT now ONLINE!");
	      } else {
	        sender.sendMessage(ChatColor.YELLOW + "[Dlive] " + ChatColor.RED + "ChisdealHDYT Offline!");
	      } 
	      StreamVimmTVAPI streamvimm = new StreamVimmTVAPI("chisdealhd", args);
	      if (streamvimm.isOnline()) {
	        sender.sendMessage(ChatColor.DARK_GREEN + "[VimmTV] " + ChatColor.GREEN + "chisdealhd now ONLINE!");
	      } else {
	        sender.sendMessage(ChatColor.DARK_GREEN + "[VimmTV] " + ChatColor.RED + "chisdealhd Offline!");
	      } 
	      StreamTrovoAPI streamtrovo = new StreamTrovoAPI("alloyxuast", args);
	      if (streamtrovo.isOnline()) {
	        sender.sendMessage(ChatColor.AQUA + "[Trovo] " + ChatColor.GREEN + "AlloyXuast now ONLINE!");
	      } else {
	        sender.sendMessage(ChatColor.AQUA + "[Trovo] " + ChatColor.RED + "AlloyXuast Offline!");
	      } 
	    }
	return true;
	}
}
