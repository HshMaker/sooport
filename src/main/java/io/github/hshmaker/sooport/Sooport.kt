package io.github.hshmaker.sooport

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Sooport : JavaPlugin() {
    override fun onEnable() {
        logger.info("sooport is working")
    }

    override fun onDisable() {
        logger.info("sooport is not working")
    }
}
