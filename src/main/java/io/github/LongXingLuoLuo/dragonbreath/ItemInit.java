package io.github.LongXingLuoLuo.dragonbreath;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

/**
 * Project DragonBreath
 * Created on 2023/1/27 上午 12:39
 * item 注册
 *
 * @author 眭 一 帅
 */
public class ItemInit {
    /**
     * The constant ITEMS.
     * ITEMS: 物品总线
     */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Main.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", ()->new Item(new Item.Properties().tab(Main.MOD_TAB)));


    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name,item);
    }


}
