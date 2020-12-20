package co.uk.chisdealhd.customplugin;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import co.uk.chisdealhd.customplugin.commands.*;
import co.uk.chisdealhd.customplugin.commandtab.*;

public class ChisdealHDPlugin extends JavaPlugin implements Listener {
  
  public void onEnable() {
	Bukkit.getServer().getLogger().info("---------------------------------------");
	Bukkit.getServer().getLogger().info("      ChisdealHDYT Plugin [ENABLED]      ");
	Bukkit.getServer().getLogger().info("           Author: ChisdealHDYT          ");
	Bukkit.getServer().getLogger().info("        Made by ChisdealHD#7172        ");
	Bukkit.getServer().getLogger().info("     http://twitch.tv/chisdealhdyt     ");
	Bukkit.getServer().getLogger().info("        http://chisdealhd.co.uk        ");
	Bukkit.getServer().getLogger().info("---------------------------------------");
	commands();
	tabcomplete();
    if (!getDataFolder().exists()) {
      saveDefaultConfig();
      getConfig().options().copyDefaults(true);
    } 
	File configFile = new File(this.getDataFolder(), "config.yml");
    if (configFile.exists() == false) {
      saveDefaultConfig();
      getConfig().options().copyDefaults(true);
    } 
  }
  
  public void onDisable() {
	    Bukkit.getServer().getLogger().info("---------------------------------------");
	    Bukkit.getServer().getLogger().info("     ChisdealHDYT Plugin [DISABLED]      ");
	    Bukkit.getServer().getLogger().info("           Author: ChisdealHDYT          ");
	    Bukkit.getServer().getLogger().info("        Made by ChisdealHD#7172        ");
	    Bukkit.getServer().getLogger().info("     http://twitch.tv/chisdealhdyt     ");
	    Bukkit.getServer().getLogger().info("        http://chisdealhd.co.uk        ");
	    Bukkit.getServer().getLogger().info("---------------------------------------");
  }
  
  public void commands() {
	getCommand("perks").setExecutor((CommandExecutor)new perks(this));
	getCommand("reload-chisdealhdyt").setExecutor((CommandExecutor)new reload(this));
	getCommand("stream").setExecutor((CommandExecutor)new stream());  
	getCommand("rawr").setExecutor((CommandExecutor)new rawr(this));  
	getCommand("uwu").setExecutor((CommandExecutor)new uwu(this));  
	getCommand("communitystream").setExecutor((CommandExecutor)new communitystream());
	getCommand("discord").setExecutor((CommandExecutor)new discord(this));
	getCommand("headpats").setExecutor((CommandExecutor)new headpats(this));
  }

  public void tabcomplete() {
	getCommand("stream").setTabCompleter(new streamtab());
  }
  
  
}