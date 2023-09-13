package io.github.hshmaker.sooport;

import io.github.hshmaker.sooport.effect.FireworkSupport;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;
import org.jetbrains.annotations.NotNull;

/**
 * 메인 클래스입니다. SOOOOPORT  !!
 * @author HshMaker
 * @version 0.0.9
 */
public class Sooport implements FireworkSupport {

    @Override
    public void spawnFirework(@NotNull Double x, @NotNull Double y, @NotNull Double z, @NotNull World world, @NotNull FireworkEffect effect) {
        Location loc = new Location(world, x, y, z);
        Firework firework = loc.getWorld().spawn(loc, Firework.class);
        FireworkMeta fireworkMeta = firework.getFireworkMeta();
        fireworkMeta.addEffect(effect);
        fireworkMeta.setPower(0);
        firework.setFireworkMeta(fireworkMeta);
        firework.setTicksToDetonate(0);
    }

    @Override
    public void spawnFirework(@NotNull Location loc, @NotNull FireworkEffect effect) {
        spawnFirework(loc.x(), loc.y(), loc.z(), loc.getWorld(), effect);
    }
}
