package org.siscode.world.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import org.siscode.kawaflora.KawaFlora;
import org.siscode.kawaflora.block.ModBlocks;


import java.util.List;

public class ModPlacedFeatures {

    //chrysanthemums
    public static final RegistryKey<PlacedFeature> WHITE_CHRYSANTHEMUM_PLACED = registerKey("white_chrysanthemum_placed");

    public static final RegistryKey<PlacedFeature> PINK_CHRYSANTHEMUM_PLACED = registerKey("pink_chrysanthemum_placed");

    public static final RegistryKey<PlacedFeature> YELLOW_CHRYSANTHEMUM_PLACED = registerKey("yellow_chrysanthemum_placed");
    // cockscombs
    public static final RegistryKey<PlacedFeature> YELLOW_COCKSCOMB_PLACED = registerKey("yellow_cockscomb_placed");

    public static final RegistryKey<PlacedFeature> RED_COCKSCOMB_PLACED = registerKey("red_cockscomb_placed");

    public static final RegistryKey<PlacedFeature> PURPLE_COCKSCOMB_PLACED = registerKey("purple_cockscomb_placed");

    public static final RegistryKey<PlacedFeature> PINK_COCKSCOMB_PLACED = registerKey("pink_cockscomb_placed");

    public static final RegistryKey<PlacedFeature> SILVER_COCKSCOMB_PLACED = registerKey("silver_cockscomb_placed");
// misc
    public static final RegistryKey<PlacedFeature> FORGETNOT_PLACED = registerKey("forget_me_not_placed");

    public static final RegistryKey<PlacedFeature> LEADWORT_PLACED = registerKey("leadwort_placed");

    public static final RegistryKey<PlacedFeature> CYAN_ROSE_PLACED = registerKey("cyan_rose_placed");

    public static final RegistryKey<PlacedFeature> CLASSIC_ROSE_PLACED = registerKey("classic_rose_placed");

    public static final RegistryKey<PlacedFeature> WEIGELA_PLACED = registerKey("weigela_placed");

    public static final RegistryKey<PlacedFeature> HIDRANGEA_PLACED = registerKey("hidrangea_placed");

    public static final RegistryKey<PlacedFeature> FALSE_SHAMROCK_PLACED = registerKey("false_shamrock_placed");

    public static final RegistryKey<PlacedFeature> BIRD_PARADISE_PLACED = registerKey("bird_paradise_placed");




    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, WHITE_CHRYSANTHEMUM_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_CHRYSANTHEMUM),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.WHITE_CHRYSANTHEMUM));

        register(context, YELLOW_CHRYSANTHEMUM_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_CHRYSANTHEMUM),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.YELLOW_CHRYSANTHEMUM));

        register(context, PINK_CHRYSANTHEMUM_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_CHRYSANTHEMUM),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.PINK_CHRYSANTHEMUM));

        register(context, YELLOW_COCKSCOMB_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_COCKSCOMB),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.YELLOW_COCKSCOMB));

        register(context, RED_COCKSCOMB_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_COCKSCOMB),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.RED_COCKSCOMB));

        register(context, PURPLE_COCKSCOMB_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_COCKSCOMB),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.PURPLE_COCKSCOMB));

        register(context, PINK_COCKSCOMB_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_COCKSCOMB),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.PINK_COCKSCOMB));

        register(context, SILVER_COCKSCOMB_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_COCKSCOMB),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(32), ModBlocks.SILVER_COCKSCOMB));

        register(context, FORGETNOT_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FORGETNOT),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(32), ModBlocks.FORGETNOT));

        register(context, LEADWORT_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEADWORT),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(32), ModBlocks.LEADWORT));

        register(context, CYAN_ROSE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CYAN_ROSE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(16), ModBlocks.CYAN_ROSE));

        register(context, CLASSIC_ROSE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CLASSIC_ROSE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(16), ModBlocks.CLASSIC_ROSE));

        register(context, FALSE_SHAMROCK_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FALSE_SHAMROCK),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(12), ModBlocks.FALSE_SHAMROCK));

        register(context, BIRD_PARADISE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BIRD_PARADISE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.BIRD_PARADISE));

        register(context, HIDRANGEA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HIDRANGEA),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.HIDRANGEA));

        register(context, WEIGELA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WEIGELA),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(64), ModBlocks.WEIGELA));


    }

    public static List<PlacementModifier> makePatchPlacements(PlacementModifier countOrRarity) {
        return List.of(countOrRarity, SquarePlacementModifier.of(), PlacedFeatures.FOUR_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(KawaFlora.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}