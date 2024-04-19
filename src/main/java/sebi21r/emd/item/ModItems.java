package sebi21r.emd.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sebi21r.emd.EMD;

public class ModItems {

    public static final Item TEST = registerItem("test", new Item(new FabricItemSettings()));
    public static final Item ROCK = registerItem("rock", new Item(new FabricItemSettings()));


    private static void addItemsToItemGroup(FabricItemGroupEntries entries) {

        entries.add(TEST);

    }



    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(EMD.Mod_ID, name), item);

    }

    public static void registerModItems() {

        EMD.LOGGER.info("Registering Mod Items for " + EMD.Mod_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToItemGroup);

    }

}
