package sebi21r.emd.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sebi21r.emd.EMD;
import sebi21r.emd.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup EVEN_MORE_DECORATION_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(EMD.Mod_ID,
            "even_more_decoration_group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.even_more_decoration_group"))
            .icon(() -> new ItemStack(ModBlocks.CALCITE_BRICKS)).entries((displayContext, entries) -> {
                entries.add(ModItems.TEST);
                entries.add(ModItems.ROCK);

                //Calcite
                entries.add(ModBlocks.CALCITE_BRICKS);
                entries.add(ModBlocks.POLISHED_CALCITE);
                entries.add(ModBlocks.CHISELED_CALCITE);
                entries.add(ModBlocks.CRACKED_CALCITE_BRICKS);
                entries.add(ModBlocks.CALCITE_TILES);
                entries.add(ModBlocks.CRACKED_CALCITE_TILES);

                //Andesite
                entries.add(ModBlocks.ANDESITE_BRICKS);
                entries.add(ModBlocks.ANDESITE_TILES);
                entries.add(ModBlocks.CHISELED_ANDESITE);
                entries.add(ModBlocks.SMOOTH_ANDESITE);
                entries.add(ModBlocks.MOSSY_ANDESITE_BRICKS);
                entries.add(ModBlocks.MOSSY_ANDESITE_TILES);

                //Granite
                entries.add(ModBlocks.GRANITE_BRICKS);
                entries.add(ModBlocks.GRANITE_TILES);
                entries.add(ModBlocks.CHISELED_GRANITE);
                entries.add(ModBlocks.SMOOTH_GRANITE);
                entries.add(ModBlocks.MOSSY_GRANITE_BRICKS);
                entries.add(ModBlocks.MOSSY_GRANITE_TILES);

                //Diorite
                entries.add(ModBlocks.DIORITE_BRICKS);
                entries.add(ModBlocks.DIORITE_TILES);
                entries.add(ModBlocks.CHISELED_DIORITE);
                entries.add(ModBlocks.SMOOTH_DIORITE);
                entries.add(ModBlocks.MOSSY_DIORITE_BRICKS);
                entries.add(ModBlocks.MOSSY_DIORITE_TILES);

                //Blackstone
                entries.add(ModBlocks.POLISHED_BLACKSTONE_TILES);
                entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
                entries.add(ModBlocks.SMOOTH_BLACKSTONE);
                entries.add(ModBlocks.MOSSY_POLISHED_BLACKSTONE_TILES);

                //Deepslate
                entries.add(ModBlocks.SMOOTH_DEEPSLATE);
                entries.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
                entries.add(ModBlocks.MOSSY_DEEPSLATE_TILES);
                entries.add(ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                //Stone
                entries.add(ModBlocks.STONE_TILES);
                entries.add(ModBlocks.CRACKED_STONE_TILES);
                entries.add(ModBlocks.MOSSY_STONE_TILES);



            }).build());



    public static void registerItemGroups() {

        EMD.LOGGER.info("Registering Item Groups for " + EMD.Mod_ID);

    }

}
