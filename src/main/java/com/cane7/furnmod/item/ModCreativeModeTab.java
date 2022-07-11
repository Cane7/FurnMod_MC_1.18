package com.cane7.furnmod.item;

import com.cane7.furnmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FURNMOD_TAB = new CreativeModeTab("furnmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FURN_WOOD .get());
        }
    };
}
