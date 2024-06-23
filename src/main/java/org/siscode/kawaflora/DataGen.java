package org.siscode.kawaflora;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.siscode.kawaflora.datagen.*;

public class DataGen implements DataGeneratorEntrypoint{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator){
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    pack.addProvider((MBlockTagProvider::new));
    pack.addProvider(MRecipeProvider::new);
    pack.addProvider((MModelProvider::new));
    pack.addProvider(MLootTableProvider::new);
    pack.addProvider(MItemTagProvider::new);

    }
}
