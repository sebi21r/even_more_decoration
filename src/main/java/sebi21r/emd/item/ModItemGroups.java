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
            .icon(() -> new ItemStack(ModItems.TEST)).entries((displayContext, entries) -> {
                entries.add(ModItems.TEST);

                entries.add(ModBlocks.CALCITE_BRICKS);

            }).build());



    public static void registerItemGroups() {

        EMD.LOGGER.info("Registering Item Groups for " + EMD.Mod_ID);

    }

}
