package org.siscode.kawaflora;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.siscode.kawaflora.block.ModBlocks;

public class KawaFloraClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLASSIC_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CYAN_ROSE, RenderLayer.getCutout());

        //CHRYSANTHEMUMS
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLASSIC_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLASSIC_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_CHRYSANTHEMUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WHITE_CHRYSANTHEMUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLASSIC_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ROSE, RenderLayer.getCutout());
        //

        //COCKSCOMBS
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RED_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_YELLOW_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PURPLE_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SILVER_COCKSCOMB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SILVER_COCKSCOMB, RenderLayer.getCutout());
        //

        //MISC
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEADWORT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FORGETNOT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRD_PARADISE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BIRD_PARADISE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FALSE_SHAMROCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FALSE_SHAMROCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEIGELA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WEIGELA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HIDRANGEA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_HIDRANGEA, RenderLayer.getCutout());
    }
}