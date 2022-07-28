package mrcreeps.mods.nightrealm.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import mrcreeps.mods.nightrealm.NightrealmModVariables;
import mrcreeps.mods.nightrealm.NightrealmMod;

import java.util.Map;

public class BloodRainCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NightrealmMod.LOGGER.warn("Failed to load dependency entity for procedure BloodRainCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NightrealmModVariables.PlayerVariables())).eventOngoing == false) {
			{
				boolean _setval = (true);
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventOngoing = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(
						new StringTextComponent(("" + (entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeTotal)),
						(false));
			}
			{
				double _setval = 0;
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventTimeTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = (false);
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventOngoing = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(
						new StringTextComponent(("" + (entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeTotal)),
						(false));
			}
			{
				double _setval = 0;
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventTimeTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
