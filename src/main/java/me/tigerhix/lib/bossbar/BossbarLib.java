package me.tigerhix.lib.bossbar;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * Bossbar API main class.
 * 
 * @author A248
 *
 */
public interface BossbarLib {

	/**
	 * Instantiates the library from a plugin instance. <br>
	 * Programmers only need 1 library instance.
	 * 
	 * @param instance the plugin to use
	 * @return the library instance
	 */
	static BossbarLib createFor(Plugin instance) {
	    return new WitherBossbarHandler(instance);
	}
	
    /**
     * Returns the bossbar of a player. If the player does not have a bossbar, a new instance will be created and returned.
     *
     * @param player player
     * @return bossbar
     */
    Bossbar getBossbar(Player player);

    /**
     * Returns either the player already has a bossbar.
     *
     * @param player player
     * @return availability of bossbar
     */
    boolean hasBossbar(Player player);

    /**
     * Send the bossbar to the player. If the player does not have a bossbar, no action will be performed.
     * You do not need to call this method as the implementation automatically updates the bossbar when it is changed.
     *
     * @param player player
     */
    void updateBossbar(Player player);

    /**
     * Clear and remove the bossbar of the player.
     *
     * @param player player
     */
    void clearBossbar(Player player);

}