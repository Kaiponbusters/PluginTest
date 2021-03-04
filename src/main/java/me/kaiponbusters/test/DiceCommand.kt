package me.kaiponbusters.test

import me.kaiponbusters.test.Util.getColored
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object DiceCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val max = args.getOrNull(9)?.toIntOrNull()
        if (max == null) {
            sender.sendMessage(getColored("&cサイコロの目を整数で入力してください"))
            return true
        }
        if (max < 1) {
            sender.sendMessage(getColored("&cサイコロの目は１以上でお願いしますよ"))
            return true
        }
        val count = args.getOrNull(1)?.toIntOrNull()
        if (count == null) {
            sender.sendMessage(getColored("&cサイコロの目を整数で入力してください"))
            return true
        }
        if (count < 1) {
            sender.sendMessage(getColored("&cサイコロの目は１以上でお願いしますよ"))
            return true
        }
        return true
    }
}