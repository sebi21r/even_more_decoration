package sebi21r.emd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import sebi21r.emd.block.ModBlocks;
import sebi21r.emd.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //Calcite
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_CALCITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_CALCITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CALCITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CALCITE_TILES);

        //Andesite
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ANDESITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_ANDESITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ANDESITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ANDESITE_TILES);

        //Granite
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_GRANITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_GRANITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_GRANITE_TILES);

        //Diorite
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DIORITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_DIORITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DIORITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DIORITE_TILES);

        //Blackstone
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_BLACKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);

        //Deepslate
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DEEPSLATE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        //Stone
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_STONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_STONE_TILES);

        //Prismarine
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_PRISMARINE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_PRISMARINE_BRICKS);

        //Quartz
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_QUARTZ_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_QUARTZ_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_QUARTZ_PILLAR);

        //Bricks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BRICKS);

        //Oak
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_MOSAIC);

        //Spruce
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_MOSAIC);

        //Birch
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRCH_MOSAIC);

        //Dark Oak
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_MOSAIC);

        //Acacia
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_MOSAIC);

        //Jungle
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNGLE_MOSAIC);

        //Cherry
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHERRY_MOSAIC);

        //Mangrove
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGROVE_MOSAIC);

        //Crimson
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_MOSAIC);

        //Warped
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_MOSAIC);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROCK, Models.GENERATED);
    }
}
