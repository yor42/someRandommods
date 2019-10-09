package arkraft.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Exusial - yor42
 * Created using Tabula 7.0.1
 */
public class modelExusial extends ModelBase {
    public ModelRenderer BodyMain;
    public ModelRenderer Detail01;
    public ModelRenderer LeftUpperArm;
    public ModelRenderer RightUpperArm;
    public ModelRenderer Head;
    public ModelRenderer Waist;
    public ModelRenderer LeftWing;
    public ModelRenderer RightWing;
    public ModelRenderer Skirt;
    public ModelRenderer Detail2;
    public ModelRenderer LeftLowerArm;
    public ModelRenderer RightLowerArm;
    public ModelRenderer Halo;
    public ModelRenderer Hair1;
    public ModelRenderer LeftUpperLeg;
    public ModelRenderer RightUpperLeg;
    public ModelRenderer LeftLowerLeg;
    public ModelRenderer RightLowerLeg;

    public modelExusial() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 38, 34);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-3.5F, -7.0F, -3.5F, 7, 7, 7, 0.0F);
        this.Waist = new ModelRenderer(this, 1, 28);
        this.Waist.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Waist.addBox(-4.0F, 0.0F, -2.5F, 8, 3, 5, 0.0F);
        this.setRotateAngle(Waist, 0.0048686109406765096F, 0.0F, 0.0F);
        this.RightUpperLeg = new ModelRenderer(this, 1, 19);
        this.RightUpperLeg.setRotationPoint(-1.7F, 3.0F, 0.0F);
        this.RightUpperLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightUpperLeg, 0.0F, 0.0F, 0.005759586531581288F);
        this.RightUpperArm = new ModelRenderer(this, 1, 45);
        this.RightUpperArm.mirror = true;
        this.RightUpperArm.setRotationPoint(-4.5F, 1.5F, 0.0F);
        this.RightUpperArm.addBox(-2.0F, -1.5F, -1.5F, 3, 5, 3, 0.0F);
        this.Halo = new ModelRenderer(this, 6, 37);
        this.Halo.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Halo.addBox(-4.0F, -4.0F, -4.0F, 8, 0, 8, 0.0F);
        this.Hair1 = new ModelRenderer(this, 18, 1);
        this.Hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair1.addBox(-4.0F, -7.4F, -4.0F, 8, 8, 8, 0.0F);
        this.LeftUpperLeg = new ModelRenderer(this, 1, 19);
        this.LeftUpperLeg.mirror = true;
        this.LeftUpperLeg.setRotationPoint(1.7F, 3.0F, 0.0F);
        this.LeftUpperLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.LeftWing = new ModelRenderer(this, 51, 19);
        this.LeftWing.setRotationPoint(2.0F, 0.0F, 4.0F);
        this.LeftWing.addBox(0.0F, 0.0F, 0.0F, 6, 9, 0, 0.0F);
        this.setRotateAngle(LeftWing, 0.0F, -0.4363323129985824F, 0.0F);
        this.Detail2 = new ModelRenderer(this, 1, 54);
        this.Detail2.setRotationPoint(0.0F, 2.7F, 1.6F);
        this.Detail2.addBox(-3.5F, -1.0F, -1.3F, 7, 3, 1, 0.0F);
        this.setRotateAngle(Detail2, 0.8002334620394002F, 0.0F, 0.0F);
        this.LeftLowerLeg = new ModelRenderer(this, 14, 19);
        this.LeftLowerLeg.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.LeftLowerLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.RightLowerArm = new ModelRenderer(this, 14, 45);
        this.RightLowerArm.mirror = true;
        this.RightLowerArm.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.RightLowerArm.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightLowerArm, -0.20943951023931953F, 0.0F, 0.0F);
        this.RightWing = new ModelRenderer(this, 51, 9);
        this.RightWing.setRotationPoint(-2.0F, 0.0F, 4.0F);
        this.RightWing.addBox(-6.0F, 0.0F, 0.0F, 6, 9, 0, 0.0F);
        this.setRotateAngle(RightWing, 0.0F, 0.4363323129985824F, 0.0F);
        this.RightLowerLeg = new ModelRenderer(this, 14, 19);
        this.RightLowerLeg.setRotationPoint(-0.0F, 5.0F, 0.0F);
        this.RightLowerLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightLowerLeg, 0.0F, 0.0F, 0.013788101090755204F);
        this.LeftUpperArm = new ModelRenderer(this, 1, 45);
        this.LeftUpperArm.setRotationPoint(3.5F, 1.5F, 0.0F);
        this.LeftUpperArm.addBox(0.0F, -1.5F, -1.5F, 3, 5, 3, 0.0F);
        this.Detail01 = new ModelRenderer(this, 1, 59);
        this.Detail01.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Detail01.addBox(-3.5F, 0.0F, 0.0F, 7, 3, 1, 0.0F);
        this.setRotateAngle(Detail01, -0.22759093446006054F, 0.0076551851004748594F, 0.0F);
        this.Skirt = new ModelRenderer(this, 28, 24);
        this.Skirt.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Skirt.addBox(-4.0F, 0.0F, -2.5F, 8, 3, 5, 0.0F);
        this.setRotateAngle(Skirt, 0.004537856055185257F, 0.0F, 0.0F);
        this.BodyMain = new ModelRenderer(this, 20, 54);
        this.BodyMain.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.BodyMain.addBox(-3.5F, 0.0F, -2.0F, 7, 6, 4, 0.0F);
        this.LeftLowerArm = new ModelRenderer(this, 14, 45);
        this.LeftLowerArm.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.LeftLowerArm.addBox(0.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(LeftLowerArm, -0.20943951023931953F, 0.0F, 0.0F);
        this.BodyMain.addChild(this.Head);
        this.BodyMain.addChild(this.Waist);
        this.Waist.addChild(this.RightUpperLeg);
        this.BodyMain.addChild(this.RightUpperArm);
        this.Head.addChild(this.Halo);
        this.Head.addChild(this.Hair1);
        this.Waist.addChild(this.LeftUpperLeg);
        this.BodyMain.addChild(this.LeftWing);
        this.Detail01.addChild(this.Detail2);
        this.LeftUpperLeg.addChild(this.LeftLowerLeg);
        this.RightUpperArm.addChild(this.RightLowerArm);
        this.BodyMain.addChild(this.RightWing);
        this.RightUpperLeg.addChild(this.RightLowerLeg);
        this.BodyMain.addChild(this.LeftUpperArm);
        this.BodyMain.addChild(this.Detail01);
        this.BodyMain.addChild(this.Skirt);
        this.LeftUpperArm.addChild(this.LeftLowerArm);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BodyMain.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	
//well at least she could walk ya dum dum!
    	this.LeftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
//애니메이션이라니 어림도 없다 암! ARRRRMMMM!
    	this.LeftUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
    	this.RightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount;
    	
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    }
    
}
