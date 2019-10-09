package arkraft.Init;

import java.util.Set;
import com.google.common.collect.ImmutableSet;

import arkraft.Util.Defined;
import arkraft.entity.entityExusial;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

public class entityinit
{
private static int modEntityId = 0;
	
	public static final Set<EntityEntry> Entities = ImmutableSet.of(
//			createEntityEntry("example", Entity.class, bodyDarkestColor, spotsLightestColor),
			createEntityEntry("Exusial", entityExusial.class, 0x662c3d, 0xa9485b)
	);
	
	private static <T extends Entity> EntityEntry createEntityEntry(String name, Class<T> cls, int primaryColorIn, int secondaryColorIn) {
		return createEntityEntry(name, cls, primaryColorIn, secondaryColorIn, true);
	}
	
	private static <T extends Entity> EntityEntry createEntityEntry(String name, Class<T> cls, int primaryColorIn, int secondaryColorIn, boolean sendVelocityUpdates) {
		EntityEntryBuilder<T> builder = EntityEntryBuilder.create();
		builder.entity(cls);
		builder.name(Defined.ID + "." + name);
		builder.id(new ResourceLocation(Defined.ID, name), modEntityId++);
		builder.tracker(64, 3, sendVelocityUpdates);
		builder.egg(primaryColorIn, secondaryColorIn);
		return builder.build();
	}
	
	@Mod.EventBusSubscriber(modid = Defined.ID)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityEntry> event) {
			IForgeRegistry<EntityEntry> registry = event.getRegistry();

			for (EntityEntry entry : Entities) {
				registry.register(entry);
			}

		}
	}
}
