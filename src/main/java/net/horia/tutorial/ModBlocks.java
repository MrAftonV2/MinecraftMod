import net.horia.tutorial.TutorialMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks{
    public static final DefferedRegister<Block> Blocks = 
        DefferedRegister.create(ForgeRegistries.BLOCKS, TutorialMod.Mod_ID);
    
    
    public static final <T expects Blocks> 
    
    public static void register(IEventBus eventBus){
        Blocks.register(eventBus);
    }
} 
