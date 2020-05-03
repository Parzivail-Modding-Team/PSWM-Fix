package com.github.kb1000.pswmfix;

import com.github.kb1000.pswmfix.blocks.BlockCrystalOre;
import com.parzivail.pswm.StarWarsItems;
import com.parzivail.pswm.StarWarsMod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

import java.util.Locale;

@Mod(modid = "pswmfix", version = "1.4.1", dependencies = "required-after:starwarsmod", name = "PSWM-Fix", acceptedMinecraftVersions = "[1.7.10]", certificateFingerprint = "8963f7dbea11ab8838eafb2d2e64dcb78d774997")
public class PSWMFix {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        final int[] colorMapping = BlockCrystalOre.crystalColor;
        String[] oreColors = BlockCrystalOre.colors;
        int oreColorsLength = oreColors.length;
        String[] crystalColors = StarWarsItems.lightsaberCrystal.colors;
        int crystalColorsLength = crystalColors.length;
        for (int oreNumber = 0; oreNumber < oreColorsLength; oreNumber++) {
            String oreColor = oreColors[oreNumber].toLowerCase(Locale.ROOT);
            for (int crystalNumber = 0; crystalNumber < crystalColorsLength; crystalNumber++) {
                if (oreColor.equals(crystalColors[crystalNumber])) {
                    colorMapping[oreNumber] = crystalNumber;
                }
            }
        }
        StarWarsMod.blockStaticNpcBartender.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcCorellian.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcEmpireEndorQuartermaster.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcImperialCody.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcImperialDaala.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcImperialFurgan.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcImperialVeers.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcJawaQuartermaster.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcMerchant.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcObiWan.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcRebelCarlist.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcRebelDreis.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcRebelRex.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcRebelTantor.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcRebelYavinQuartermaster.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcRecruiterEmpire.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcRecruiterRebel.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcSith.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcWeaponsDealer.setBlockUnbreakable().setResistance(6000000.0F);
        StarWarsMod.blockStaticNpcYoda.setBlockUnbreakable().setResistance(6000000.0F);
    }
}
