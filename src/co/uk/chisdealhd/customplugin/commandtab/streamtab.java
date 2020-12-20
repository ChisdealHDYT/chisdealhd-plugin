package co.uk.chisdealhd.customplugin.commandtab;

import java.util.List;
import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class streamtab implements TabCompleter {
	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
		  if (args.length == 1) {
			  List<String> platforms = new ArrayList<>();
			  	platforms.add("Twitch");
			  	platforms.add("Trovo");
			  	platforms.add("Dlive");
			  	platforms.add("VimmTV");
			  	platforms.add("ThetaTV");
			  return platforms;
		  }
		return null;
	}
}
