package org.siscode.kawaflora;

import net.fabricmc.api.ModInitializer;
import org.siscode.kawaflora.block.ModBlocks;
import org.siscode.kawaflora.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KawaFlora implements ModInitializer {
    public static final String MOD_ID = "kawaflora";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        LOGGER.info("Flowers added to enrich your mc world!");
    }
}
