package org.siscode.kawaflora;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import org.siscode.kawaflora.datagen.*;
import org.siscode.world.feature.ModConfiguredFeatures;
import org.siscode.world.feature.ModPlacedFeatures;

public class DataGen implements DataGeneratorEntrypoint{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator){
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    pack.addProvider((MBlockTagProvider::new));
    pack.addProvider(MRecipeProvider::new);
    pack.addProvider((MModelProvider::new));
    pack.addProvider(MLootTableProvider::new);
    pack.addProvider(MItemTagProvider::new);
    pack.addProvider(ModWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
