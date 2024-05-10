package sebi21r.emd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import sebi21r.emd.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CALCITE_BRICKS)
                .add(ModBlocks.POLISHED_CALCITE)
                .add(ModBlocks.CHISELED_CALCITE)
                .add(ModBlocks.CRACKED_CALCITE_BRICKS)
                .add(ModBlocks.CALCITE_TILES)
                .add(ModBlocks.CRACKED_CALCITE_TILES)
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_TILES)
                .add(ModBlocks.CHISELED_ANDESITE)
                .add(ModBlocks.SMOOTH_ANDESITE)
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.GRANITE_TILES)
                .add(ModBlocks.CHISELED_GRANITE)
                .add(ModBlocks.SMOOTH_GRANITE)
                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.DIORITE_TILES)
                .add(ModBlocks.CHISELED_DIORITE)
                .add(ModBlocks.SMOOTH_DIORITE)
                .add(ModBlocks.POLISHED_BLACKSTONE_TILES)
                .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
    }
}
