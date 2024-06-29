package org.siscode.kawaflora;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.siscode.kawaflora.block.ModBlocks;

public class AddToItemGroup {
    public static void registerItemGroups(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.BIRD_PARADISE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.FALSE_SHAMROCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.HIDRANGEA));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.WEIGELA));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.FORGETNOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.CLASSIC_ROSE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.CYAN_ROSE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.LEADWORT));

        // chrysanthemums

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.PINK_CHRYSANTHEMUM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.YELLOW_CHRYSANTHEMUM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.WHITE_CHRYSANTHEMUM));

        //cockscombs

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.PINK_COCKSCOMB));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.RED_COCKSCOMB));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.PURPLE_COCKSCOMB));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.YELLOW_COCKSCOMB));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(ModBlocks.SILVER_COCKSCOMB));
    }


    }
