package net.pj.meinterlink.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pj.meinterlink.MEInterlink;
import net.pj.meinterlink.block.ModBlocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MEInterlink.MOD_ID);
    public static final RegistryObject<CreativeModeTab> meinterlink_tab = CREATIVE_MODE_TABS.register("meinterlink_tab",
            ()-> CreativeModeTab.builder().icon(() ->  new ItemStack(ModItems.TEST_ITEM.get()))
                    .title(Component.translatable("creativetab.meinterlink_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TEST_ITEM.get());
                        pOutput.accept(ModBlocks.TEST_BLOCK.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
