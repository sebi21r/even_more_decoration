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

                //Calcite
                .add(ModBlocks.CALCITE_BRICKS)
                .add(ModBlocks.POLISHED_CALCITE)
                .add(ModBlocks.CHISELED_CALCITE)
                .add(ModBlocks.CRACKED_CALCITE_BRICKS)
                .add(ModBlocks.CALCITE_TILES)
                .add(ModBlocks.CRACKED_CALCITE_TILES)

                //Andesite
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_TILES)
                .add(ModBlocks.CHISELED_ANDESITE)
                .add(ModBlocks.SMOOTH_ANDESITE)
                .add(ModBlocks.MOSSY_ANDESITE_BRICKS)
                .add(ModBlocks.MOSSY_ANDESITE_TILES)

                //Granite
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.GRANITE_TILES)
                .add(ModBlocks.CHISELED_GRANITE)
                .add(ModBlocks.SMOOTH_GRANITE)
                .add(ModBlocks.MOSSY_GRANITE_BRICKS)
                .add(ModBlocks.MOSSY_GRANITE_TILES)

                //Diorite
                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.DIORITE_TILES)
                .add(ModBlocks.CHISELED_DIORITE)
                .add(ModBlocks.SMOOTH_DIORITE)
                .add(ModBlocks.MOSSY_DIORITE_BRICKS)
                .add(ModBlocks.MOSSY_DIORITE_TILES)

                //Blackstone
                .add(ModBlocks.POLISHED_BLACKSTONE_TILES)
                .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES)
                .add(ModBlocks.SMOOTH_BLACKSTONE)
                .add(ModBlocks.MOSSY_POLISHED_BLACKSTONE_TILES)

                //Deepslate
                .add(ModBlocks.SMOOTH_DEEPSLATE)
                .add(ModBlocks.MOSSY_COBBLED_DEEPSLATE)
                .add(ModBlocks.MOSSY_DEEPSLATE_TILES)
                .add(ModBlocks.MOSSY_DEEPSLATE_BRICKS)

                //Stone
                .add(ModBlocks.STONE_TILES)
                .add(ModBlocks.CRACKED_STONE_TILES)
                .add(ModBlocks.MOSSY_STONE_TILES)

                //Prismarine
                .add(ModBlocks.PRISMARINE_TILES)
                .add(ModBlocks.CHISELED_PRISMARINE)
                .add(ModBlocks.SMOOTH_PRISMARINE)
                .add(ModBlocks.CRACKED_PRISMARINE_TILES)
                .add(ModBlocks.CRACKED_PRISMARINE_BRICKS)

                //Quartz
                .add(ModBlocks.QUARTZ_TILES)
                .add(ModBlocks.CRACKED_QUARTZ_BRICKS)
                .add(ModBlocks.CRACKED_QUARTZ_TILES)
                .add(ModBlocks.CRACKED_QUARTZ_PILLAR)

                //Bricks
                .add(ModBlocks.MOSSY_BRICKS)
                .add(ModBlocks.CRACKED_BRICKS)

                 //Oak
                .add(ModBlocks.OAK_MOSAIC)

                //Spruce
                .add(ModBlocks.SPRUCE_MOSAIC)

                //Birch
                .add(ModBlocks.BIRCH_MOSAIC)

                //Dark Oak
                .add(ModBlocks.DARK_OAK_MOSAIC)

                //Acacia
                .add(ModBlocks.ACACIA_MOSAIC)

                //Jungle
                .add(ModBlocks.JUNGLE_MOSAIC)

                //Cherry
                .add(ModBlocks.CHERRY_MOSAIC)

                //Mangrove
                .add(ModBlocks.MANGROVE_MOSAIC)

                //Crimson
                .add(ModBlocks.CRIMSON_MOSAIC)

                //Warped
                .add(ModBlocks.WARPED_MOSAIC)


            //End

            ;
    }
}
