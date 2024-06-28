package sebi21r.emd.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sebi21r.emd.EMD;

public class ModBlocks {

    /* Stone */

    //Calcite

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CHISELED_CALCITE = registerBlock("chiseled_calcite",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CRACKED_CALCITE_TILES = registerBlock("cracked_calcite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));

    //Andesite

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block ANDESITE_TILES = registerBlock("andesite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block SMOOTH_ANDESITE = registerBlock("smooth_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_TILES = registerBlock("mossy_andesite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));

    //Granite

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block GRANITE_TILES = registerBlock("granite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block CHISELED_GRANITE = registerBlock("chiseled_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block SMOOTH_GRANITE = registerBlock("smooth_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
    public static final Block MOSSY_GRANITE_TILES = registerBlock("mossy_granite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));

    //Diorite

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block CHISELED_DIORITE = registerBlock("chiseled_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block SMOOTH_DIORITE = registerBlock("smooth_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    public static final Block MOSSY_DIORITE_TILES = registerBlock("mossy_diorite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));

    //Blackstone

    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE)));
    public static final Block SMOOTH_BLACKSTONE = registerBlock("smooth_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE)));
    public static final Block MOSSY_POLISHED_BLACKSTONE_TILES = registerBlock("mossy_polished_blackstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    //Deepslate

    public static final Block SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE)));
    public static final Block MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE)));
    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE)));
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE)));

    //Stone

    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    //Prismarine

    public static final Block PRISMARINE_TILES = registerBlock("prismarine_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block CHISELED_PRISMARINE = registerBlock("chiseled_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block SMOOTH_PRISMARINE = registerBlock("smooth_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block CRACKED_PRISMARINE_TILES = registerBlock("cracked_prismarine_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));

    //Quartz

    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block CRACKED_QUARTZ_TILES = registerBlock("cracked_quartz_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block CRACKED_QUARTZ_PILLAR = registerBlock("cracked_quartz_pillar",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)));

    //Bricks

    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    /* Wood */

    //Oak

    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    //Spruce

    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));

    //Birch

    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));

    //Dark Oak

    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));

    //Acacia

    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));

    //Jungle

    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));

    //Cherry

    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));

    //Mangrove

    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));

    //Crimson

    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));

    //Warped

    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));

    //TO-DO





    private static Block registerBlock(String name, Block block) {

        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EMD.Mod_ID, name), block);

    }

    private static Item registerBlockItems(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(EMD.Mod_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }


    public static void registerModBlocks() {

        EMD.LOGGER.info("Registering Mod Blocks for " + EMD.Mod_ID);

    }

}
