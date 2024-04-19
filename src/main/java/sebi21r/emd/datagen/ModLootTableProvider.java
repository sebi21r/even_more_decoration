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
    }
}
