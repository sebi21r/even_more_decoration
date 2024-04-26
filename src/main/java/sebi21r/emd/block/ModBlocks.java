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
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block ANDESITE_TILES = registerBlock("andesite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block SMOOTH_ANDESITE = registerBlock("smooth_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block GRANITE_TILES = registerBlock("granite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block CHISELED_GRANITE = registerBlock("chiseled_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block SMOOTH_GRANITE = registerBlock("smooth_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE)));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block CHISELED_DIORITE = registerBlock("chiseled_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block SMOOTH_DIORITE = registerBlock("smooth_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));



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
