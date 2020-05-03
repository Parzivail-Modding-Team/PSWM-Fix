package com.github.kb1000.pswmfix.blocks;

import com.parzivail.pswm.StarWarsItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockFocusingCrystalOre extends com.parzivail.pswm.blocks.ore.BlockFocusingCrystalOre {
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return StarWarsItems.focusingCrystal;
    }
}
