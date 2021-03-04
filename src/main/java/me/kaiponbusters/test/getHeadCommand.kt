@file:Suppress("DEPRECATION")

package me.kaiponbusters.test

import me.kaiponbusters.test.Util.getColored
import me.kaiponbusters.test.Util.getPlayerHead
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object GetHeadCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (0 < args.size) {
                val id = args[0]
                val player = Bukkit.getOfflinePlayer(id)
                val head = getPlayerHead(player)
                sender.inventory.addItem(head)
                sender.sendMessage(getColored("&b${player.name} &fの頭を取得しました"))
            }
        } else {
            sender.sendMessage(getColored("&cプレイヤーからのみ実施できるコマンドです"))
        }
        return true
    }

}