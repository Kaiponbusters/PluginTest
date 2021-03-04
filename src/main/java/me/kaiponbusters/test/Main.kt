package me.kaiponbusters.test

import org.bukkit.command.CommandExecutor
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(EventListener, this)
        logger.info("プラグインが起動！")
        registerCommand("hello", HelloCommand)
        registerCommand("head", GetHeadCommand)
    }
        override fun onDisable() {
            logger.info("プラグインが停止！")
        }
    private fun registerCommand(label: String, executor: CommandExecutor) {
        val command = getCommand(label)
        if (command != null) {
            command.setExecutor(executor)
            logger.info("/$label を登録しました")
        } else {
            logger.severe("/$label を登録できませんでした")
        }
    }
}
