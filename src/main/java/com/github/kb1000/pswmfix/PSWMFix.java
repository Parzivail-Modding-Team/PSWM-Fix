package com.github.kb1000.pswmfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.ItemStack;

import com.parzivail.pswm.StarWarsItems;
import com.parzivail.pswm.StarWarsMod;

import java.io.File;
import java.util.Random;

@Mod(modid = "pswmfix", version = "1.4.0", dependencies = "required-after:starwarsmod")
public class PSWMFix
{
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addSmelting(StarWarsMod.blockCrystalOre, new ItemStack(StarWarsItems.lightsaberCrystal, 1), 0.2F);
	}
}
