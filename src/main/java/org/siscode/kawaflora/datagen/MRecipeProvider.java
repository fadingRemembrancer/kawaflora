package org.siscode.kawaflora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;

import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;

import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.siscode.kawaflora.KawaFlora;
import org.siscode.kawaflora.block.ModBlocks;


import java.util.concurrent.CompletableFuture;

import static net.minecraft.item.Items.*;


public class MRecipeProvider extends FabricRecipeProvider {
    public MRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // MISC
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, CYAN_DYE,1).input(ModBlocks.CYAN_ROSE).criterion(FabricRecipeProvider.hasItem(CYAN_DYE),
                FabricRecipeProvider.conditionsFromItem(CYAN_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.CYAN_ROSE),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.CYAN_ROSE)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "cyan_rose_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, RED_DYE,1).input(ModBlocks.CLASSIC_ROSE).criterion(FabricRecipeProvider.hasItem(RED_DYE),
                FabricRecipeProvider.conditionsFromItem(RED_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.CLASSIC_ROSE),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.CLASSIC_ROSE)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "classic_rose_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, YELLOW_DYE,1).input(ModBlocks.BIRD_PARADISE).criterion(FabricRecipeProvider.hasItem(YELLOW_DYE),
                FabricRecipeProvider.conditionsFromItem(YELLOW_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.BIRD_PARADISE),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.BIRD_PARADISE)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "bird_paradise_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LIGHT_BLUE_DYE,2).input(ModBlocks.FORGETNOT).criterion(FabricRecipeProvider.hasItem(LIGHT_BLUE_DYE),
                FabricRecipeProvider.conditionsFromItem(LIGHT_BLUE_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.FORGETNOT),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.FORGETNOT)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "forget_me_not_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LIGHT_BLUE_DYE,2).input(ModBlocks.HIDRANGEA).criterion(FabricRecipeProvider.hasItem(BLUE_DYE),
                FabricRecipeProvider.conditionsFromItem(BLUE_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.HIDRANGEA),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.HIDRANGEA)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "hidrangea_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, RED_DYE,2).input(ModBlocks.WEIGELA).criterion(FabricRecipeProvider.hasItem(RED_DYE),
                FabricRecipeProvider.conditionsFromItem(RED_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.WEIGELA),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.WEIGELA)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "weigela_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LIGHT_BLUE_DYE,2).input(ModBlocks.LEADWORT).criterion(FabricRecipeProvider.hasItem(BLUE_DYE),
                FabricRecipeProvider.conditionsFromItem(BLUE_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.LEADWORT),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.LEADWORT)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "leadwort_dye"));


        //Chrysanthemum recipes
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, WHITE_DYE,1).input(ModBlocks.WHITE_CHRYSANTHEMUM).criterion(FabricRecipeProvider.hasItem(WHITE_DYE),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_CHRYSANTHEMUM)).criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_CHRYSANTHEMUM),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_CHRYSANTHEMUM)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "chrysanthemum_white_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, PINK_DYE,1).input(ModBlocks.PINK_CHRYSANTHEMUM).criterion(FabricRecipeProvider.hasItem(PINK_DYE),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.PINK_CHRYSANTHEMUM)).criterion(FabricRecipeProvider.hasItem(ModBlocks.PINK_CHRYSANTHEMUM),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.PINK_CHRYSANTHEMUM)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "chrysanthemum_pink_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, YELLOW_DYE,1).input(ModBlocks.YELLOW_CHRYSANTHEMUM).criterion(FabricRecipeProvider.hasItem(YELLOW_DYE),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.YELLOW_CHRYSANTHEMUM)).criterion(FabricRecipeProvider.hasItem(ModBlocks.YELLOW_CHRYSANTHEMUM),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.YELLOW_CHRYSANTHEMUM)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "chrysanthemum_yellow_dye"));



        // Cockscombs
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, WHITE_DYE,1).input(ModBlocks.SILVER_COCKSCOMB).criterion(FabricRecipeProvider.hasItem(WHITE_DYE),
                FabricRecipeProvider.conditionsFromItem(WHITE_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SILVER_COCKSCOMB),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.SILVER_COCKSCOMB)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "cockscomb_white_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, PINK_DYE,1).input(ModBlocks.PINK_COCKSCOMB).criterion(FabricRecipeProvider.hasItem(PINK_DYE),
                FabricRecipeProvider.conditionsFromItem(PINK_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.PINK_CHRYSANTHEMUM),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.PINK_COCKSCOMB)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "cockscomb_pink_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, YELLOW_DYE,1).input(ModBlocks.YELLOW_COCKSCOMB).criterion(FabricRecipeProvider.hasItem(YELLOW_DYE),
                FabricRecipeProvider.conditionsFromItem(YELLOW_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.YELLOW_COCKSCOMB),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.YELLOW_COCKSCOMB)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "cockscomb_yellow_dye"));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, PURPLE_DYE,1).input(ModBlocks.PURPLE_COCKSCOMB).criterion(FabricRecipeProvider.hasItem(PURPLE_DYE),
                FabricRecipeProvider.conditionsFromItem(PURPLE_DYE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.PURPLE_COCKSCOMB),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.PURPLE_COCKSCOMB)).offerTo(exporter, Identifier.of(KawaFlora.MOD_ID, "cockscomb_purple_dye"));

        //


    }
}
