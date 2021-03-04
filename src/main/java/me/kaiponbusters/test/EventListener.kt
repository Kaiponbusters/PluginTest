package me.kaiponbusters.test

import me.kaiponbusters.test.Util.getColored
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

object EventListener: Listener {
    @EventHandler
    fun on(e: PlayerJoinEvent) {
        val p = e.player
        e.joinMessage = getColored("&b${p.displayName}&fがサーバーに入りました")
    }
    @EventHandler
    fun on(e: PlayerQuitEvent) {
        val p = e.player
        e.quitMessage = getColored("&b${p.displayName}&fがサーバーから退出しました")
    }
}