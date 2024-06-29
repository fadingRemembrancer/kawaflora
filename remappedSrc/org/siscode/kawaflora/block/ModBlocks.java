package org.siscode.kawaflora.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;
import org.siscode.kawaflora.KawaFlora;

public class ModBlocks {
    //ROSE//
    public static final Block CLASSIC_ROSE = registerBlock("classic_rose",
            new FlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_ROSE = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_classic_rose"),
            new FlowerPotBlock(CLASSIC_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    //CYAN ROSE//
    public static final Block CYAN_ROSE = registerBlock("cyan_rose",
            new FlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_CYAN_ROSE = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_cyan_rose"),
            new FlowerPotBlock(CYAN_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    //LEADWORT//
    public static final Block LEADWORT = registerBlock("cape_leadwort",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    //FORGETMENOT//
    public static final Block FORGETNOT = registerBlock("forget_me_not",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC).nonOpaque().noCollision()));
    //CHRYSANTHEMUMS
    public static final Block WHITE_CHRYSANTHEMUM = registerBlock("white_chrysanthemum",
            new FlowerBlock(StatusEffects.SLOW_FALLING,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_WHITE_CHRYSANTHEMUM  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_white_chrysanthemum"),
            new FlowerPotBlock(WHITE_CHRYSANTHEMUM , AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));

    public static final Block PINK_CHRYSANTHEMUM = registerBlock("pink_chrysanthemum",
            new FlowerBlock(StatusEffects.SLOW_FALLING,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_CHRYSANTHEMUM  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_pink_chrysanthemum"),
            new FlowerPotBlock(PINK_CHRYSANTHEMUM , AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));

    public static final Block YELLOW_CHRYSANTHEMUM = registerBlock("yellow_chrysanthemum",
            new FlowerBlock(StatusEffects.SLOW_FALLING,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_CHRYSANTHEMUM  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_yellow_chrysanthemum"),
            new FlowerPotBlock(YELLOW_CHRYSANTHEMUM , AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    //

    // COCKSCOMBS

    public static final Block RED_COCKSCOMB = registerBlock("red_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_RED_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_red_cockscomb"),
            new FlowerPotBlock(RED_COCKSCOMB , AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));

    public static final Block YELLOW_COCKSCOMB = registerBlock("yellow_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_yellow_cockscomb"),
            new FlowerPotBlock(YELLOW_COCKSCOMB , AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque().noCollision()));

    public static final Block PURPLE_COCKSCOMB = registerBlock("purple_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_purple_cockscomb"),
            new FlowerPotBlock(PURPLE_COCKSCOMB , AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));

    public static final Block PINK_COCKSCOMB = registerBlock("pink_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_pink_cockscomb"),
            new FlowerPotBlock(PINK_COCKSCOMB , AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));

    public static final Block SILVER_COCKSCOMB = registerBlock("silver_cockscomb",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_SILVER_COCKSCOMB  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_silver_cockscomb"),
            new FlowerPotBlock(SILVER_COCKSCOMB , AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));


    //

    // MISC
    public static final Block BIRD_PARADISE= registerBlock("bird_of_paradise",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_BIRD_PARADISE  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_bird_paradise"),
            new FlowerPotBlock(BIRD_PARADISE, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block FALSE_SHAMROCK= registerBlock("false_shamrock",
            new FlowerBlock(StatusEffects.ABSORPTION,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_FALSE_SHAMROCK  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_false_shamrock"),
            new FlowerPotBlock(FALSE_SHAMROCK, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block HIDRANGEA= registerBlock("hidrangea",
            new FlowerBlock(StatusEffects.POISON,1,
                    AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_HIDRANGEA  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_hidrangea"),
            new FlowerPotBlock(HIDRANGEA, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block WEIGELA= registerBlock("weigela",
            new FlowerBlock(StatusEffects.HEALTH_BOOST,1,
                    AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_WEIGELA  = Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, "potted_weigela"),
            new FlowerPotBlock(WEIGELA, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).nonOpaque()));
    ;

    //
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KawaFlora.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(KawaFlora.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){

    }
}
