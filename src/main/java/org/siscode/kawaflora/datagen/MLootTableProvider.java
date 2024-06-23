package org.siscode.kawaflora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import org.siscode.kawaflora.block.ModBlocks;
public class MLootTableProvider extends FabricBlockLootTableProvider {
    public MLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CLASSIC_ROSE);
        addDrop(ModBlocks.CYAN_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_CYAN_ROSE);

    }

}