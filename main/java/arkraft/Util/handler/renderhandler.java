package arkraft.Util.handler;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import arkraft.entity.entityExusial;
import arkraft.entity.projectile.entityBullet;
import arkraft.entity.render.renderexusial;
import arkraft.entity.render.projectile.renderBullet;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;


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
		RenderingRegistry.registerEntityRenderingHandler(entityBullet.class,  new IRenderFactory<entityBullet>()
		{

			@Override
			public Render<? super entityBullet> createRenderFor(RenderManager manager)
			{
				return new renderBullet(manager);
			}
        });
	}
}
