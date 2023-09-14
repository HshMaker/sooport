package io.github.hshmaker.sooport.event;

import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

/**
 * PlayerInteract 관련 클래스입니다.
 */
public class Sooteract {

    /**
     * 플레이어가 무슨 블럭으로 무슨 행동을 했는지 쉽게 알 수 있습니다.
     * @param event PlayerInteractEvent
     * @param material material
     * @param sooAct sooAct
     */
    public void itemCheck(@NotNull PlayerInteractEvent event, @NotNull Material material, @NotNull Consumer<SooAction> sooAct) {
        if (event.getItem() != null && event.getItem().getType() == material) {
            sooAct.accept((SooAction) sooAct);
        }
    }
}


