package republicaEternityEventIII.republica.devteam;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;

public class SoundEffectsManager {
	public static void playSpawnSound(Location place) {
		World world = place.getWorld();
		world.playSound(place, Sound.ENDERDRAGON_DEATH, 10, 1);
	}
}
