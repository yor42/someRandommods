package arkraft.entity.model.projectile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Bullet - yor42
 * Created using Tabula 7.0.1
 */
public class modelBullet extends ModelBase {
    public ModelRenderer shape1;

    public modelBullet() {
        this.textureWidth = 8;
        this.textureHeight = 8;
        this.shape1 = new ModelRenderer(this, 1, 2);
        this.shape1.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.shape1.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
