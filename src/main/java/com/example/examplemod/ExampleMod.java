package com.example.bigstack;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("bigstack")
public class BigStackMod {

    public static final String MODID = "bigstack";

    public BigStackMod(IEventBus modBus) {
        modBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        for (Item item : BuiltInRegistries.ITEM) {
            if (item.getDefaultMaxStackSize() > 1) {
                item.maxStackSize = Integer.MAX_VALUE;
            }
        }
    }
}
