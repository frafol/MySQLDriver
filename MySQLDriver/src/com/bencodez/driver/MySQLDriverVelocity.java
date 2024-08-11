package com.bencodez.mysqldriver;

import java.util.logging.Logger;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.PluginDescription;
import java.util.List;
import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

@Plugin(id = "mysqldriver-frafol", name = "MySQLDriver-frafol", version = "1.0", description = "Plugin containg mysql driver for velocity, fork of MySQLDriver by BenCodez", authors = {"BenCodez" , "frafol" })
public class MySQLDriverVelocity {

	@Inject
	public MySQLDriverVelocity() {}

	@Subscribe
	public void onProxyInitialization(ProxyInitializeEvent event) {}
}
