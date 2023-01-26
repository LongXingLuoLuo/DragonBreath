package io.github.LongXingLuoLuo.dragonbreath;

import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Project forge-1.18.2-40.2.1-mdk
 * Created on 2023/1/26 下午 04:10
 *
 * @author 眭 一 帅
 */
@Mod("dragonbreath")
@Mod.EventBusSubscriber
public class DragonBreath {

    /**
     * Player join world.
     * 用户加入世界时，显示 “Hello xxx form xxx”
     * @param event the event
     */
    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getPlayer();
        Level level = player.getLevel();
        player.sendMessage(new TextComponent("Hello, " + player.getDisplayName().getString()
                        + "  form " + (level.isClientSide()?"CLIENT":"SEVER")), Util.NIL_UUID);
    }

}
