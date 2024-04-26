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
        addDrop(ModBlocks.CALCITE_BRICKS);
        addDrop(ModBlocks.POLISHED_CALCITE);
        addDrop(ModBlocks.CHISELED_CALCITE);
        addDrop(ModBlocks.CRACKED_CALCITE_BRICKS);
        addDrop(ModBlocks.CALCITE_TILES);
        addDrop(ModBlocks.CRACKED_CALCITE_TILES);
        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_TILES);
        addDrop(ModBlocks.CHISELED_ANDESITE);
        addDrop(ModBlocks.SMOOTH_ANDESITE);
        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.GRANITE_TILES);
        addDrop(ModBlocks.CHISELED_GRANITE);
        addDrop(ModBlocks.SMOOTH_GRANITE);
        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.DIORITE_TILES);
        addDrop(ModBlocks.CHISELED_DIORITE);
        addDrop(ModBlocks.SMOOTH_DIORITE);
    }
}
