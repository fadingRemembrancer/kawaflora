package org.siscode.kawaflora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import org.siscode.kawaflora.block.ModBlocks;


public class MModelProvider extends FabricModelProvider {
    public MModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /// CHRYSANTHEMUMS
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_CHRYSANTHEMUM, ModBlocks.POTTED_WHITE_CHRYSANTHEMUM,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_CHRYSANTHEMUM, ModBlocks.POTTED_PINK_CHRYSANTHEMUM,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_CHRYSANTHEMUM, ModBlocks.POTTED_YELLOW_CHRYSANTHEMUM,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        ///

        /// COCKSCOMBS
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_COCKSCOMB, ModBlocks.POTTED_RED_COCKSCOMB,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_COCKSCOMB, ModBlocks.POTTED_YELLOW_COCKSCOMB,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_COCKSCOMB, ModBlocks.POTTED_PURPLE_COCKSCOMB,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_COCKSCOMB, ModBlocks.POTTED_PINK_COCKSCOMB,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SILVER_COCKSCOMB, ModBlocks.POTTED_SILVER_COCKSCOMB,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        ///

        /// MISC
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BIRD_PARADISE, ModBlocks.POTTED_BIRD_PARADISE,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.FALSE_SHAMROCK, ModBlocks.POTTED_FALSE_SHAMROCK,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CLASSIC_ROSE, ModBlocks.POTTED_ROSE,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYAN_ROSE, ModBlocks.POTTED_CYAN_ROSE,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.HIDRANGEA, ModBlocks.POTTED_HIDRANGEA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WEIGELA, ModBlocks.POTTED_WEIGELA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.FORGETNOT,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LEADWORT,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        ///
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register();
    }
}
