package org.siscode.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import org.siscode.world.feature.ModPlacedFeatures;

public class ModGenerateFlowers {
    public static void generateFlower(){

        //CHRYSANTHEMUMS
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,BiomeKeys.OLD_GROWTH_PINE_TAIGA,BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.PINK_CHRYSANTHEMUM_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,BiomeKeys.OLD_GROWTH_PINE_TAIGA,BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.WHITE_CHRYSANTHEMUM_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,BiomeKeys.OLD_GROWTH_PINE_TAIGA,BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,BiomeKeys.FLOWER_FOREST ),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.YELLOW_CHRYSANTHEMUM_PLACED);
        //COCKSCOMBS

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.SILVER_COCKSCOMB_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.PURPLE_COCKSCOMB_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.RED_COCKSCOMB_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.YELLOW_COCKSCOMB_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.PINK_COCKSCOMB_PLACED);


        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE,BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.FALSE_SHAMROCK_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA,BiomeKeys.SAVANNA_PLATEAU,BiomeKeys.WINDSWEPT_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.BIRD_PARADISE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA,BiomeKeys.SAVANNA_PLATEAU,BiomeKeys.SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.LEADWORT_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CLASSIC_ROSE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CYAN_ROSE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FORGETNOT_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,BiomeKeys.OLD_GROWTH_PINE_TAIGA,BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HIDRANGEA_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,BiomeKeys.OLD_GROWTH_PINE_TAIGA,BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,BiomeKeys.FLOWER_FOREST,BiomeKeys.FOREST,BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WEIGELA_PLACED);
    }
}
