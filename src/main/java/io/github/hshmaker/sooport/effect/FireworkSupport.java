/*
MIT License

Copyright (c) 2023 HshMaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

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
    void spawnFirework(@NotNull Double x, @NotNull Double y, @NotNull Double z, @NotNull World world, @NotNull FireworkEffect effect);

    /**
     * 이 함수는 폭죽을 소환합니다.
     * @param loc 좌표
     * @param effect 폭죽효과
     */
    void spawnFirework(@NotNull Location loc, @NotNull FireworkEffect effect);
}
