package io.github.hshmaker.sooport.event;

import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

/**
 * PlayerInteractEvent를 도와주는 인터페이스입니다.
 */
public interface SooAction {

    /**
     * 허공을 왼쪽 클릭시 runnable 을 실행합니다.
     * @param event PlayerInteractEvent
     * @param runnable 실행할 코드
     */
    void LeftClickAir(@NotNull PlayerInteractEvent event, @NotNull Runnable runnable);

    /**
     * 블럭을 왼쪽 클릭시 runnable 을 실행합니다.
     * @param event PlayerInteractEvent
     * @param runnable 실행할 코드
     */
    void LeftClickBlock(@NotNull PlayerInteractEvent event, @NotNull Runnable runnable);

    /**
     * 허공을 오른쪽 클릭시 runnable 을 실행합니다.
     * @param event PlayerInteractEvent
     * @param runnable 실행할 코드
     */
    void RightClickAir(@NotNull PlayerInteractEvent event, @NotNull Runnable runnable);

    /**
     * 블럭을 오른쪽 클릭시 runnable 을 실행합니다.
     * @param event PlayerInteractEvent
     * @param runnable 실행할 코드
     */
    void RightClickBlock(@NotNull PlayerInteractEvent event, @NotNull Runnable runnable);

}


