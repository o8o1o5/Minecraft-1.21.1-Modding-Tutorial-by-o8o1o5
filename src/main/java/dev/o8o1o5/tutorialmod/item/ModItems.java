package dev.o8o1o5.tutorialmod.item;

import dev.o8o1o5.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);

    public static final DeferredItem<Item> GARNET = ITEMS.register("garnet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_GARNET = ITEMS.register("raw_garnet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
