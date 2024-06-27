package sebi21r.emd.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import sebi21r.emd.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        //Calcite
        addDrop(ModBlocks.CALCITE_BRICKS);
        addDrop(ModBlocks.POLISHED_CALCITE);
        addDrop(ModBlocks.CHISELED_CALCITE);
        addDrop(ModBlocks.CRACKED_CALCITE_BRICKS);
        addDrop(ModBlocks.CALCITE_TILES);
        addDrop(ModBlocks.CRACKED_CALCITE_TILES);

        //Andesite
        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_TILES);
        addDrop(ModBlocks.CHISELED_ANDESITE);
        addDrop(ModBlocks.SMOOTH_ANDESITE);
        addDrop(ModBlocks.MOSSY_ANDESITE_BRICKS);
        addDrop(ModBlocks.MOSSY_ANDESITE_TILES);

        //Granite
        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.GRANITE_TILES);
        addDrop(ModBlocks.CHISELED_GRANITE);
        addDrop(ModBlocks.SMOOTH_GRANITE);
        addDrop(ModBlocks.MOSSY_GRANITE_BRICKS);
        addDrop(ModBlocks.MOSSY_GRANITE_TILES);

        //Diorite
        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.DIORITE_TILES);
        addDrop(ModBlocks.CHISELED_DIORITE);
        addDrop(ModBlocks.SMOOTH_DIORITE);
        addDrop(ModBlocks.MOSSY_DIORITE_BRICKS);
        addDrop(ModBlocks.MOSSY_DIORITE_TILES);

        //Blackstone
        addDrop(ModBlocks.POLISHED_BLACKSTONE_TILES);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        addDrop(ModBlocks.SMOOTH_BLACKSTONE);
        addDrop(ModBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);

        //Deepslate
        addDrop(ModBlocks.SMOOTH_DEEPSLATE);
        addDrop(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
        addDrop(ModBlocks.MOSSY_DEEPSLATE_TILES);
        addDrop(ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        //Stone
        addDrop(ModBlocks.STONE_TILES);
        addDrop(ModBlocks.CRACKED_STONE_TILES);
        addDrop(ModBlocks.MOSSY_STONE_TILES);

        //Prismarine
        addDrop(ModBlocks.PRISMARINE_TILES);
        addDrop(ModBlocks.CHISELED_PRISMARINE);
        addDrop(ModBlocks.SMOOTH_PRISMARINE);
        addDrop(ModBlocks.CRACKED_PRISMARINE_TILES);
        addDrop(ModBlocks.CRACKED_PRISMARINE_BRICKS);

        //Quartz
        addDrop(ModBlocks.QUARTZ_TILES);
        addDrop(ModBlocks.CRACKED_QUARTZ_BRICKS);
        addDrop(ModBlocks.CRACKED_QUARTZ_TILES);
        addDrop(ModBlocks.CRACKED_QUARTZ_PILLAR);

        //Bricks
        addDrop(ModBlocks.MOSSY_BRICKS);
        addDrop(ModBlocks.CRACKED_BRICKS);
    }
}
