package deathseeker512.tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import deathseeker512.tutorial.blocks.TutorialBlock;

public class BlockHandler {
    public static Block tutorialBlock;

    public static void configureBlocks(Configuration config) {
        tutorialBlock = new TutorialBlock(config.get("Blocks", "Tutorial Block", 3000).getInt(), Material.rock).setUnlocalizedName("tutorialBlock").setCreativeTab(CreativeTabs.tabBlock);
    }

    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(tutorialBlock, "tutorialBlock");
    }

    public static void setNames(LanguageRegistry registry) {
        registry.addName(tutorialBlock, "Tutorial Block");
    }
}
