package RandomnessCollection.Util.handler;

import RandomnessCollection.Util.handler.renderhandler;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class registryhandler {

	public static void PreInitRegistries()
	{
		renderhandler.registerEntityRenders();
	}
}
