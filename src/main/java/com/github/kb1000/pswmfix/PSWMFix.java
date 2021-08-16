package com.github.kb1000.pswmfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;

@Mod(modid = "pswmfix", version = "1.5.0", dependencies = "required-after:starwarsmod@[1.3.5,)", name = "PSWM-Fix", acceptedMinecraftVersions = "[1.7.10]")
public class PSWMFix {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogManager.getLogger("PSWM-Fix").error("PSWM-Fix is deprecated and has been merged into Parzi's Star Wars Mod. Please remove it.");
    }
}
