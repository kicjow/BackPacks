package com.diamonddagger590.backpacks;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoining implements Listener {
	public static API api = API.getInstance();
	Plugin pl = Bukkit.getPluginManager().getPlugin("BackPacks");
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		api.createPlayerFile(e.getPlayer(), pl);
	}

}
