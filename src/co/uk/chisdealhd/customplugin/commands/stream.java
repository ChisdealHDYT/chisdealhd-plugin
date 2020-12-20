package co.uk.chisdealhd.customplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import co.uk.chisdealhd.customplugin.apis.StreamTwitchAPI;
import co.uk.chisdealhd.customplugin.apis.StreamTrovoAPI;
import co.uk.chisdealhd.customplugin.apis.StreamDliveAPI;
import co.uk.chisdealhd.customplugin.apis.StreamVimmTVAPI;
import co.uk.chisdealhd.customplugin.apis.StreamThetaTVAPI;

public class stream implements CommandExecutor {
	  public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		  if (command.getName().equalsIgnoreCase("stream")) {
		      if (args.length == 0) {
		        sender.sendMessage(ChatColor.GOLD + "/stream [platform] <username/id>: Checks for Online on that platform.");
		        return true;
		      } 
		      if (args[0].equalsIgnoreCase("twitch")) {
		        if (args.length == 1) {
		          sender.sendMessage(ChatColor.DARK_PURPLE + "[Twitch] " + ChatColor.RED + "You must enter a username.");
		          return true;
		        } 
		        String message = "";
		        for (int i = 1; i < args.length; i++)
		          message = String.valueOf(message) + args[i] + " "; 
		        message = message.trim();
		        StreamTwitchAPI streamarg = new StreamTwitchAPI(message, args);
		        if (streamarg.isOnline()) {
		          Bukkit.getServer().getLogger().info("[Twitch] " + message + " now ONLINE!");
		          sender.sendMessage(ChatColor.DARK_PURPLE + "[Twitch] " + ChatColor.GREEN + message + " now ONLINE!");
		        } else {
		          Bukkit.getServer().getLogger().info("[Twitch] " + message + " Offline!");
		          sender.sendMessage(ChatColor.DARK_PURPLE + "[Twitch] " + ChatColor.RED + message + " Offline!");
		        } 
		      }  else if (args[0].equalsIgnoreCase("thetatv")) {
			        if (args.length == 1) {
				          sender.sendMessage(ChatColor.BLUE + "[ThetaTV] " + ChatColor.RED + "You must enter a username.");
				          return true;
				        } 
				        String message = "";
				        for (int i = 1; i < args.length; i++)
				          message = String.valueOf(message) + args[i] + " "; 
				        message = message.trim();
				        StreamThetaTVAPI streamarg = new StreamThetaTVAPI(message, args);
				        if (streamarg.isOnline()) {
				          Bukkit.getServer().getLogger().info("[ThetaTV] " + message + " now ONLINE!");
				          sender.sendMessage(ChatColor.BLUE + "[ThetaTV] " + ChatColor.GREEN + message + " now ONLINE!");
				        } else {
				          Bukkit.getServer().getLogger().info("[ThetaTV] " + message + " Offline!");
				          sender.sendMessage(ChatColor.BLUE + "[ThetaTV] " + ChatColor.RED + message + " Offline!");
				        } 
				      } else if (args[0].equalsIgnoreCase("dlive")) {
		        if (args.length == 1) {
		          sender.sendMessage(ChatColor.YELLOW + "[Dlive] " + ChatColor.RED + "You must enter a username.");
		          return true;
		        } 
		        String message = "";
		        for (int i = 1; i < args.length; i++)
		          message = String.valueOf(message) + args[i] + " "; 
		        message = message.trim();
		        StreamDliveAPI streamarg = new StreamDliveAPI(message, args);
		        if (streamarg.isOnline()) {
		          Bukkit.getServer().getLogger().info("[Dlive] " + message + " now ONLINE!");
		          sender.sendMessage(ChatColor.YELLOW + "[Dlive] " + ChatColor.GREEN + message + " now ONLINE!");
		        } else {
		          Bukkit.getServer().getLogger().info("[Dlive] " + message + " Offline!");
		          sender.sendMessage(ChatColor.YELLOW + "[Dlive] " + ChatColor.RED + message + " Offline!");
		        } 
		      } else if (args[0].equalsIgnoreCase("vimmtv")) {
		        if (args.length == 1) {
		          sender.sendMessage(ChatColor.DARK_GREEN + "[VimmTV] " + ChatColor.RED + "You must enter a username.");
		          return true;
		        } 
		        String message = "";
		        for (int i = 1; i < args.length; i++)
		          message = String.valueOf(message) + args[i] + " "; 
		        message = message.trim();
		        StreamVimmTVAPI streamarg = new StreamVimmTVAPI(message, args);
		        if (streamarg.isOnline()) {
		          Bukkit.getServer().getLogger().info("[VimmTV] " + message + " now ONLINE!");
		          sender.sendMessage(ChatColor.DARK_GREEN + "[VimmTV] " + ChatColor.GREEN + message + " now ONLINE!");
		        } else {
		          Bukkit.getServer().getLogger().info("[VimmTV] " + message + " Offline!");
		          sender.sendMessage(ChatColor.DARK_GREEN + "[VimmTV] " + ChatColor.RED + message + " Offline!");
		        } 
		      } else if (args[0].equalsIgnoreCase("trovo")) {
		        if (args.length == 1) {
		          sender.sendMessage(ChatColor.AQUA + "[Trovo] " + ChatColor.RED + "You must enter a username.");
		          return true;
		        } 
		        String message = "";
		        for (int i = 1; i < args.length; i++)
		          message = String.valueOf(message) + args[i] + " "; 
		        message = message.trim();
		        StreamTrovoAPI streamarg = new StreamTrovoAPI(message, args);
		        if (streamarg.isOnline()) {
		          Bukkit.getServer().getLogger().info("[Trovo] " + message + " now ONLINE!");
		          sender.sendMessage(ChatColor.AQUA + "[Trovo] " + ChatColor.GREEN + message + " now ONLINE!");
		        } else {
		          Bukkit.getServer().getLogger().info("[Trovo] " + message + " Offline!");
		          sender.sendMessage(ChatColor.AQUA + "[Trovo] " + ChatColor.RED + message + " Offline!");
		        } 
		      } else {
		        sender.sendMessage(ChatColor.RED + "Invalid operation.");
		      } 
		    } 
		    return true;
		  }
}
