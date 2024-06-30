package org.siscode.world.feature;

import net.minecraft.block.Block;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import org.siscode.kawaflora.KawaFlora;
import org.siscode.kawaflora.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_CHRYSANTHEMUM = registerKey("white_chrysanthemum_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_CHRYSANTHEMUM = registerKey("pink_chrysanthemum_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_CHRYSANTHEMUM  = registerKey("yellow_chrysanthemum_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_COCKSCOMB = registerKey("yellow_cockscomb_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_COCKSCOMB = registerKey("red_cockscomb_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_COCKSCOMB = registerKey("purple_cockscomb_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_COCKSCOMB = registerKey("pink_cockscomb_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_COCKSCOMB = registerKey("silver_cockscomb_flower");


    public static final RegistryKey<ConfiguredFeature<?, ?>> FORGETNOT = registerKey("forget_me_not_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LEADWORT = registerKey("leadwort_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CYAN_ROSE = registerKey("cyan_rose_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CLASSIC_ROSE = registerKey("classic_rose_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> FALSE_SHAMROCK = registerKey("false_shamrock_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BIRD_PARADISE = registerKey("bird_paradise_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> WEIGELA = registerKey("weigela_flower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> HIDRANGEA = registerKey("hidrangea_flower");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, BIRD_PARADISE, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BIRD_PARADISE)))
        ));

        register(context, FALSE_SHAMROCK, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FALSE_SHAMROCK)))
        ));

        register(context, HIDRANGEA, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HIDRANGEA)))
        ));

        register(context, WEIGELA, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WEIGELA)))
        ));

        register(context, FORGETNOT, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FORGETNOT)))
        ));

        register(context, LEADWORT, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LEADWORT)))
        ));

        register(context, CLASSIC_ROSE, Feature.FLOWER, new RandomPatchFeatureConfig(
                64, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CLASSIC_ROSE)))
        ));

        register(context, CYAN_ROSE, Feature.FLOWER, new RandomPatchFeatureConfig(
                64, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CYAN_ROSE)))
        ));

        register(context, SILVER_COCKSCOMB, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SILVER_COCKSCOMB)))
        ));

        register(context, PURPLE_COCKSCOMB, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_COCKSCOMB)))
        ));

        register(context, PINK_COCKSCOMB, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_COCKSCOMB)))
        ));

        register(context, RED_COCKSCOMB, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_COCKSCOMB)))
        ));

        register(context, YELLOW_COCKSCOMB, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_COCKSCOMB)))
        ));

        register(context, YELLOW_CHRYSANTHEMUM, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_CHRYSANTHEMUM)))
        ));

        register(context, PINK_CHRYSANTHEMUM, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_CHRYSANTHEMUM)))
        ));

        register(context, WHITE_CHRYSANTHEMUM, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 20, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_CHRYSANTHEMUM)))
        ));

    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(Block block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(block))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(KawaFlora.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
