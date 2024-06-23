package org.siscode.kawaflora.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;
import org.siscode.kawaflora.KawaFlora;

public class ModBlocks {
    //ROSE//
    public static final Block CLASSIC_ROSE = registerBlock("classic_rose",
            new FlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_ROSE = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_classic_rose"),
            new FlowerPotBlock(CLASSIC_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    //CYAN ROSE//
    public static final Block CYAN_ROSE = registerBlock("cyan_rose",
            new FlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_CYAN_ROSE = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_cyan_rose"),
            new FlowerPotBlock(CYAN_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    //LEADWORT//
    public static final Block LEADWORT = registerBlock("cape_leadwort",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    //FORGETMENOT//
    public static final Block FORGETNOT = registerBlock("forget_me_not.json",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(KawaFlora.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){

    }
}
