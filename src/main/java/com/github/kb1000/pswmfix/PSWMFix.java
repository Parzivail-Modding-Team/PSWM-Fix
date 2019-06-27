package com.github.kb1000.pswmfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

import com.parzivail.pswm.StarWarsItems;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.blocks.BlockCrystalOre;

import java.util.Locale;

@Mod(modid = "pswmfix", version = "1.4.0", dependencies = "required-after:starwarsmod", name = "PSWM-Fix", acceptedMinecraftVersions = "[1.7.10]")
public class PSWMFix
{
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		String[] oreColors = BlockCrystalOre.colors;
		int oreColorsLength = oreColors.length;
		String[] crystalColors = StarWarsItems.lightsaberCrystal.colors;
		int crystalColorsLength = crystalColors.length;
		for (int oreNumber = 0; oreNumber < oreColorsLength; oreNumber++) {
			String oreColor = oreColors[oreNumber].toLowerCase(Locale.ROOT);
			for (int crystalNumber = 0; crystalNumber < crystalColorsLength; crystalNumber++) {
				if (oreColor.equals(crystalColors[crystalNumber])) {
					GameRegistry.addSmelting(new ItemStack(StarWarsMod.blockCrystalOre, 1, oreNumber), new ItemStack(StarWarsItems.lightsaberCrystal, 1, crystalNumber), 0.2F);
				}
			}
		}
	}
}
