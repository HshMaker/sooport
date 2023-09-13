package io.github.hshmaker.sooport.effect;

import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

/**
 * 폭죽 소환을 도와주는 인터페이스입니다.
 */
public interface FireworkSupport {
    /**
     * 이 함수는 폭죽을 소환합니다.
     * @param x x좌표
     * @param y y좌표
     * @param z z좌표
     * @param world 속한 월드
     * @param effect 폭죽효과
     */
    void spawnFirework(Double x, Double y, Double z, World world, FireworkEffect effect);

    /**
     * 이 함수는 폭죽을 소환합니다.
     * @param loc 좌표
     * @param effect 폭죽효과
     */
    void spawnFirework(@NotNull Location loc, FireworkEffect effect);
}
