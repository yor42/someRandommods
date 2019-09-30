package RandomnessCollection.Util.handler;

import RandomnessCollection.entity.entityExusial;
import RandomnessCollection.entity.render.renderexusial;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraft.entity.Entity;


public class renderhandler {
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(entityExusial.class, new IRenderFactory<entityExusial>()
				{
					@Override
					public Render<? super entityExusial> createRenderFor(RenderManager manager)
					{
						return new renderexusial(manager);
					}
				});
	}
}
