package dev.o8o1o5.tutorialmod.item;

import dev.o8o1o5.tutorialmod.TutorialMod;
import dev.o8o1o5.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MODID);

    public static final Supplier<CreativeModeTab> GARNET_ITEM_TAB =
            CREATIVE_MODE_TAB.register("garnet_item_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.GARNET.get()))
                            .title(Component.translatable("creative.tutorialmod.garnet_items"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.GARNET);
                                output.accept(ModItems.RAW_GARNET);
                            }).build());

    public static final Supplier<CreativeModeTab> GARNET_BLOCK_TAB =
            CREATIVE_MODE_TAB.register("garnet_block_tab",
                    () -> CreativeModeTab.builder()
                            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TutorialMod.MODID, "garnet_item_tab"))
                            .icon(() -> new ItemStack(ModItems.GARNET.get()))
                            .title(Component.translatable("creative.tutorialmod.garnet_blocks"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.GARNET_BLOCK);
                                output.accept(ModBlocks.GARNET_ORE);
                            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
