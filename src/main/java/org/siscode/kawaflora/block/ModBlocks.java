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
    public static final Block FORGETNOT = registerBlock("forget_me_not",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    //CHRYSANTHEMUMS
    public static final Block WHITE_CHRYSANTHEMUM = registerBlock("white_chrysanthemum",
            new FlowerBlock(StatusEffects.SLOW_FALLING,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_WHITE_CHRYSANTHEMUM  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_white_chrysanthemum"),
            new FlowerPotBlock(WHITE_CHRYSANTHEMUM , FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block PINK_CHRYSANTHEMUM = registerBlock("pink_chrysanthemum",
            new FlowerBlock(StatusEffects.SLOW_FALLING,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_CHRYSANTHEMUM  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_pink_chrysanthemum"),
            new FlowerPotBlock(WHITE_CHRYSANTHEMUM , FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block YELLOW_CHRYSANTHEMUM = registerBlock("yellow_chrysanthemum",
            new FlowerBlock(StatusEffects.SLOW_FALLING,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_CHRYSANTHEMUM  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_yellow_chrysanthemum"),
            new FlowerPotBlock(WHITE_CHRYSANTHEMUM , FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    //

    // COCKSCOMBS

    public static final Block RED_COCKSCOMB = registerBlock("red_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_RED_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_red_cockscomb"),
            new FlowerPotBlock(RED_COCKSCOMB , FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block YELLOW_COCKSCOMB = registerBlock("yellow_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_yellow_cockscomb"),
            new FlowerPotBlock(YELLOW_COCKSCOMB , FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block PURPLE_COCKSCOMB = registerBlock("purple_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_purple_cockscomb"),
            new FlowerPotBlock(PURPLE_COCKSCOMB , FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    //
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
