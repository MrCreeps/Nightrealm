package mrcreeps.mods.nightrealm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import mrcreeps.mods.nightrealm.world.BloodrainDebugGameRule;
import mrcreeps.mods.nightrealm.NightrealmModVariables;
import mrcreeps.mods.nightrealm.NightrealmMod;

import java.util.stream.Stream;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class BloodRainEventEffectProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NightrealmMod.LOGGER.warn("Failed to load dependency world for procedure BloodRainEventEffect!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NightrealmMod.LOGGER.warn("Failed to load dependency x for procedure BloodRainEventEffect!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NightrealmMod.LOGGER.warn("Failed to load dependency y for procedure BloodRainEventEffect!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NightrealmMod.LOGGER.warn("Failed to load dependency z for procedure BloodRainEventEffect!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NightrealmMod.LOGGER.warn("Failed to load dependency entity for procedure BloodRainEventEffect!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double eventTimeTotal = 0;
		if ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NightrealmModVariables.PlayerVariables())).eventOngoing == false) {
			{
				double _setval = ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeTotal + 1);
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventTimeTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NightrealmModVariables.PlayerVariables())).eventTimer + 1);
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NightrealmModVariables.PlayerVariables())).eventTimer >= 120) {
				{
					double _setval = 0;
					entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.eventTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (MathHelper.nextInt(new Random(), 1, 100) == 25) {
					{
						boolean _setval = (true);
						entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.eventOngoing = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world.getWorldInfo().getGameRulesInstance().getBoolean(BloodrainDebugGameRule.gamerule) == true) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(
									new StringTextComponent(((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeTotal + " Ticks Between Events")),
									(false));
						}
					}
					{
						double _setval = 0;
						entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.eventTimeTotal = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(
								new StringTextComponent("\u00A74Blood starts to drop from the sky and it seems to follow you..."), (false));
					}
				}
			}
		} else {
			{
				double _setval = ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeReset + 1);
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventTimeReset = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeReset >= 20) {
				{
					double _setval = ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeTotal + 1);
					entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.eventTimeTotal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.eventTimeReset = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				SummonBlooddropProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity),
								new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			{
				double _setval = ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NightrealmModVariables.PlayerVariables())).eventDelay + 1);
				entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.eventDelay = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NightrealmModVariables.PlayerVariables())).eventDelay >= 200) {
				{
					double _setval = ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NightrealmModVariables.PlayerVariables())).eventTimer + 1);
					entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.eventTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NightrealmModVariables.PlayerVariables())).eventTimer >= 100) {
					{
						double _setval = 0;
						entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.eventTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (MathHelper.nextInt(new Random(), 1, 3) == 1 || (entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeTotal >= 60) {
						{
							boolean _setval = (false);
							entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.eventOngoing = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.eventDelay = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74The blood rain ceases abruptly..."), (false));
						}
						if (world.getWorldInfo().getGameRulesInstance().getBoolean(BloodrainDebugGameRule.gamerule) == true) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity)
										.sendStatusMessage(new StringTextComponent(("Event Blood Rain Lasted "
												+ (entity.getCapability(NightrealmModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new NightrealmModVariables.PlayerVariables())).eventTimeTotal
												+ " Cycles (Nearly a Second)")), (false));
							}
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
		}
	}
}
