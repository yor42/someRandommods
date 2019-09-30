package RandomnessCollection;

import RandomnessCollection.Util.Defined;
import RandomnessCollection.Util.handler.registryhandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import RandomnessCollection.proxy.CommonProxy;

@Mod(modid=Defined.ID, name=Defined.Name,version=Defined.Name )
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide=Defined.Client, serverSide=Defined.Common)
	public static CommonProxy proxy;
	
	@EventHandler
    public static void preInit(FMLPreInitializationEvent event) 
    {
        registryhandler.PreInitRegistries();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) 
    {
       // registryhandler.initRegistries();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) 
    {

    }

} 
