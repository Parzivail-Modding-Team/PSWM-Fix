package com.github.kb1000.pswmfix.blocks;

import com.parzivail.pswm.StarWarsItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCrystalOre extends com.parzivail.pswm.blocks.BlockCrystalOre {
    public static int[] crystalColor = new int[BlockCrystalOre.colors.length];

    @Override
    public Item getItemDropped(int meta, Random random, int fortune)
    {
        return StarWarsItems.lightsaberCrystal;
    }

    @Override
    public int damageDropped(int meta)
    {
        return crystalColor[meta];
    }
}
