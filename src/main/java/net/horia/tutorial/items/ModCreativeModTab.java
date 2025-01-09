package net.horia.tutorial.items;

import net.horia.tutorial.TutorialMod;
import net.horia.tutorial.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Tutorial_Tab = CREATIVE_MODE_TAB.register("tutorial_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.Sapphire.get()))
                    .title(Component.translatable("creativetab"))
                    .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.Sapphire.get());
                            output.accept(ModItems.Raw_Sapphire.get());
                            output.accept(ModBlocks.SAPPHIRE_BLOCK.get());

                            output.accept(Items.ALLAY_SPAWN_EGG);

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}


