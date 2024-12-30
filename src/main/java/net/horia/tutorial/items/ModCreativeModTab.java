package net.horia.tutorial.items;

import net.horia.tutorial.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> Creative_Mode_Tabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Tutorial_Tab = Creative_Mode_Tabs.register("tutorial_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.Sapphire.get()))
                    .title(Component.translatable("creativetab.tutorial"))
                    .displayItems((displayParams, output) ->  {
                        output.accept(ModItems.Sapphire.get());
                        output.accept(ModItems.Raw_Sapphire.get());

                        output.accept(Items.OAK_LOG);
                    })

                    .build());

    public static void register(IEventBus eventBus){
        Creative_Mode_Tabs.register(eventBus);
    }
}
