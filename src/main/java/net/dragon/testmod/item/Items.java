package net.dragon.testmod.item;

import net.dragon.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> BALL = ITEMS.register("ball",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> SQUARE = ITEMS.register("square",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus event) {
        ITEMS.register(event);

    }
}
