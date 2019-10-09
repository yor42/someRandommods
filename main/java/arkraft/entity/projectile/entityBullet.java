package arkraft.entity.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class entityBullet extends EntityTippedArrow {
	
	private int ticksInGround;
	
	public entityBullet(World worldIn) {
		super(worldIn);
		this.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
	}
	
	public void shoot(double x, double y, double z, float velocity, float inaccuracy)
    {
        float f = MathHelper.sqrt(x * x + y * y + z * z);
        x = x / (double)f;
        y = y / (double)f;
        z = z / (double)f;
        x = x + this.rand.nextGaussian() * 0.007499999832361937D * (double)inaccuracy;
        y = y + this.rand.nextGaussian() * 0.007499999832361937D * (double)inaccuracy;
        z = z + this.rand.nextGaussian() * 0.007499999832361937D * (double)inaccuracy;
        x = x * (double)velocity;
        y = y * (double)velocity;
        z = z * (double)velocity;
        this.motionX = x;
        this.motionY = y;
        this.motionZ = z;
        float f1 = MathHelper.sqrt(x * x + z * z);
        this.rotationYaw = (float)(MathHelper.atan2(x, z) * (180D / Math.PI));
        this.rotationPitch = (float)(MathHelper.atan2(y, (double)f1) * (180D / Math.PI));
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.ticksInGround = 0;
    }
	
	public entityBullet(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	public entityBullet(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		int x = (int) this.posX;
		int y = (int) this.posY;
		int z = (int) this.posZ;
		World world = this.world;
		Entity entity = (Entity) shootingEntity;
		if (this.inGround) {
			this.world.removeEntity(this);
		}
	}
}
