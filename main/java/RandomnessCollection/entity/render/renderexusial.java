package RandomnessCollection.entity.render;

import RandomnessCollection.Util.Defined;
import RandomnessCollection.entity.entityExusial;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import RandomnessCollection.entity.model.modelExusial;

public class renderexusial extends RenderLiving<EntityLiving>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Defined.ID + ":textures/entity/exusial.png");
	
	public renderexusial(RenderManager manager) {
		super(manager, new modelExusial(), 0.5F);
		// TODO Auto-generated constructor stub
	}
	
	protected void applyRotations(entityExusial entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return TEXTURES;
	}

}
