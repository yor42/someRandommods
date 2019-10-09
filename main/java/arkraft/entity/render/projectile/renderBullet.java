package arkraft.entity.render.projectile;

import org.lwjgl.opengl.GL11;

import arkraft.Util.Defined;
import arkraft.entity.model.projectile.modelBullet;
import arkraft.entity.projectile.entityBullet;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class renderBullet extends Render<Entity> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Defined.ID + ":textures/entity/bullet.png");
	
	protected modelBullet model;
	
	public renderBullet(RenderManager renderManager) {
		super(renderManager);
		this.shadowSize = 0.25F;
	}

	
	public void render(entityBullet bullet, double x, double y, double z, float entityYaw, float partialTicks) {
		bindEntityTexture(bullet);
		GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);

        float f7 = bullet.prevRotationPitch + (bullet.rotationPitch - bullet.prevRotationPitch) * partialTicks;
        float f8 = this.handleRotationFloat(bullet, partialTicks);
        float f5 = 0.0F;
        float f6 = 0.0F;
		model = new modelBullet();
        model.render(bullet, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
	}
	
	@Override
    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
        render((entityBullet) entity, d, d1, d2, f, f1);
    }
	
	protected float handleRotationFloat(entityBullet bullet, float partialTicks)
    {
        return (float)bullet.ticksExisted + partialTicks;
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return TEXTURES;
	}

}
