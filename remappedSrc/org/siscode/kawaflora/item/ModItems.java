package org.siscode.kawaflora.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.siscode.kawaflora.KawaFlora;
import org.siscode.kawaflora.block.ModBlocks;



public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KawaFlora.MOD_ID, name), item);
    }
    public static void addToItemGroup(FabricItemGroupEntries entries){
        entries.add(ModBlocks.CLASSIC_ROSE);
    }
    public static void registerModItems(){
        KawaFlora.LOGGER.info("Registering mod items for " + KawaFlora.MOD_ID + "...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addToItemGroup);
    }
}
