package org.siscode.kawaflora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import org.siscode.kawaflora.block.ModBlocks;


public class MLootTableProvider extends FabricBlockLootTableProvider {
    public MLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        //
        addDrop(ModBlocks.RED_COCKSCOMB);
        addDrop(ModBlocks.PURPLE_COCKSCOMB);
        addDrop(ModBlocks.PINK_COCKSCOMB);
        addDrop(ModBlocks.SILVER_COCKSCOMB);
        addDrop(ModBlocks.WEIGELA);
        addDrop(ModBlocks.HIDRANGEA);
        //
        addDrop(ModBlocks.PINK_CHRYSANTHEMUM);
        addDrop(ModBlocks.YELLOW_CHRYSANTHEMUM);
        addDrop(ModBlocks.WHITE_CHRYSANTHEMUM);
        addDrop(ModBlocks.SILVER_COCKSCOMB);
        //
        addDrop(ModBlocks.BIRD_PARADISE);
        addDrop(ModBlocks.FALSE_SHAMROCK);
        addDrop(ModBlocks.WHITE_CHRYSANTHEMUM);
        addDrop(ModBlocks.SILVER_COCKSCOMB);
        //
        addPottedPlantDrops(ModBlocks.POTTED_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_CYAN_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_BIRD_PARADISE);
        addPottedPlantDrops(ModBlocks.POTTED_FALSE_SHAMROCK);
        addPottedPlantDrops(ModBlocks.POTTED_WEIGELA);
        addPottedPlantDrops(ModBlocks.POTTED_HIDRANGEA);
        //
        addPottedPlantDrops(ModBlocks.POTTED_WHITE_CHRYSANTHEMUM);
        addPottedPlantDrops(ModBlocks.POTTED_PINK_CHRYSANTHEMUM);
        addPottedPlantDrops(ModBlocks.POTTED_YELLOW_CHRYSANTHEMUM);
        //
        addPottedPlantDrops(ModBlocks.POTTED_YELLOW_COCKSCOMB);
        addPottedPlantDrops(ModBlocks.POTTED_RED_COCKSCOMB);
        addPottedPlantDrops(ModBlocks.POTTED_PINK_COCKSCOMB);
        addPottedPlantDrops(ModBlocks.POTTED_SILVER_COCKSCOMB);


    }

}