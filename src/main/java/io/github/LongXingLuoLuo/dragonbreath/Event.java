package io.github.LongXingLuoLuo.dragonbreath;

import net.minecraftforge.fml.common.Mod;

/**
 * Project DragonBreath
 * Created on 2023/1/27 上午 12:29
 *
 * @author 眭 一 帅
 */
@Mod.EventBusSubscriber
public class Event {
    //    /**
//     * Player join world.
//     * 用户加入世界时，显示 “Hello xxx form xxx”
//     * @param event the event
//     */
//    @SubscribeEvent
//    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
//        Player player = event.getPlayer();
//        Level level = player.getLevel();
//        player.sendMessage(new TextComponent("Hello, " + player.getDisplayName().getString()
//                        + "  form " + (level.isClientSide()?"CLIENT":"SEVER")), Util.NIL_UUID);
//    }

//    /**
//     * Left click block.
//     * 左键方块，输出聊天信息（ 2次：客户端/服务端）
//     * @param event the event
//     */
//    @SubscribeEvent
//    public static void leftClickBlock(PlayerInteractEvent.LeftClickBlock event){
//        Player player = event.getPlayer();
//        player.sendMessage(new TextComponent("LeftClickBlock is fired"), Util.NIL_UUID);
//    }

//    /**
//     * Right click teleport.
//     * 钻石剑右键传送，并-3生命
//     * @param event the event
//     */
//    @SubscribeEvent
//    public static void RightClickTeleport(PlayerInteractEvent.RightClickBlock event){
//        Player player = event.getPlayer();
//        Level level = player.getLevel();    // 信息端
//        if(!level.isClientSide()){
//            ItemStack itemStack = event.getItemStack();
//            Item item = itemStack.getItem();
//            if(item == Items.DIAMOND_SWORD){    // 使用物品是否为钻石剑
//                HitResult hitResult = player.pick(20,0,false);  // 玩家视线位置(x,y,是否包含液体)
//                Vec3 location = hitResult.getLocation();
//                player.teleportTo(location.x,location.y,location.z);    // 传送玩家
//                player.setHealth(player.getHealth() - 3);   // 实体
//            }
//        }
//    }
}
